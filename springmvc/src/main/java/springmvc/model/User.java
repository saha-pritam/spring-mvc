package springmvc.model;

public class User {
	private int userid;
	private String username;
	private String usermail;
	private String userpassword;
	private String useroccupation;
	private String newsletters;
	private String agreeterm;
	private Address address;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUseroccupation() {
		return useroccupation;
	}
	public void setUseroccupation(String useroccupation) {
		this.useroccupation = useroccupation;
	}
	public String getNewsletters() {
		return newsletters;
	}
	public void setNewsletters(String newsletters) {
		this.newsletters = newsletters;
	}
	public String getAgreeterm() {
		return agreeterm;
	}
	public void setAgreeterm(String agreeterm) {
		this.agreeterm = agreeterm;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
