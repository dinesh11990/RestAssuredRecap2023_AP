package com.ems.bdd.style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;


public class GetAllEmployeesBDD {

	@Test (enabled=false)
	public void getAllEmployees(){

		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();
	}

	@Test (enabled=false)
	public void createAnEmployeeBDD(){
		
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body("{\r\n"
						+ " \"first_name\": \"Jain\",\r\n"
						+ " \"last_name\": \"LOR\",\r\n"
						+ " \"email\": \"dinesh11990@hotmail.com\"\r\n"
						+ "\r\n"
						+ "}")
		.when()
		.post("/employees/5")
		.prettyPrint();

	}
	
	@Test(enabled=false)
	public void updateAnEmployeeBDD(){
		
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ " \"first_name\": \"Heroldi\",\r\n"
				+ " \"last_name\": \"LOR\",\r\n"
				+ " \"email\": \"dinesh11990@hotmail.com\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.put("/employees/4")
		.prettyPrint();
	}
	
	@Test
	public void deleteAnEmployeeBDD(){
		
		given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/4")
		.prettyPrint();
		
	}
	
	@Test
	public void createEmployeeFromJsonFile() {
		
		File jsonFile = new File("postData.json");
		given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type", "application/json")
			.body(jsonFile)
			.when()
			.post("/employees")
			.prettyPrint();
			
	}


}
