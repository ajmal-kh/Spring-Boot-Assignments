package com.ak.springboot.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestImpl {
	
	@Autowired
	Addition addition;
	
	public int test(int a, int b) {
		return addition.add(a,b);
	}
	public static void main(String[] args) {
		System.out.print(false);
	}
}
