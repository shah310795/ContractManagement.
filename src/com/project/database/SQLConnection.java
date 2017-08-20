package com.project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	private static Connection conn = null;
	final private static String USERNAME = "postgres";
	final private static String PASSWORD = "admin";
	final private static String URI = "jdbc:postgresql://localhost:5432/postgres";
	static {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URI, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private SQLConnection() {}
	public static Connection getConnection() {
		return conn;
	}
	
}
