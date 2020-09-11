package com.weblearner.springboot.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LazyController {

	public LazyController() {
      System.out.println("LazyController is Initialized");
	}

	@Lazy
	@Autowired
	private LazyInitializationClass lazyClass;

	@RequestMapping("greeting")
	public void getGreetingMsg() {
		System.out.println(lazyClass.getGreetings());
	}

}
