package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ui.EmployeeUI;

public class DBConStatement {
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
               
                //***----------------------GET-------------------------
               String sqlquery = "SELECT * FROM employee";
               Statement stmtGetAll = con.createStatement();     
               ResultSet rs = stmtGetAll.executeQuery(sqlquery);
               while(rs.next()){
                   System.out.println(rs.getString(2) + " " + rs.getString(3)); 
                   //System.out.println(rs.getString("fname")); 
               }
               
               System.exit(0);
                //***----------------------insert-------------------------
                String fn = "Mr. A";
                String ln = "Last N";
                String sql = "INSERT INTO EMPLOYEE (fname, lname) VALUES ('"+fn+"', '"+ln+"')";

               Statement stmt = con.createStatement();     
               int status = stmt.executeUpdate(sql);
               stmt.close();
               if(status>0){
                   System.out.println("inserted");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Inserted");
               }else{
                   System.out.println("fail");
               }
               
               //----------------------update-------------------------
               int idupdate = 2;
               String updateName = "Mr. A Updated";
               String sqlupdate = "update employee set fname = '"+updateName+"' where id = '"+idupdate+"'" ;
               Statement stmtUpdate = con.createStatement();     
               int updatestatus = stmtUpdate.executeUpdate(sqlupdate);
               stmtUpdate.close();
               if(updatestatus>0){
                   System.out.println("sqlupdate");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Updated");
               }else{
                   System.out.println("fail");
               }
                              
               //***----------------------delete-------------------------
               int id = 3;
               String sqldelete = "delete from employee where id = '"+id+"'";
               Statement stmtDelete = con.createStatement();     
               int deletestatus = stmtDelete.executeUpdate(sqldelete);
               stmtDelete.close();
                if(deletestatus>0){
                   System.out.println("deleted");
                   JOptionPane.showMessageDialog(new EmployeeUI(), "Deleted");
               }else{
                   System.out.println("fail");
               }
               }catch(SQLException ex){
                   System.out.println(ex);
               }

    }
}
 