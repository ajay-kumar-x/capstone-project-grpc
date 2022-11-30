package com.goconsult.service;

import com.goconsult.grpc.Counselor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DbHelper {

    final static String URL="jdbc:postgresql://localhost:5432/capstone";
    final static String USERNAME="root";
    final  static String PASSWORD="root";

    public static int UID=0;  //counselor_id received from token in serverInterceptor setting this value in serverInterceptor so when a new token received then user will be changed


    //To Insert the Counselor Data into COUNSELOR Table
    public static String insertIntoCounselorDB(Counselor.counselor request) {

       //uid we have directly fetched from token received in serverInterceptor

        String name = request.getCounselorName();
        String contact = request.getContact();
        String address = request.getAddress();
        Date dob;
        try{
       dob = Date.valueOf(request.getDob());
        }catch (Exception e){ return "Invalid Date";}
        String gender = request.getGender();
        String specialization = request.getSpecialization();
        int experience = request.getExperience();
        int fees = request.getFees();
        String message="";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("create table if not exists COUNSELOR(\n" +
                        "\tcounselor_id int primary key,\n" +
                        "\tcounselor_name varchar(50) not null,\n" +
                        "\tcontact varchar(20) not null UNIQUE,\n" +
                        "\taddress varchar(50) not null,\n" +
                        "\tdob date not null,\n" +
                        "\tgender varchar(10),\n" +
                        "\tspecialization varchar(50) not null,\n" +
                        "\texperience int not null,\n" +
                        "\tfees int not null,\n" +
                        "\tFOREIGN KEY (counselor_id) REFERENCES AUTH(uid)\n" +
                        ");");


                  PreparedStatement ps = conn.prepareStatement("insert into COUNSELOR (counselor_id,counselor_name,contact,address,dob,gender,specialization,experience,fees)" +
                          " values(?,?,?,?,?,?,?,?,?)");

                  ps.setInt(1, UID); //got the uid from token received in serverInterceptor
                  ps.setString(2, name);
                  ps.setString(3, contact);
                  ps.setString(4, address);
                  ps.setDate(5, dob);
                  ps.setString(6, gender);
                  ps.setString(7, specialization);
                  ps.setInt(8, experience);
                  ps.setInt(9, fees);


                  message = String.valueOf(ps.executeUpdate());

            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            if(e.getMessage().contains("counselor_id"))
                return "Already registered";
        }
        return message;
    }



     //To See the Counselor Details for a particular Id received from serverInterceptor
     public static Counselor.counselor.Builder viewProfileHelper(){

        Counselor.counselor.Builder result=Counselor.counselor.newBuilder();
        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            ResultSet rs=conn.prepareStatement("select * from COUNSELOR where counselor_id="+UID).executeQuery();
            if(rs.next()){
                  // result.setCounselorId(rs.getInt(1));            deprecated this from viewing
                result.setCounselorName(rs.getString(2));
                result.setContact(rs.getString(3));
                result.setAddress(rs.getString(4));
                result.setDob(String.valueOf(rs.getDate(5)));
                result.setGender(rs.getString(6));
                result.setSpecialization(rs.getString(7));
                result.setExperience(rs.getInt(8));
                result.setFees(rs.getInt(9));

                return result;
            }
            return null;

        }
        catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return null;
    }



     //To Update the Counselor Detail by taking Counselor details
     public static String updateProfileHelper(Counselor.counselor request){

        String name = request.getCounselorName().trim();
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
        String specialization = request.getSpecialization().trim();
        int experience = request.getExperience();
        int fees = request.getFees();

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {

                   ResultSet rs =conn.prepareStatement("select * from COUNSELOR where counselor_id="+UID+";").executeQuery();
                   if(rs.next()) {
                       name = name.length() == 0 ? rs.getString(2) : name;
                       contact = contact.length() == 0 ? rs.getString(3) : contact;
                       address = address.length() == 0 ? rs.getString(4) : address;
                       dob = request.getDob().trim().length()==0?rs.getDate(5): Date.valueOf(request.getDob());
                       gender = gender.length() == 0 ? rs.getString(6) : gender;
                       specialization = specialization.length() == 0 ? rs.getString(7) : specialization;
                       experience = experience == 0 ? rs.getInt(8) : experience;
                       fees = fees == 0 ? rs.getInt(9) : fees;

                       PreparedStatement ps = conn.prepareStatement("update Counselor set counselor_name=?,contact=?,address=?,dob=?,gender=?,specialization=?,experience=?,fees=? where counselor_id=?");
                       ps.setString(1, name);
                       ps.setString(2, contact);
                       ps.setString(3, address);
                       ps.setDate(4, dob);
                       ps.setString(5, gender);
                       ps.setString(6, specialization);
                       ps.setInt(7, experience);
                       ps.setInt(8, fees);
                       ps.setInt(9,UID);

                       ps.executeUpdate();
                       return "success";
                   }
                   else return DbHelper.insertIntoCounselorDB(request);

            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

        }

        return "something went wrong";
    }



      //To update the password for a particular counselor ID received from serverInterceptor
      public static String updatePasswordHelper(Counselor.updatePasswordDetail request){

        String pass=request.getPassword();
        String conf_pass=request.getConfPassword();

        if(pass.trim().length()==0 || conf_pass.trim().length()==0)
            return "Please Enter the password!";
        if(!pass.trim().equals(conf_pass.trim()))
            return "Password Doesn't match!";


        String message="";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {

                    PreparedStatement ps=conn.prepareStatement("update auth set password=?  where uid=?;");
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






      //To insert the data in SLOT table
      public static String insertIntoSlotDB(Counselor.slot request){

        int counselor_id=UID;
        Date date;
        Time from_time;
        Time to_time;

        try{
         date= Date.valueOf(request.getDate());
         from_time= Time.valueOf(request.getFromTme());
         to_time= Time.valueOf(request.getToTime());
        }catch (Exception e){
            return "Invalid Date or Time format";
        }


        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("create table if not exists SLOT(\n" +
                        "slot_id int  generated always as identity (START with 200),\n" +
                        "counselor_id int not null,\n" +
                        "date date not null,\n" +
                        "from_time time not null,\n" +
                        "to_time time not null,\n" +
                        "FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id),\n" +
                        "PRIMARY KEY (slot_id)\n" +
                        ");");

                PreparedStatement ps = conn.prepareStatement("insert into SLOT (counselor_id,date,from_time,to_time)" +
                        " values(?,?,?,?)");
                ps.setInt(1, counselor_id);
                ps.setDate(2, date);
                ps.setTime(3,from_time);
                ps.setTime(4, to_time);
                ps.executeUpdate();
                return "success";
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            return e.getMessage();
        }
        return "Something went wrong!";
    }


      //To view all the slots added by the logged in Counselor
      public static List<Counselor.slotDetail> viewAllSlotHelper() {

        List<Counselor.slotDetail> list=new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
            if(conn!=null){
                ResultSet rs=conn.createStatement().executeQuery("select slot_id,date,from_time,to_time from SLOT where counselor_id="+UID+";");
                while(rs.next()){
                    Counselor.slotDetail.Builder slot=Counselor.slotDetail.newBuilder();
                    slot.setSlotId(rs.getInt(1)).setDate(String.valueOf(rs.getDate(2)))
                            .setFromTme(String.valueOf(rs.getTime(3))).setToTime(String.valueOf(rs.getTime(4)));
                    list.add(slot.build());
                }
                return list;
            }
            else{
                System.out.println("Failed to make Connection!");
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

        }

    return null;
    }


      //To delete the particular slot by slot_id
      public static int deleteSlotBySlotId(int slotId) {

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {

            if (conn != null) {

                PreparedStatement ps = conn.prepareStatement("delete from SLOT where slot_id=? and counselor_id=?");
                ps.setInt(1, slotId);
                ps.setInt(2,UID);

                return ps.executeUpdate();

            } else {
                System.err.format("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return 0;
    }


    public static String updateSlotHelper(Counselor.slotDetail request) {

        int slot_id=request.getSlotId();
        Date date;
        Time from_time;
        Time to_time;

        try{
            date= Date.valueOf(request.getDate());
            from_time= Time.valueOf(request.getFromTme());
            to_time= Time.valueOf(request.getToTime());
        }catch (Exception e){
            return "Invalid Date or Time format";
        }
        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            if(conn!=null){
                PreparedStatement ps=conn.prepareStatement("update SLOT set date=?,from_time=?,to_time=? where slot_id=? and counselor_id=?");
                ps.setDate(1,date);
                ps.setTime(2,from_time);
                ps.setTime(3,to_time);
                ps.setInt(4,slot_id);
                ps.setInt(5,UID);
                return ps.executeUpdate()==1?"success":"failure";

            }else{
                System.err.format("Failed to make connection!");
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return "";
    }



}

