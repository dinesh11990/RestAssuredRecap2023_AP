package com.ems.json_schema_validation;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	
	@Test
	public void validationusingJsonSchemaInClassPath(){
		
		File inputJson = new File ("src/test/resources/input.json");
		
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		
		
	}

}
