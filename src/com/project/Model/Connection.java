package com.project.Model;

import java.sql.DriverManager;
import java.util.Properties;

public class Connection {
  
	Connection conn = null;
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost/test";
		Properties props = new Properties();
		props.setProperty("user","fred");
		props.setProperty("password","secret");
		props.setProperty("ssl","true");
		Connection conn = DriverManager.getConnection(url, props);

		String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		Connection conn = DriverManager.getConnection(url);
		
	}
}
