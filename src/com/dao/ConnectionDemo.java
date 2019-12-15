package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;


public class ConnectionDemo {

	public static void main(String[] argv) {
		 
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection conn= null;
        try {
        	
        	/*Enumeration en = DriverManager.getDrivers();
        	while(en.hasMoreElements()){
        		Driver dr =(Driver) en.nextElement();
        		dr.toString();
        	}*/
        	
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "password");
            System.out.println("SQL Connection to database established!");
            
            String sql = "select * from employees limit 10 ";
            Statement stmt  = conn.createStatement();
            
            
            ResultSet result = stmt.executeQuery(sql);
            java.sql.ResultSetMetaData metaData= result.getMetaData();
            String val = metaData.getColumnTypeName(1);
            System.out.println("1st column datatype: "+val+" \n coulumn count: "+metaData.getColumnCount());
           /* while(result.next()){
            	for(int i=1; i<=result.getMetaData().getColumnCount()-2;i++){
            		System.out.println(result.getString(i)+"  ");
            	}
            	System.out.println();
            }*/
 
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        } finally {
            try
            {
                if(conn != null)
                    conn.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
