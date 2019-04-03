package com.healthcloud.core.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	
	@RequestMapping(value = "/users")
	public String hola() {
		return "Hola";
	}

}
