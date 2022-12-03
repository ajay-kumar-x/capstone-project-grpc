package com.goconsult.service;

import com.goconsult.grpc.Auth;

import java.sql.*;

public class DbHelper {

     final static  String URL="jdbc:postgresql://localhost:5432/capstone";
     final static String USERNAME="root";
     final static String PASSWORD="root";

    public static String registerUSer(Auth.registrationDetail request){

        String user_type=request.getUserType().trim();
        String email=request.getEmail().trim();
        String password=request.getPassword().trim();
        String name=request.getName().trim();

        String contact=request.getContact().trim();
        String address=request.getAddress().trim();
        Date dob=null;
        if(request.getDob().trim().length()!=0) {
            try {
                dob = Date.valueOf(request.getDob());
            } catch (Exception e) {
                return "Invalid Date";
            }
        }
        String gender = request.getGender().trim();


        String occupation=request.getOccupation().trim(); //for user

        String specialization = request.getSpecialization().trim(); //for counselor
        int experience = request.getExperience();   //for counselor
        int fees = request.getFees();  //for counselor



         try(Connection conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);){
             if(conn!=null){
                 Statement stmt=conn.createStatement();
                     stmt.execute("create table if not exists USERDATA( user_id int primary key generated always as identity (START WITH 100),email varchar(30) NOT NULL UNIQUE, password varchar(20) NOT NULL, user_name varchar(50) not null, contact varchar(10), address varchar(50), dob date , gender varchar(10), occupation varchar(20) ); " );
                     stmt.execute("create table if not exists COUNSELOR( counselor_id int primary key generated always as identity (START WITH 200),email varchar(30) NOT NULL UNIQUE, password varchar(20) NOT NULL, counselor_name varchar(50) not null, contact varchar(20) , address varchar(50) ,dob date , gender varchar(10), specialization varchar(50) , experience int ,fees int );");

                 //checking if email is already registered or not
                 if(emailPresentInDb(email))   return "Email already registered";

                 PreparedStatement ps=null;
                 ResultSet rs=null;
                 if(user_type.equals("user")){
                      ps = conn.prepareStatement("insert into USERDATA (email,password,user_name,contact,address,dob,gender,occupation)" +
                             " values(?,?,?,?,?,?,?,?)");
                      ps.setString(1,email);
                      ps.setString(2,password);
                      ps.setString(3,name);
                      ps.setString(4,contact);
                      ps.setString(5,address);
                      ps.setDate(6,dob);
                      ps.setString(7,gender);
                      ps.setString(8,occupation);
                      ps.executeUpdate();
                      ps=conn.prepareStatement("select user_id from USERDATA where email=?");
                      ps.setString(1,email);

                      rs=ps.executeQuery();
                      rs.next();
                     return  String.valueOf(rs.getInt(1));
                 }else if(user_type.equals("counselor")){

                     ps = conn.prepareStatement("insert into COUNSELOR (email,password,counselor_name,contact,address,dob,gender,specialization,experience,fees)" +
                             "values(?,?,?,?,?,?,?,?,?,?)");
                     ps.setString(1,email);
                     ps.setString(2,password);
                     ps.setString(3,name);
                     ps.setString(4,contact);
                     ps.setString(5,address);
                     ps.setDate(6,dob);
                     ps.setString(7,gender);
                     ps.setString(8,specialization);
                     ps.setInt(9,experience);
                     ps.setInt(10,fees);
                     ps.executeUpdate();
                     ps=conn.prepareStatement("select counselor_id from COUNSELOR where email=?");
                     ps.setString(1,email);
                     rs=ps.executeQuery();
                     rs.next();
                     return  String.valueOf(rs.getInt(1));

                 }



             }else System.err.println("Failed to make Connection");
         }
         catch (SQLException e){
             System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
             String error=e.getMessage();
                  return e.getMessage();
         }
        return "Something Went Wrong!";
    }



    public static Object ifUserValidThenReturnUserTypeID(Auth.credential request){

        String email=request.getEmail().trim();
        String password=request.getPassword().trim();

        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);){
            if(conn!=null){
                PreparedStatement psu=conn.prepareStatement("select user_id from USERDATA where email=? and password=?;");
                PreparedStatement psc=conn.prepareStatement("select counselor_id from COUNSELOR where email=? and password=?;");
                psu.setString(1,email);psu.setString(2,password);
                psc.setString(1,email);psc.setString(2,password);

                ResultSet rsu= psu.executeQuery();
                ResultSet rsc= psc.executeQuery();

               if(rsu.next())
                   return "user "+ rsu.getInt(1);
               else if(rsc.next())
                   return "counselor "+ rsc.getInt(1);
                else return false;
            }
            else{ System.out.println("Failed to make Connection");}
        }catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }

        return false;
    }




    public static boolean emailPresentInDb(String email){
        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            if(conn!=null){
                PreparedStatement ps=conn.prepareStatement("select email from userdata where email=? union all select email from counselor where email=?");
                ps.setString(1,email);
                ps.setString(2,email);
                ResultSet rs=ps.executeQuery();
                return rs.next();

            }else{
                System.err.format("Failed to make Connection");
            }
        }
        catch (SQLException e){
            System.err.format(e.getMessage());
        }
        return false;
    }



    public static int updatePassword(String email,String password){
        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            if(conn!=null){
                PreparedStatement psu=conn.prepareStatement("UPDATE  USERDATA set password=? where email=?");
                PreparedStatement psc=conn.prepareStatement("UPDATE  COUNSELOR set password=? where email=?");
                psu.setString(1,password);
                psu.setString(2,email);
                psc.setString(1,password);
                psc.setString(2,email);
                return psu.executeUpdate()+psc.executeUpdate();
            }
            else System.err.println("Failed to make connection!");
        }catch (SQLException e){
            System.err.format("Something went wrong!");
        }
     return 0;
    }


}
