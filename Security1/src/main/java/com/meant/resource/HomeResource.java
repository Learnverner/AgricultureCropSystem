package com.meant.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
@GetMapping("/")
public String home() {
	return("<h1>Welcome</h1>");
}
@GetMapping("/admin")
public String home1() {
	return("<h1>Welcome Admin</h1>");
}
@GetMapping("/user")
public String home2(){
	return("<h1>Welcome User</h1>");
}
}
