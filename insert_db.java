package jdbcexample1;

import java.sql.*;


public class InsertExample {
    
    public static void main(String[] args){
        try{
            String query="Insert into EmpInfo values(?,?,?)";       
            Class.forName("org.apache.derby.jdbc.ClientDriver");   
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Emp", "emp");
            // Use statement when the query directly puts values in
            PreparedStatement pstmt=con.prepareStatement(query);    //use PreparedStatement whwen you want to put in this way
           // These next 3 lines are only for prepared statement, not statement
            pstmt.setInt(1,106);    //set function needs column index and value for parameter
            pstmt.setString(2, "James");
            pstmt.setString(3, "Los Angelas");
            int row=pstmt.executeUpdate();  //for statement, we needed to execute the query here
            //int row=stmt.executeUpdate(query);
            System.out.println(row + " affected in database");
            con.close();        //close connection
        }
        catch(ClassNotFoundException ce){}
        catch(SQLException se){}
    }
    
}
