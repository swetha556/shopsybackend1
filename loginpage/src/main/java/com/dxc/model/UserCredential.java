package com.dxc.model;

public class UserCredential {

	private String useremail;
	private String userpassword;
	private String role;
	
	public UserCredential() {
		super();
	}

	public UserCredential(String useremail, String userpassword,String role) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role=role;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserCredential [useremail=" + useremail + ", userpassword=" + userpassword + " , role="+role+"]";
	}
	
	
	
}
