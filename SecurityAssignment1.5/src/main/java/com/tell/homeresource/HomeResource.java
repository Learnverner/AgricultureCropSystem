package com.tell.homeresource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
@GetMapping("/")
public String home() {
	return("<h1>Hello World</h1>");
}
@GetMapping("/user")
public String user() {
	return ("<h1>Hello World User</h1>");
}
@GetMapping("/admin")
public String admin() {
	return("<h1>Hello World Admin</h1>");
}
}
