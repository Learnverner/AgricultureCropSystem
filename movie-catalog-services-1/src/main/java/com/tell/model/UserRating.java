package com.tell.model;

import java.util.List;

public class UserRating {
private List<Rating>userRating;
private String userId;

public UserRating() {
	super();
	// TODO Auto-generated constructor stub
}

public UserRating(List<Rating> userRating, String userId) {
	super();
	this.userRating = userRating;
	this.userId = userId;
}

public List<Rating> getUserRating() {
	return userRating;
}
public void setUserRating(List<Rating> userRating) {
	this.userRating = userRating;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}


}
