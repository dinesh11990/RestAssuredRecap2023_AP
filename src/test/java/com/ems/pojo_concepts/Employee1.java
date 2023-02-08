package com.ems.pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// POJO data stored

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {

		Employee emp1 = new Employee();
		emp1.setFirstName("dinesh");
		emp1.setLastName("krishna");
		emp1.setEmail("dinesh11990@gmail.com");
		emp1.setSkills(Arrays.asList("java","selenium"));


		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getLastName());
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getSkills());



		//How to serialize plain old java object ? or How to convert POJO into JSON ?
			//Answer: 1. We need to use objectmapper , 2. write with default pretty printer
		
		//Jackson Databind process (From Jackson librery we gonna use ObjectMapper class)
		
		ObjectMapper mapper = new ObjectMapper();
		String empJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		System.out.println(empJson);
	}



}
