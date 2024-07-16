package com.maveric.project.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.equalToObject;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.hc.core5.http.HttpStatus;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.project.pojos.Airlinepojo;
import com.maveric.project.pojos.ClientAuthConstant;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SecuredFakeApiTest {
		
	@BeforeClass
	public static void setAuthEnv() {
		RestAssured.baseURI = "https://api.instantwebtools.net/v2";
		ClientAuthConstant.BEARER_TOKEN = RestAssured.given()
				.contentType("application/x-www-form-urlencoded; charset=utf-8")
				.formParam("grant_type", ClientAuthConstant.GRANT_TYPE)
				.formParam("scope", ClientAuthConstant.SCOPE)
				.formParam("username", ClientAuthConstant.USER_NAME)
				.formParam("password", ClientAuthConstant.PASSWORD)
				.formParam("client_id", ClientAuthConstant.CLIENT_ID)
				.when()
				.post("https://dev-457931.okta.com/oauth2/aushd4c95QtFHsfWt4x6/v1/token")
				.then()
				.extract()
				.path("access_token");
	}
	
	@Test(testName = "Get all airlines details")
	public void test1() {
		String airlinesDetails= RestAssured.given().headers(
	              "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.when()
		.get("/airlines")
		.then()
		.log().body().toString();
		System.out.println("======= " +airlinesDetails );
	}
 
	@Test(testName = "Get sepcific airline details")
	public void test2() {
		RestAssured.given().headers(
	              "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.when()
		.get("/airlines/73dd5420-3bf9-48f3-a0b6-17cf7aa61b19")
		.then()
		.assertThat()
		.body("name", equalToObject("American Airlines")).log().all();
		
	}
	
	@Test(testName = "Create airline data")
	public void test3() throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/Airlinedata.json"));
		Airlinepojo payload = mapper.readValue(stream, Airlinepojo.class);
		
		RestAssured.given().headers(
	              "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/airlines")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.body("name", equalTo("Sri Lankan Airways"))
		.log()
		.all();
	
	}	
	
	
	@Test(testName = "Read passenger by passenger ID")
	public void test4() {
		
		String passengerID = "667945df7ad8fb0bc9433c48";
		
		RestAssured.given()
		.headers( "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.pathParam("id", passengerID)
		.get("/passenger/{id}")
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.body("_id", equalToObject(passengerID))
		.log()
		.all();
		
	}
	
	@Test(testName = "Read all passengers. This endpoint supports pagination")
	public void test5() {
		
		int page = 0;
        int size = 10;
		
        ValidatableResponse response =	RestAssured.given()
		.headers( "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.contentType(ContentType.JSON)
        .queryParam("page", page)
        .queryParam("size", size)
        .get("/passenger")
        .then()
        .assertThat()
        .statusCode(200)
        .and()
        .body("data", notNullValue())
        .body("totalPages", notNullValue())
        .body("totalPassengers", notNullValue());
    System.out.println(response);
		
	}
	
	@Ignore
	@Test(testName = "Create passenger using correct passenger data")
	public void test6() throws StreamReadException, DatabindException, IOException {
		
		HashMap<String, String> payload = new HashMap<>();
		payload.put("name", "John Doe");
		payload.put("trips", "250");
		payload.put("airline", "5");
		
		RestAssured.given().headers(
	              "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/passenger")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_CREATED)
		.and()
		.body(CoreMatchers.containsString("Successfully"))
		.log().all();
	
	}	
	
	
	@Test(testName = "Delete passenger by using passenger ID.")
	public void test7() {
		
		String passengerID = "667aaf5c7ad8fbee82434292";

		Response response = 
				RestAssured.given()
				.headers( "Authorization",
			              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
			              "Content-Type",
			              ContentType.JSON,
			              "Accept",
			              ContentType.JSON)
			.contentType(ContentType.JSON)
			.delete("/passenger/" + passengerID);
			
		System.out.println("Deleted Passenger : " + passengerID);
		
	}
	
	@Test(testName = "UPDATE passenger name with correct passenger ID.")
	public void test8() {
		String passengerID = "667aafa07ad8fbcd834342a6";
		String newName = "Jospeh Francis";
 
		String payload = "{\"name\": \"" + newName + "\"}";
 
		RestAssured.given()
		.headers( "Authorization",
	              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
	              "Content-Type",
	              ContentType.JSON,
	              "Accept",
	              ContentType.JSON).contentType(ContentType.JSON).pathParam("id", passengerID).body(payload).when()
				.patch("/passenger/{id}").then().assertThat().statusCode(200).and()
				.body("message", equalToObject("Passenger data updated successfully.")).log().all();
 
	}
	
	@Test(testName = "Update every detail of a passenger.")
	public void test9() {
				
		String passengerID = "6679447b7ad8fb3f5e433c33";
		String newname = "Haulmer Airlines";
	    int trips = 500;
	    int airline = 10;
	 
	     String requestBody = "{\n" +
	             "    \"name\": \"" + newname + "\",\n" +
	             "    \"salary\": " + trips + ",\n" +
	             "    \"age\": " + airline + "\n" +
	             "}";
	 
	     
	     RestAssured.given()
			.headers( "Authorization",
		              "Bearer " + ClientAuthConstant.BEARER_TOKEN,
		              "Content-Type",
		              ContentType.JSON,
		              "Accept",
		              ContentType.JSON)
	             .contentType(ContentType.JSON)
	             .pathParam("id",passengerID)
	             .body(requestBody)
	             .put("/passenger/{id}");
	             System.out.println(requestBody);
		
	}
	
}
