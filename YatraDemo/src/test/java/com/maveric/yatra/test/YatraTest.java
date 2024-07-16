package com.maveric.yatra.test;

import org.junit.jupiter.api.AfterAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maveric.yatra.pagbeans.Yatrapagebean;
import com.maveric.yatra.utils.DriverFactory;

public class YatraTest {

	public WebDriver driver;
	public Yatrapagebean Ybean;

	@BeforeMethod
	public void setupEnv() {
		driver = DriverFactory.getdriver();
		driver.get("https://www.yatra.com/");
		Ybean = PageFactory.initElements(driver, Yatrapagebean.class);
	}

	
	@Test(testName ="Book flight from Pune to Mumbai")
	public void test1() {
		Ybean.ClickFlights();
		Ybean.Roundtrip();
		Ybean.setFlightOrigin("Pune");
		Ybean.setFlightDestination("Mumbai");
	}
	
	@AfterAll
	public void teardownEnv() {
		driver.quit();
	}

}
