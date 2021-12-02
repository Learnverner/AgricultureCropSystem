package com.telusko.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telusko.demo1.model.UserInfo;
import com.telusko.demo1.tell.UserShow;

@RestController
public class UserInfoController {
@Autowired
private UserShow usershow;
@RequestMapping("/user")
public List<UserInfo>getAllInfo() {
	return null;
}

@GetMapping("/user/{zipcode}")
public UserInfo getInfo(@PathVariable String zipcode){
	return usershow.getInfo(zipcode);
}
}

