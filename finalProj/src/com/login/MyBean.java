package com.login;

public class MyBean {

	private String first = "Taken", firstPass = "1234";
	private String second = "Taken4", secondPass = "4321";

	private String inUsername;
	private String inPassword;

	public String getName() {
		if (inPassword.contentEquals(firstPass) && (inUsername.contentEquals(first))) {
			return firstUser.getName();
		}

		else if (inPassword.contentEquals(secondPass) && (inUsername.contentEquals(second))) {
			return secondUser.getName();
		}
		return "";
	}

	public void setName(String message) {
		this.first = message;
	}

	public String getPassword() {
		return firstPass;
	}

	public void setPassword(String password) {
		this.firstPass = password;
	}

	public String getNameb() {
		if (inPassword.contentEquals(secondPass) || (inUsername.contentEquals(second))) {
			return "nameb";
		}

		return "";
	}

	public boolean validate() {
		if (inPassword.contentEquals(firstPass) && (inUsername.contentEquals(first))
				|| (inPassword.contentEquals(secondPass)) && (inUsername.contentEquals(second))) {
			return true;
		} else {
			return false;
		}
	}

	public void setNameb(String name) {
		this.second = name;
	}

	public String getPasswordb() {
		return secondPass;
	}

	public void setPasswordb(String password) {
		this.secondPass = password;
	}

	public String getInPassword() {
		return inPassword;
	}

	public void setInPassword(String inPassword) {
		this.inPassword = inPassword;
	}

	public String getInUsername() {
		return inUsername;
	}

	public void setInUsername(String inUsername) {
		this.inUsername = inUsername;
	}

}