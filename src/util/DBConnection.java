package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    static Connection con;
    public static Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Load the JDBC Driver
            String url = "jdbc:mysql://localhost:3306/empmgt"; //URL of the database server
            String user = "root";
            String password = "root";
            //Connection to the Database
            con = DriverManager.getConnection(url, user, password);         
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    
    /*
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Load the JDBC Driver
            String url = "jdbc:mysql://localhost:3306/empmgt"; //URL of the database server
            String user = "root";
            String password = "root";
            //Connection to the Database
            Connection con = DriverManager.getConnection(url, user, password);
                       
        } catch (Exception e) {
            System.out.println(e);
        }
     }
    */
    
}


/*
String sql = "SELECT * FROM employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("fname");
                int age = rs.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

*/