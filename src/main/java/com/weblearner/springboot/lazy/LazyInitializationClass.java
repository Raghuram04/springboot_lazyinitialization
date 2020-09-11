package com.weblearner.springboot.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyInitializationClass {

	public LazyInitializationClass() {
		System.out.println("LazyInitializationClass Object Created");
	}
	
	public String getGreetings() {
		return "Hello";
	}

}
