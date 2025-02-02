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
import com.maveric.project.pojos.PassengerPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class RestApiTest {

	@BeforeClass
	public static void SetupEnv() {
		RestAssured.baseURI = "https://api.instantwebtools.net/v1";
	}

	@Ignore
	@Test(testName = "Read all airlines details.")
	public void test1() {

		// Validatable response**

		String responsebody = RestAssured.get("/airlines").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);

	}

	@Ignore
	@Test(testName = "Create airline data.")
	public void test2() throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/Airlinedata.json"));
		Airlinepojo payload = mapper.readValue(stream, Airlinepojo.class);

		ValidatableResponse response = RestAssured.given()
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

	@Ignore
	@Test(testName = "Read airline by airline ID.")
	public void test3() {

		String airLineID = "79ea7cec-8ae6-46b2-90ff-6772ae8c85a7";

		RestAssured.given().pathParam("id", airLineID).get("/airlines/{id}").then().assertThat().statusCode(200).and()
		.body("_id", equalToObject(airLineID)).log().all();

	}
	
	
	
	@Test(testName = "Create passenger using correct passenger data.")
	public void test4() throws StreamReadException, DatabindException, IOException {

		/*
		 * ObjectMapper mapper = new ObjectMapper(); FileInputStream stream = new
		 * FileInputStream(new File("./TestData/passengerdata.json")); PassengerPojo
		 * payload = mapper.readValue(stream, PassengerPojo.class);
		 * 
		 * RestAssured.given() .contentType(ContentType.JSON) .body(payload)
		 * .post("/passenger") .then() .assertThat() .statusCode(HttpStatus.SC_OK)
		 * .and() .body("name", equalTo("John Doe")) .log().all();
		 */
		
		
		HashMap<String, String> payload = new HashMap<>();
		payload.put("name", "John Doe");
		payload.put("trips", "250");
		payload.put("airline", "5");

		RestAssured.given().contentType(ContentType.JSON).body(payload).post("/passenger").then().assertThat()
				.statusCode(HttpStatus.SC_CREATED).and().body(CoreMatchers.containsString("Successfully")).log().all();
	}
	
	
	@Ignore
	@Test(testName = "Read Passenger Data by passenger ID")
	public void test5() {
		String passengerID = "667945df7ad8fb0bc9433c48";
 
		RestAssured.given().pathParam("id", passengerID).get("/passenger/{id}").then().assertThat().statusCode(200)
				.and().body("_id", equalToObject(passengerID)).log().all();
		
	}
	
	@Ignore
	@Test(testName = "Delete passenger by using passenger ID.")
	public void test6() {
		
		/*RestAssured.given().pathParam("id", passengerID).delete("/passenger/{id}").then().assertThat().statusCode(200)
				.and().body("_id", equalToObject(passengerID)).log().all();
		*/
	
		String passengerID = "667aaf5c7ad8fbee82434292";

		Response response = 
			RestAssured.given()
			.contentType(ContentType.JSON)
			.delete("/passenger/" + passengerID);
			
		System.out.println("Deleted Passenger : " + passengerID);
		
	}
		
	@Ignore
	@Test(testName = "UPDATE passenger name with correct passenger ID.")
	public void test7() {
		String passengerID = "667aafa07ad8fbcd834342a6";
		String newName = "Jospeh Francis";
 
		String payload = "{\"name\": \"" + newName + "\"}";
 
		RestAssured.given().contentType(ContentType.JSON).pathParam("id", passengerID).body(payload).when()
				.patch("/passenger/{id}").then().assertThat().statusCode(200).and()
				.body("message", equalToObject("Passenger data updated successfully.")).log().all();
 
	}
	
	
	@Ignore
	@Test(testName = "Update every detail of a passenger.")
	public void test8() {
				
		String passengerID = "6679447b7ad8fb3f5e433c33";
		String newname = "Haulmer Airlines";
	    int trips = 500;
	    int airline = 10;
	 
	     String requestBody = "{\n" +
	             "    \"name\": \"" + newname + "\",\n" +
	             "    \"salary\": " + trips + ",\n" +
	             "    \"age\": " + airline + "\n" +
	             "}";
	 
	     
	             Response response = RestAssured.given()
	             .contentType(ContentType.JSON)
	             .pathParam("id",passengerID)
	             .body(requestBody)
	             .put("/passenger/{id}");
	             System.out.println(requestBody);
		
	}
	
	@Ignore
	@Test(testName = "Read all passengers with pagination support.")
    public void test9() {
        int page = 0;
        int size = 10;

        ValidatableResponse response = RestAssured.given()
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
	
}
