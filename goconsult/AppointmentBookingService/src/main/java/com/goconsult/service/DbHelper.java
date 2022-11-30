package com.goconsult.service;



import com.goconsult.grpc.Booking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {

    final static String URL="jdbc:postgresql://localhost:5432/capstone";
    final static String USERNAME="root";
    final  static String PASSWORD="root";

    public static String bookSlotHelper(Booking.bookingRequest request) {
        int user_id=request.getUserId();
        int slot_id=request.getSlotId();
        try(Connection conn= DriverManager.getConnection(URL,USERNAME,PASSWORD)){

            if(conn!=null){
                String sql="select counselor.fees from slot right join counselor on slot.counselor_id=counselor.counselor_id where slot_id="+slot_id+";";
                ResultSet rs=conn.createStatement().executeQuery(sql);
                if(rs.next()){
                    int fees=rs.getInt(1);
                   conn.createStatement().executeUpdate("create table if not exists BOOKING(\n" +
                           "booking_id int primary key generated always as identity (START WITH 300),\n" +
                           "slot_id int not null UNIQUE,\n" +
                           "user_id int not null,\n" +
                           "total_amount int not null,\n" +
                           "FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),\n" +
                           "FOREIGN KEY (slot_id) REFERENCES SLOT(slot_id)\n" +
                           ");");
                   PreparedStatement ps=conn.prepareStatement("insert into BOOKING(slot_id,user_id,total_amount) values(?,?,?)");
                   ps.setInt(1,slot_id);
                   ps.setInt(2,user_id);
                   ps.setInt(3,fees);
                   return ps.executeUpdate()==1?"success":" ";
                }
                else{
                    return "Invalid slot_id!";
                }
            }else return "Failed to make Connection!";

        }catch (SQLException e){
            System.err.format(e.getMessage());
            if(e.getMessage().contains("unique constraint"))
                return "Slot already Booked!";
        }
      return "Something went wrong!";
    }


    //A user can see all the bookings made by him
    public static List<Booking.CounselorSlot> viewBookedSlotForUserHelper(int userId) {
        List<Booking.CounselorSlot> result=new ArrayList<>();

        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            if(conn!=null){
               PreparedStatement ps= conn.prepareStatement("SELECT BOOKING.booking_id, SLOT.slot_id, COUNSELOR.counselor_name, COUNSELOR.contact,COUNSELOR.specialization, date,from_time,to_time,BOOKING.total_amount FROM SLOT  \n" +
                       " RIGHT JOIN COUNSELOR ON COUNSELOR.counselor_id=SLOT.counselor_id\n" +
                       " RIGHT JOIN BOOKING on SLOT.slot_id=BOOKING.slot_id\n" +
                       "where BOOKING.user_id=?");
               ps.setInt(1,userId);

               ResultSet rs=ps.executeQuery();
               while(rs.next()){
                   Booking.CounselorSlot.Builder slot= Booking.CounselorSlot.newBuilder() .setBookingId(rs.getInt(1)).setSlotId(rs.getInt(2))
                           .setCounselorName(rs.getString(3)).setContact(rs.getString(4)).setSpecialization(rs.getString(5))
                           .setDate(String.valueOf(rs.getDate(6))).setFromTime(String.valueOf(rs.getTime(7))).setToTime(String.valueOf(rs.getTime(8))).setTotalAmount(rs.getInt(9));
                   result.add(slot.build());
               }
               return result;
            }
            else {
                System.out.println();
            }

        }catch (SQLException e){
            System.err.format(e.getMessage());
        }

        return result;
    }


    // A counselor can see all details of his booked slots
    public static List<Booking.UserSlot> viewBookedSlotForCounselorHelper(int counselorId) {

        List<Booking.UserSlot> result=new ArrayList<>();

        try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            if(conn!=null){
                PreparedStatement ps= conn.prepareStatement("SELECT BOOKING.booking_id, BOOKING.slot_id,USERDATA.user_name,USERDATA.contact,SLOT.date,SLOT.from_time,SLOT.to_time FROM BOOKING\n" +
                        "JOIN USERDATA ON USERDATA.user_id=BOOKING.user_id\n" +
                        "JOIN SLOT ON SLOT.slot_id=BOOKING.slot_id\n" +
                        "where SLOT.counselor_id=?;");
                ps.setInt(1,counselorId);

                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    Booking.UserSlot.Builder slot= Booking.UserSlot.newBuilder() .setBookingId(rs.getInt(1)).setSlotId(rs.getInt(2))
                            .setUserName(rs.getString(3)).setContact(rs.getString(4))
                            .setDate(String.valueOf(rs.getDate(5))).setFromTime(String.valueOf(rs.getTime(6))).setToTime(String.valueOf(rs.getTime(7)));
                    result.add(slot.build());
                }
                return result;
            }
            else {
                System.out.println();
            }

        }catch (SQLException e){
            System.err.format(e.getMessage());
        }

        return result;
    }
}
