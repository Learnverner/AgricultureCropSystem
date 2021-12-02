package com.telusko.demo1.tell;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Login {
	@NotNull
	@Size(min=8, max=20, message="user name must be between 8 to 20")
    String username;
	@NotNull
	@Size(min=6,max=10,message="size should be between {min}and{max}")	
    String password;
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Login(@NotNull @Size(min = 8, max = 20, message = "user name must be between 8 to 20") String username,
		@NotNull @Size(min = 6, max = 10, message = "size should be between {min}and{max}") String password) {
	super();
	this.username = username;
	this.password = password;
}

public Login() {
	super();
	// TODO Auto-generated constructor stub
}


}
