package com.tell.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping("/hello")
public String sayhi()
{
return "Hello World";	
}
}
