package com.ems.nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	/*@Test(enabled = false)
	public void getAllEmployees(){

		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response =requestSpecification.request(Method.GET, "employees");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}
	@Test(enabled = false)
	public void createAnEmployee(){

		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification = 
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ " \"first_name\": \"Agni\",\r\n"
						+ " \"last_name\": \"A\",\r\n"
						+ " \"email\": \"dinesh11990\"\r\n"
						+ "\r\n"
						+ "}");


		Response response = requestSpecification.request(Method.POST,"employees");
		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}
	public void deleteAnEmployee(){

		RestAssured.baseURI="http://localhost:3000";

		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.DELETE,"/employees/6");
		System.out.println(response.asPrettyString());

	}*/

}
