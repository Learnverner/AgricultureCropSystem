package com.telusko.demo1.tell;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.demo1.model.UserInfo;

@Service
public class UserShow {
private List<UserInfo>info=Arrays.asList(
		new UserInfo("AK","ANCHORAGE","US","99501"),
		new UserInfo("MH","PUNE","INDIA","99502"),
		new UserInfo("MP","BHOPAL","INDIA","99503"),
		new UserInfo("DL","DELHI","INDIA","99504"),
		new UserInfo("TN","CHENNAI","INDIA","99505"),
		new UserInfo("AK","NEW YORK","US","99506"),
		new UserInfo("AK","LONDON","UK","99507"),
		new UserInfo("AK","WASHINGTON D C","US","99508"));
 public List<UserInfo>getAllInfo(){
	 return info;
 }
 public UserInfo getInfo(String zipcode) {
	 return info.stream().filter(t->t.getZipcode().equals(zipcode)).findFirst().get();
 }
}
