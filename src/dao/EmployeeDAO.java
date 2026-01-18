package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Employee;
import ui.EmployeeUI;
import util.DBConnection;

public class EmployeeDAO {
    // MYSQL JDBC Driver
    public Employee insert(Employee e) {
        String fn = e.getFname();
        String ln = e.getLname();
        String sql = "INSERT INTO EMPLOYEE (fname, lname) VALUES ('"+fn+"', '"+ln+"')";
        try {
        //1. Get the connection
        Connection con = DBConnection.getConnection();
        //2. Create a Statement
        Statement stmt = con.createStatement();     
        //3. execute the statement
        int status = stmt.executeUpdate(sql);
        
        if(status>0){
            System.out.println("inserted");
            JOptionPane.showMessageDialog(new EmployeeUI(), "Inserted");
        }else{
            System.out.println("fail");
        }
         
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        return e;
    }
}