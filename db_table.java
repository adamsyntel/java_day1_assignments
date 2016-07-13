package jdbcexample1;

import java.sql.*;


public class TueAssignment{
    
    static final String DB_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DB_CONNECTION = "jdbc:derby://localhost:1527/Assignment";
    static final String DB_USER = "emp";
    static final String DB_PASSWORD = "emp";
    
    public static void main(String[] args){
      
        try{
            //createTable();
            //deleteTable();
            //createTable();
            //insertTable();
            //deletefromTable();
            //selectfromTable();
            //updateTable();
            tableInfo();
            System.out.println("Inside try statement, main.");
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
        System.out.println("Main is Done.");
        
    }
    
    private static void createTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String empdetails = "CREATE TABLE EmpDetail("+ 
                                 "empid INT NOT NULL,"  
                                + " name VARCHAR(20)," 
                                + " addr VARCHAR(50))";
        System.out.println("Table made");
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
           int row=stmt.executeUpdate(empdetails);
           System.out.println(row);
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
    private static Connection getDBConnection() {
        Connection dbconn = null;
        try{
            Class.forName(DB_DRIVER);
            dbconn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        }
        catch(ClassNotFoundException ce){
            System.out.println("ce.getMessage()");
        }       
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
        return dbconn;
    }
    
    private static void deleteTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String delete_table = "DROP TABLE EMPDETAIL";

        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            stmt.executeUpdate(delete_table);
            System.out.println("Table deleted.");
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
    private static void insertTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String insert_table = "INSERT INTO EMPDETAIL VALUES(55,'Grace','Northbrook')";
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            stmt.execute(insert_table);
            System.out.println("Inserted into table");
            
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
    private static void deletefromTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String delete_from_table = "DELETE FROM EMPDETAIL WHERE empid = 55";
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            stmt.executeUpdate(delete_from_table);
            System.out.println("Deleted from table");
            
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
     private static void selectfromTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String select = "SELECT EMPID, NAME, ADDR FROM EMPDETAIL";
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            ResultSet res = stmt.executeQuery(select);
            while(res.next()){
                int empid = res.getInt("empid");
                String name = res.getString("name");
                String address = res.getString("addr");
                
                System.out.println(name + " lives in " + address + " and has ID " + empid);
                
            }
            System.out.println("Selected from table");
            
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
     
     private static void updateTable() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
        String delete_from_table = "UPDATE EMPDETAIL SET ADDR = 'Chicago' WHERE EMPID = 55";
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            stmt.executeUpdate(delete_from_table);
            System.out.println("Updated table");
            
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
     private static void tableInfo() throws SQLException {
        
        Connection dbconn = null;
        Statement stmt = null;
        
       String table_info = "SELECT * FROM EMP.EMPDETAIL";
        
        try{
            dbconn = getDBConnection();
            stmt = dbconn.createStatement();
            ///dbmd.getTable
            
            ResultSet res = stmt.executeQuery(table_info);
            ResultSetMetaData meta = res.getMetaData();
                    
            System.out.println("Num of Col: "+meta.getColumnCount());
            System.out.println("Name of Col 1: "+meta.getColumnName(1));
            System.out.println("Name of Col 2: "+meta.getColumnName(2));
            System.out.println("Name of Col 3: "+meta.getColumnName(3));
            System.out.println("Col 1 Type: "+meta.getColumnTypeName(1));
            System.out.println("Col 2 Type: "+meta.getColumnTypeName(2));
            System.out.println("Col 3 Type: "+meta.getColumnTypeName(3));
            
        }
        catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
    
}
