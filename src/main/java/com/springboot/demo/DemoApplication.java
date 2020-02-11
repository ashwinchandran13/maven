
 package com.springboot.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static HashMap<Long, Student> hmStudent;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		hmStudent = new HashMap<Long, Student>();
		
		Student one = new Student("John","math");
		hmStudent.put(new Long(one.getId()),one);
		
		SpringApplication.run(DemoApplication.class, args);
		
		Student two = new Student("Jane","history");
		hmStudent.put(new Long(two.getId()), two);
	}
}
