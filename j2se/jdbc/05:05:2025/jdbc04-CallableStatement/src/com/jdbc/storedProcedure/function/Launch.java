package com.jdbc.storedProcedure.function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Launch {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc1";
            String username = "root";
            String password = "rootsystem";
            
            Connection con = DriverManager.getConnection(url, username, password);
            
            // Create the function with proper characteristics
            String sql = "CREATE FUNCTION sumOfSalary(age_from INT, age_to INT)\n"
                       + "RETURNS INTEGER\n"
                       + "READS SQL DATA\n"  // Added characteristic
                       + "BEGIN\n"
                       + "DECLARE sum_of_salary INTEGER;\n"
                       + "SELECT SUM(esalary) INTO sum_of_salary FROM mydata WHERE eage BETWEEN age_from AND age_to;\n"
                       + "RETURN sum_of_salary;\n"
                       + "END";
            
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            System.out.println("Function created successfully......");
            
            //function call
            sql= "{?=call sumOfSalary(?,?)}";
            cs=con.prepareCall(sql);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, 19);
            cs.setInt(3, 22);
            cs.execute();
            
            int sum_of_salary=cs.getInt(1);
            System.out.println(sum_of_salary);
            
            
            
            
            // Close resources
            cs.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}