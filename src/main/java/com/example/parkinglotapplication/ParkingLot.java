package com.example.parkinglotapplication;

import java.sql.*;

public class ParkingLot
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        ParkingLot pl = new ParkingLot();
       // pl.reservation();
        //pl.showReservedSpots();

    }

    public String getAllParkingSpots() throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/parkingLotApp";
        String userName = "root";
        String passWord = "taehyung1995";
        String query = "select * from parkingSpot";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String data = "";

        while(rs.next()){
            data = rs.getInt(1) + "  | " + rs.getInt(2) + " | " + rs.getString(3) + " | " + rs.getString(4) + " | " + rs.getBoolean(5);

            System.out.println(data);
        }
        st.close();
        con.close();

        return data;
    }
    public String showAvailableSpots() throws ClassNotFoundException, SQLException
    {

        String url = "jdbc:mysql://localhost:3306/parkingLotApp";
        String userName = "root";
        String passWord = "taehyung1995";
        String query = "select * from parkingSpot WHERE isAvaliable = 0";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String data = "";

        while(rs.next()){
            data = rs.getInt(1) + "  | " + rs.getInt(2) + " | " + rs.getString(3) + " | " + rs.getString(4) + " | " + rs.getBoolean(5);

            System.out.println(data);
        }

        st.close();
        con.close();

        return data;
    }

    public void reservation() throws ClassNotFoundException, SQLException
    {

        String url = "jdbc:mysql://localhost:3306/parkingLotApp";
        String userName = "root";
        String passWord = "taehyung1995";
        String query = "INSERT INTO lotReservation (idLotReservation, reservationLicensePlateNo, reservedHour, spotNo) VALUES (5,'fgh7654',4,8)";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);

        st.close();
        con.close();

    }

    public String showReservedSpots() throws ClassNotFoundException, SQLException
    {
        String url = "jdbc:mysql://localhost:3306/parkingLotApp";
        String userName = "root";
        String passWord = "taehyung1995";
        String query = "select * from lotReservation";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String data = "";

        while(rs.next()){
            data = rs.getInt(1) + "  | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getInt(4);

            System.out.println(data);
        }
        st.close();
        con.close();

        return data;
    }

}
