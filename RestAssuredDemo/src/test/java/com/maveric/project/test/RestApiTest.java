package com.maveric.project.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.equalToObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.project.pojos.RegisterPojo;
import com.maveric.project.pojos.UserPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RestApiTest {

	@BeforeClass
	public static void setupEnv() {
		RestAssured.baseURI = "https://reqres.in/api";
	}
	
	//@Ignore
	@Test(testName = "List Users")
	public void test1() {

		String responsebody = RestAssured.get("users?page=2").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);

	}
	
	@Ignore
	@Test(testName = "Single User for 2nd id")
	public void test2() {

		String responsebody = RestAssured.get("users/2").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	@Test(testName = "Single User not found")
	public void test3() {

		String responsebody = RestAssured.get("users/23").then().assertThat().statusCode(404).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	
	@Test(testName = "List unknowm Resource ")
	public void test4() {

		String responsebody = RestAssured.get("unknown").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	@Test(testName = "Single Resource")
	public void test5() {

		String responsebody = RestAssured.get("unknown/2").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	@Test(testName = "Single Resource not found")
	public void test6() {

		String responsebody = RestAssured.get("unknown/23").then().assertThat().statusCode(404).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	@Test(testName = "Delay")
	public void test7() {

		String responsebody = RestAssured.get("users?delay=3").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);
	}
	
	@Test(testName = "Create User")
	public void test8() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/userdata.json"));
		UserPojo payload = mapper.readValue(stream, UserPojo.class);

		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/users")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_CREATED)
		.and()
		.body("name", equalTo("morpheus"))
		.log()
		.all();

	}
	
	@Test(testName = "Update using Put")
	public void test9() {
				
		String name = "morpheus";
		String job = "zion resident";
	  
	 
	     String requestBody = "{\n" +
	             "    \"name\": \"" + name + "\",\n" +
	             "    \"job\": \"" + job + "\n" +
	    	             "}";
	 
	     
	             Response response = RestAssured.given()
	             .contentType(ContentType.JSON)
	             .body(requestBody)
	             .put("users/2");
	             System.out.println(requestBody);
		
	}
	
	@Test(testName = "UPDATE using Patch.")
	public void test10() {
		String name = "morpheus";
		String job = "zion resident";
 
		String requestBody = "{\n" +
	             "    \"name\": \"" + name + "\",\n" +
	             "    \"job\": \"" + job + "\n" +
	    	             "}";
	 		
		RestAssured.given()
        .contentType(ContentType.JSON)
        .body(requestBody)
        .patch("users/2");
        System.out.println(requestBody);
	}
	
	@Test(testName="Delete User details")
	public void test11() {
		
		 RestAssured.given()
		.contentType(ContentType.JSON)
		.delete("/users/2")
		.then()
		.assertThat().statusCode(204).log().body();
 
	}

	@Test(testName = "Successful Registration")
	public void test12() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/RegisterData.json"));
		RegisterPojo payload = mapper.readValue(stream, RegisterPojo.class);

		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/register")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.log()
		.all();

	}
	
	@Test(testName = "Unsuccessful Registration")
	public void test13() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/RegisterData1.json"));
		RegisterPojo payload = mapper.readValue(stream, RegisterPojo.class);

		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/register")
		.then()
		.assertThat()
		.statusCode(400)
		.and()
		.log()
		.all();
	}
	
	@Test(testName = "Login Successful")
	public void test14() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/LoginData.json"));
		RegisterPojo payload = mapper.readValue(stream, RegisterPojo.class);

		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/login")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.log()
		.all();

	}
	
	@Test(testName = "Login Unsuccessful")
	public void test15() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/LoginData1.json"));
		RegisterPojo payload = mapper.readValue(stream, RegisterPojo.class);

		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/login")
		.then()
		.assertThat()
		.statusCode(400)
		.and()
		.log()
		.all();

	}
}		

