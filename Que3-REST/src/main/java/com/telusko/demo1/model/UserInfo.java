package com.telusko.demo1.model;

public class UserInfo {
 private String state;
 private String city;
 private String country;
 private String zipcode;
 
public UserInfo() {
	super();
	
}
public UserInfo(String state,String city,String country,String zipcode) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
	this.zipcode = zipcode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "UserInfo [state=" + state + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + "]";
}
 
 
}
