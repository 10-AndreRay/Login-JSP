package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/login?useTimeZone=true&serverTimezone=UTC";
	private String user = "root";
	private String pass = "root";
	
	private Connection conect() {
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, pass);
			return connection;
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public boolean verifyLogin(LoginBean login) {
		String sql = "select * from user where user = ? and pass = ?";
		try {
			Connection connection = conect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, login.getUser());
			pst.setString(2, login.getPass());
			ResultSet result = pst.executeQuery();
			
			if(result.next()) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			System.out.println();
			return false;
		}
	}
}
