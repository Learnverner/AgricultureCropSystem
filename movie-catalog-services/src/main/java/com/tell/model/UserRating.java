package com.tell.model;

import java.util.List;

import com.tell.model.Rating;

public class UserRating {
private List<Rating>userRating;
private String userId;

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public List<Rating> getUserRating() {
	return userRating;
}

public void setUserRating(List<Rating> userRating) {
	this.userRating = userRating;
}



}
