package com.jdbc.storedProcedure.staticTableCreation;


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
            String sql = "CREATE PROCEDURE jdbc1.createMyTable()\n"
                       + "BEGIN\n"
                       + "create table jdbc1.xyz(eid int primary key,ename varchar(30));\n"
                       + "END";
            
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            System.out.println("Stored Procedure Created....");
            
            // Call the stored procedure
            sql = "{CALL jdbc1.createMyTable()}";
            cs = con.prepareCall(sql);
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