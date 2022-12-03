package com.goconsult.service;

import com.goconsult.grpc.user.User;

import java.sql.*;

public class DbHelper {
    final static String URL="jdbc:postgresql://localhost:5432/capstone";
    final static String USERNAME="root";
    final  static String PASSWORD="root";

    public static int UID=0;  //user_id received from token in serverInterceptor which changes when new token received in serverInterceptor.




    public static User.user.Builder viewProfileHelper() {
        User.user.Builder result=User.user.newBuilder();
        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            ResultSet rs=conn.prepareStatement("select user_name,contact,address,dob,gender,occupation from USERDATA where user_id="+UID).executeQuery();
            if(rs.next()){
                // user_id -> restricted this from viewing
                result.setUserName(rs.getString(1));
                result.setContact(String.valueOf(rs.getString(2)));
                result.setAddress(String.valueOf(rs.getString(3)));
                result.setDob(String.valueOf(rs.getDate(4)));
                result.setGender(String.valueOf(rs.getString(5)));
                result.setOccupation(String.valueOf(rs.getString(6)));

                return result;
            }
            return null;

        }
        catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return null;

    }



    public static String updateProfileHelper(User.user request) {

        String name = request.getUserName().trim();
        String contact = request.getContact().trim();
        String address = request.getAddress().trim();
        Date dob ;
        if(request.getDob().trim().length()!=0) {
            try {
                dob = Date.valueOf(request.getDob());
            } catch (Exception e) {
                return "Invalid Date";
            }
        }
        String gender = request.getGender().trim();
        String occupation = request.getOccupation().trim();


        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {

                ResultSet rs =conn.prepareStatement("select user_name,contact,address,dob,gender,occupation from USERDATA where user_id="+UID+";").executeQuery();
                if(rs.next()) {
                    name = name.length() == 0 ? rs.getString(1) : name;
                    contact = contact.length() == 0 ? rs.getString(2) : contact;
                    address = address.length() == 0 ? rs.getString(3) : address;
                    dob = request.getDob().trim().length()==0?rs.getDate(4): Date.valueOf(request.getDob());
                    gender = gender.length() == 0 ? rs.getString(5) : gender;
                    occupation = occupation.length() == 0 ? rs.getString(6) : occupation;


                    PreparedStatement ps = conn.prepareStatement("update USERDATA set user_name=?,contact=?,address=?,dob=?,gender=?,occupation=? where user_id=?");
                    ps.setString(1, name);
                    ps.setString(2, contact);
                    ps.setString(3, address);
                    ps.setDate(4, dob);
                    ps.setString(5, gender);
                    ps.setString(6, occupation);

                    ps.setInt(7,UID);

                    ps.executeUpdate();
                    return "success";
                }

            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

        }

        return "something went wrong";

    }



    public static String updatePasswordHelper(User.updatePasswordDetail request) {

        String pass=request.getPassword();
        String conf_pass=request.getConfPassword();

        if(pass.trim().length()==0 || conf_pass.trim().length()==0)
            return "Please Enter the password!";
        if(!pass.trim().equals(conf_pass.trim()))
            return "Password Doesn't match!";

        String message="";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {

                PreparedStatement ps=conn.prepareStatement("update USERDATA set password=?  where user_id=?;");
                ps.setString(1,conf_pass);
                ps.setInt(2,UID);
                ps.executeUpdate();
                return "success";

            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return message;

    }
}


