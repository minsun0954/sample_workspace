package co.edu.exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowExceptionEx {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void method1() throws ClassNotFoundException, SQLException {
		
		Class.forName("java.lang.String");
		
		DriverManager.getConnection("","","");
	}
}
