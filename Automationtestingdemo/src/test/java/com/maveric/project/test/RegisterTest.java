package com.maveric.project.test;

import org.testng.annotations.Test;

import com.maveric.project.pagebeans.RegisterPageBean;
import com.maveric.project.utils.DriverFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class RegisterTest {
 
	private WebDriver driver;
	private RegisterPageBean pagebean;
	
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		pagebean = PageFactory.initElements(driver, RegisterPageBean.class);
	}
  

  
  @Test()
  public void test1() {
	  
		pagebean.setFirstName("Gaurav");
		pagebean.setLastName("Telgu");
		pagebean.setEmail("gauravtelgu1@gmail.com");
		pagebean.setPhoneNumber("8974563021");
		pagebean.Gender();
		pagebean.submitbtn();
		
  }
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
