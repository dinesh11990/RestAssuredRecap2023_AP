package com.ems.nonbdd;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees_23 {


	@Test(enabled=false)
	public void getAllEmployees(){
		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpec =  RestAssured.given();


		Response response = requestSpec.request(Method.GET,"employees");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());


	}

	@Test(enabled=false)
	public void createAnEmployee(){

		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpec =  
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ " \"first_name\": \"Agni\",\r\n"
						+ " \"last_name\": \"A\",\r\n"
						+ " \"email\": \"dinesh11990\"\r\n"
						+ "\r\n"
						+ "}");

		Response response = requestSpec.request(Method.POST,"employees");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());


	}
	@Test(enabled=false)
	public void updateAnEmployee(){

		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpec =
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ " \"first_name\": \"Agni\",\r\n"
						+ " \"last_name\": \"B\",\r\n"
						+ " \"email\": \"dinesh11990\"\r\n"
						+ "\r\n"
						+ "}");
		Response response = requestSpec.request(Method.POST,"employees");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusLine());

	}
	
	@Test(enabled=false)
	public void deleteAnEmployee(){
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification requestSpec = RestAssured.given();
		Response response = requestSpec.request(Method.DELETE,"employees/3");
		System.out.println(response.asPrettyString());
		
		
	}
	
	@Test
	public void getAnEmployee(){
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestSpec = RestAssured.given();
		Response response = requestSpec.request(Method.GET,"employees/1");
		
		System.out.println(response.asPrettyString());
		
	}
}

