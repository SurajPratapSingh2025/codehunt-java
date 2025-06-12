package com.jdbc.storedProcedure.dbCreation;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Launch {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "rootsystem";
            
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
            
            // Create the stored procedure
            String sql = "CREATE PROCEDURE jdbc1.createMyDatabase(IN dbName varchar(30))\n"
                       + "BEGIN\n"
                       + "SET @createDbSQL = CONCAT('CREATE DATABASE ', dbName);\n"
                       + "PREPARE createDbStmt FROM @createDbSQL;\n"
                       + "EXECUTE createDbStmt;\n"
                       + "DEALLOCATE PREPARE createDbStmt;\n"
                       + "END";
            
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            System.out.println("Stored Procedure Created....");
            
            // Call the stored procedure
            sql = "{CALL jdbc1.createMyDatabase(?)}";
            cs = con.prepareCall(sql);
            cs.setString(1, "newDB1");
            cs.execute();
            System.out.println("Stored Procedure called....");
            
            // Close resources
            cs.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}