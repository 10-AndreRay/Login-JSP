package dao;

public class LoginBean {
	private String user;
	private String pass;
	
	public LoginBean(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public LoginBean() {
		super();
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
