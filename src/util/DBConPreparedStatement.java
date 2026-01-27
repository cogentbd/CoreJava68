package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ui.EmployeeUI;
import static util.DBConStatement.con;

public class DBConPreparedStatement {
    static Connection con;
    
    public static void main(String[] args) throws ClassNotFoundException {
         
            try {
            //******** Database properties
            Class.forName("com.mysql.jdbc.Driver"); //Load the JDBC Driver
            String url = "jdbc:mysql://localhost:3306/empmgt"; //URL of the database server
            String user = "root";
            String password = "root";
            //Connection to the Database
            con = DriverManager.getConnection(url, user, password);    
         
                //***----------------------insert-------------------------
               String fn = "Mr. A";
               String ln = "Last N";
               String sql = "INSERT INTO EMPLOYEE (fname, lname) VALUES (?, ?)";
               PreparedStatement pstmt = con.prepareStatement(sql);
               pstmt.setString(1, fn);
               pstmt.setString(2, ln);
               int status = pstmt.executeUpdate();
               pstmt.close();
               if(status>0){
                   System.out.println("inserted");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Inserted");
               }else{
                   System.out.println("fail");
               }
                     
               //----------------------update-------------------------
               int idupdate = 2;
               String updateName = "Updated Name";
               String sqlupdate = "update employee set fname = ? where id = ?" ;
               PreparedStatement pstmtUpdate = con.prepareStatement(sqlupdate);    
               pstmtUpdate.setString(1, updateName);
               pstmtUpdate.setInt(2, idupdate);
               
               int updatestatus = pstmtUpdate.executeUpdate();
               pstmtUpdate.close();
               if(updatestatus>0){
                   System.out.println("sqlupdate");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Updated");
               }else{
                   System.out.println("fail");
               }
         
               //***----------------------delete-------------------------
               int id = 11;
               String sqldelete = "delete from employee where id = ?";
               PreparedStatement pstmtDelete = con.prepareStatement(sqldelete);
               pstmtDelete.setInt(1, id);
               
               int deletestatus = pstmtDelete.executeUpdate();
               pstmtDelete.close();
                if(deletestatus>0){
                   System.out.println("deleted");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Deleted");
               }else{
                   System.out.println("fail");
               }
               
                //***----------------------GET-------------------------
               String sqlquery = "SELECT * FROM employee";
               PreparedStatement pstmtGetAll = con.prepareStatement(sqlquery);     
               ResultSet rs = pstmtGetAll.executeQuery();
               while(rs.next()){
                   System.out.println(rs.getString(2) + " " + rs.getString(3)); 
                   //System.out.println(rs.getString("fname")); 
               }
               
               }catch(SQLException ex){
                   System.out.println(ex);
               }

    }
}
