package com.demo.samples;

import java.sql.*;

public class JdbcSample {

	String check = "\"";
	
	static final String DB_URL = "jdbc:postgresql://localhost:5432/sample";
	   static final String USER = "postgres";
	   static final String PASS = "root";
	   static final String QUERY = "SELECT \"product_id\", \"product_name\", \"price\" FROM \"public\".\"products\";";

	   public static void main(String[] args) {
	      // Open a connection
		   Connection conn = null;
		   System.out.println("******* SQL demo");
	      try {
	    	  		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(QUERY);
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.println("ID: " + rs.getInt("product_id"));
	            System.out.println("Desc: " + rs.getString("product_name"));
	            System.out.println("price: " + rs.getInt("price"));
	         }
	         
	         System.out.println("******* Stored proc demo");
	         CallableStatement outsampleproc = conn.prepareCall("{ CALL \"SampleSchema\".prodoutdemo(?) }");
	         outsampleproc.registerOutParameter(1, Types.VARCHAR);
	         outsampleproc.execute();
	         String name = outsampleproc.getString(1);
	         System.out.println(name);
	         outsampleproc.close();

	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	    	  if(conn != null) {
	    		  
	    		  try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  }
	      }
	   }


}
