package com.maveric.project.test;

import static org.hamcrest.CoreMatchers.equalToObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpStatus;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.project.pojos.EmployeeCsvPojo;
import com.maveric.project.pojos.EmployeePojo;
import com.opencsv.bean.CsvToBeanBuilder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestApiTest1 {

	@BeforeClass
	public static void SetupEnv() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
	}

	@Ignore
	@Test(testName = "Get All Employee details")
	public void test1() {
		// Normal response required Assertion to test
		Response response = RestAssured.get("/employees");
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response);

		// Validatable response**
		String responsebody = RestAssured.get("/employees").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);
	}

	@Ignore
	@Test(testName = "Get specific employee details  (using Query paramaeter)")
	public void test2() {
		RestAssured.given().queryParam("id", 1).get("/employee").then().assertThat().statusCode(200).and()
				.body("employee_name", equalToObject("Tiger Nixon"));
	}

	@Ignore
	@Test(testName = "Get specific employee details  (using path paramaeter)")
	public void test3() {
		RestAssured.get("/employee/1").then().assertThat().statusCode(200).and().body("employee_name",
				equalToObject("Tiger Nixon"));
	}

	@Ignore
	@Test(testName = "Add new Employee details")
	public void test4() {

		String payload = "{name: test, salary:1000, age:25}";
		RestAssured.given().contentType(ContentType.JSON).body(payload).post("/create").then().assertThat()
				.statusCode(HttpStatus.SC_CREATED).and()
				.body("message", equalToObject("Successfully! Record has been added"));
	}

	@Ignore
	@Test(testName = "Add new Employee details")
	public void test5() {

		// String payload = "{name: test; salary:1000; age:25}";

		HashMap<String, String> payload = new HashMap<>();
		payload.put("name", "Gaurav");
		payload.put("salary", "10000");
		payload.put("age", "25");

		RestAssured.given().contentType(ContentType.JSON).body(payload).post("/create").then().assertThat()
				.statusCode(HttpStatus.SC_CREATED).and().body(CoreMatchers.containsString("Successfully"));
	}

	@Ignore
	@Test(testName = "Add new Employee details using employee.json file")
	public void test6() throws DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/EmployeeData.json"));

		EmployeePojo payload = mapper.readValue(stream, EmployeePojo.class);
		RestAssured.given().contentType(ContentType.JSON).body(payload).post("/create").then().assertThat()
				.body("message", equalToObject("Successfully! Record has been added"));
	}

	
	@Ignore
	@Test(testName = "Json to pojo")
	public void test7() throws IOException {

		String responsebody = RestAssured.get("/employees").then().assertThat().statusCode(200).and().log().body()
		.extract().asString();
		System.out.println("Response Body:");
		System.out.println(responsebody);

		ObjectMapper objectMapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/EmployeeData.json"));
		EmployeePojo employee = objectMapper.readValue(stream, EmployeePojo.class);
		
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Age: " + employee.getAge());
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Ignore
	@Test(testName = "Add new employee details using employee csv file")
	public void test8() throws DatabindException, IOException {
		String uri = "/create";
 
		/*
		 * FileReader reader = new FileReader("./TestData/EmployeeMockData.csv");
		 * CsvToBeanBuilder<EmployeeCsvPojo> beanBuilder = new CsvToBeanBuilder(reader);
		 * beanBuilder = beanBuilder.withType(EmployeeCsvPojo.class);
		 * CsvToBean<EmployeeCsvPojo> toBean = beanBuilder.build();
		 * List<EmployeeCsvPojo> beans = toBean.parse();
		 */
 
		List<EmployeeCsvPojo> beans = new CsvToBeanBuilder(new FileReader("./TestData/EmployeeMockData.csv")) // example of builder pattern
				.withType(EmployeeCsvPojo.class).build().parse();
 
		  RestAssured.given() 
		  .contentType(ContentType.JSON) .
		  body(beans).
		  post(uri)
		  .then() .
		  assertThat().
		  body("name",  equalToObject("Successfully! Record has been added."));
	}


	@Test(testName = "update employee details")
	public void test9() {
		
		String name = "Gaurav Telgu";
	     int salary = 40000;
	     int age = 26;
	 
	     String requestBody = "{\n" +
	             "    \"name\": \"" + name + "\",\n" +
	             "    \"salary\": " + salary + ",\n" +
	             "    \"age\": " + age + "\n" +
	             "}";
	 
	     
	             Response response = RestAssured.given()
	             .contentType(ContentType.JSON)
	             .body(requestBody)
	             .put("/employees");
	             System.out.println(requestBody);
	}

	
	@Test(testName = "delete employee details")
	public void test10() {
			
			String name = "Gaurav Telgu"; // Assuming you have the employee name you want to delete

			Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.delete("/employees/" + name);
				
			System.out.println("Deleted employee with name: " + name);
		
		
	}
	
	@AfterClass
	public static void tearDownEnv() {
		RestAssured.reset();
	}
}
