package com.weblearner.springboot.lazy;

import org.springframework.stereotype.Component;

@Component
public class LazyInitializationClass {

	public LazyInitializationClass() {
		System.out.println("LazyInitializationClass Object Created");
	}
	
	public String getGreetings() {
		return "Hello";
	}

}
