package com.weblearner.springboot.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LazyController {
	
	@Autowired
	private LazyInitializationClass lazyClass;
	
	@RequestMapping("greeting")
	public void getCompany() {
		System.out.println(lazyClass.getGreetings());
	}

}
