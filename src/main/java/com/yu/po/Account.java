package com.yu.po;

public class Account {

	private String passport;
	private String password;

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("passport:%s, password:%s", passport, password);
	}

}
