package com.ak.springboot.assignment3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.ak.springboot.assignment3.entity.Student;


@SpringBootTest
class Assignment3ApplicationTests {

	@Value("${studentrestapi.services.url}")
	private String baseURL;
	@Test
	void testGetStudent() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject(baseURL+1,Student.class);
	}
	@Test
	void testCreateStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student newStudent = new Student();
		newStudent.setName("ajmal");
		newStudent.setScore(45);
		Student createdStudent = restTemplate.postForObject("baseURL",newStudent,Student.class);
	}
	
	@Test
	void testUpdateStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student prevStudent = restTemplate.getForObject(baseURL+"2", Student.class);
		prevStudent.setName("C");
		restTemplate.put("baseURL", prevStudent, Student.class);
		assertEquals("C",prevStudent.getName());
	}
	
	@Test
	void testDeleteStudent() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(baseURL+"2");	
	}

}
