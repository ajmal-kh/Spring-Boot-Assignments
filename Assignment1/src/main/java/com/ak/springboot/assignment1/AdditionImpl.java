package com.ak.springboot.assignment1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AdditionImpl implements Addition{
	
	public int add(int a, int b) {
		return a+b;
	}
}
