package cn.it.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	// 注入environment
	@Autowired
	private Environment environment;
	
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		return "Hello World";
	}
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
}
