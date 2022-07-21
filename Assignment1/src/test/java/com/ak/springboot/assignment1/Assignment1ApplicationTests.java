package com.ak.springboot.assignment1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Assignment1ApplicationTests {


	@Autowired
	TestImpl testImpl;
	@Test
	public void testDependencyInjection() {
		assertNotNull(testImpl.test(3,6));
		System.out.println(testImpl.test(4,5));
	}

}
