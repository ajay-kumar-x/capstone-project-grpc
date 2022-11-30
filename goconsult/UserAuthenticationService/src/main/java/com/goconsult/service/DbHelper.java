package com.goconsult.service;

import com.goconsult.grpc.Auth;

import java.sql.*;

public class DbHelper {

     final static  String URL="jdbc:postgresql://localhost:5432/capstone";
     final static String USERNAME="root";
     final static String PASSWORD="root";

    public static String registerUSer(Auth.user request){
        String user_type=request.getUserType().trim();
        String email=request.getEmail().trim();
        String password=request.getPassword().trim();

         try(Connection conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);){
             if(conn!=null){
                 Statement stmt=conn.createStatement();
                 stmt.execute("create table if not exists AUTH(uid int primary key generated always as identity (START WITH 100), user_type varchar(10) not null,email varchar(50) not null unique, password varchar(20) not null);");

                 PreparedStatement ps=conn.prepareStatement("insert into AUTH (user_type,email,password) values(?,?,?)");
                 ps.setString(1,user_type);
                 ps.setString(2,email);
                 ps.setString(3,password);
                 ps.executeUpdate();

                PreparedStatement ps2=conn.prepareStatement("select uid from AUTH where email=?");
                ps2.setString(1,email);
                ResultSet rs=ps2.executeQuery();
                rs.next();
                return  String.valueOf(rs.getInt(1));

             }else System.err.println("Failed to make Connection");
         }
         catch (SQLException e){
             System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
             String error=e.getMessage();
             if(error.contains("email"))
                 return "Email id already exists: "+error.substring(error.lastIndexOf('(')+1,error.lastIndexOf(')'));
             else
                  return e.getMessage();
         }
        return "Something Went Wrong!";
    }



    public static Object ifUserValidThenReturnUserTypeID(Auth.credential request){

        String email=request.getEmail().trim();
        String password=request.getPassword().trim();

        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);){
            if(conn!=null){
                PreparedStatement ps=conn.prepareStatement("select * from AUTH where email=? and password=?;");
                ps.setString(1,email);
                ps.setString(2,password);
               ResultSet rs= ps.executeQuery();
               if(rs.next())
                   return rs.getString(2)+" "+ rs.getInt(1);
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
                PreparedStatement ps=conn.prepareStatement("select count(*) from AUTH where email=?;");
                ps.setString(1,email);
                ResultSet rs=ps.executeQuery();
                rs.next();
                return rs.getInt(1)==1;

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
                PreparedStatement ps=conn.prepareStatement("UPDATE  auth set password=? where email=?");
                ps.setString(1,password);
                ps.setString(2,email);
                return ps.executeUpdate();
            }
            else System.err.println("Failed to make connection!");
        }catch (SQLException e){
            System.err.format("Something went wrong!");
        }
     return 0;
    }


}
