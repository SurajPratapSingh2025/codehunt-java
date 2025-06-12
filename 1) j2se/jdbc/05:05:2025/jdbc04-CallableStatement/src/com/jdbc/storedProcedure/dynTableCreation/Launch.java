package com.jdbc.storedProcedure.dynTableCreation;

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
            
            // Create the stored procedure
            String sql = "CREATE PROCEDURE jdbc1.createMyDynTable(IN tableName varchar(30))\n"
                       + "BEGIN\n"
                       + "SET @createTbSQL = CONCAT('CREATE TABLE jdbc1.', tableName, ' (eid INT PRIMARY KEY, ename VARCHAR(30))');\n"
                       + "PREPARE createTbStmt FROM @createTbSQL;\n"
                       + "EXECUTE createTbStmt;\n"
                       + "DEALLOCATE PREPARE createTbStmt;\n"
                       + "END";
            
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            System.out.println("Stored Procedure Created....");
            
            // Call the stored procedure
            sql = "{CALL jdbc1.createMyDynTable(?)}";
            cs = con.prepareCall(sql);
            cs.setString(1, "newTable1");
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