package com.maveric.git.test;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.maveric.git.dataprovider.TestDataProvider;
import com.maveric.git.dataprovider.TestDataProviderExcel;
import com.maveric.git.pagebeans.LoginPageBean;
import com.maveric.project.utils.DriverFactory;

public class LoginTest {

	private WebDriver driver;
	private LoginPageBean pageBean;

	@BeforeMethod
	public void setupTestEnv() {
		driver = DriverFactory.getDriver();
		driver.get("https://github.com/login");
		pageBean = PageFactory.initElements(driver, LoginPageBean.class);
	}

	/*
	 * @Test(testName = "Test Git for Invalid Credentials") public void test1() {
	 * 
	 * pageBean.setUsername("Gaurav"); pageBean.setPassword("Gt123456");
	 * pageBean.signIn(); String expectedErrorMsg =
	 * "Incorrect username or password."; String actualErrorMsg =
	 * pageBean.getErrorMessage(); Assertions.assertEquals(expectedErrorMsg,
	 * actualErrorMsg);
	 */

	// Data Provider

	/*
	 * @Test(testName = "Test Git for Invalid Credentials",dataProviderClass =
	 * TestDataProvider.class,dataProvider = "getInValidUsernameorInvalidPassword")
	 * public void test1(String username, String password) {
	 * 
	 * pageBean.setUsername(username); pageBean.setPassword(password);
	 * pageBean.signIn(); String expectedErrorMsg =
	 * "Incorrect username or password."; String actualErrorMsg =
	 * pageBean.getErrorMessage(); Assertions.assertEquals(expectedErrorMsg,
	 * actualErrorMsg);
	 */

	// DataProvider Using Excel

	@Test(testName = "Test Git for Invalid Credentials", dataProviderClass = TestDataProviderExcel.class, dataProvider = "getInValidUsernameorInvalidPassword")
	public void test1(String username, String password) {

		pageBean.setUsername(username);
		pageBean.setPassword(password);
		pageBean.signIn();
		String expectedErrorMsg = "Incorrect username or password.";
		String actualErrorMsg = pageBean.getErrorMessage();
		Assertions.assertEquals(expectedErrorMsg, actualErrorMsg);

		/*
		 * driver.findElement(By.name("login")).sendKeys("Gaurav");
		 * driver.findElement(By.name("password")).sendKeys("Gt@250398");
		 * driver.findElement(By.name("commit")).click();
		 * driver.findElement(By.xpath("//input[@type='submit']")).submit();
		 */

	}

	/*
	 * @Test(testName = "Test Git for Valid Credentials",dataProviderClass =
	 * TestDataProvider.class,dataProvider ="getUsernameandPassword") public void
	 * test2(String username, String password) {
	 * 
	 * pageBean.setUsername(username); pageBean.setPassword(password);
	 * pageBean.signIn();
	 * 
	 * String expectedErrorMsg = "Incorrect username and password"; String
	 * actualErrorMsg = pageBean.getErrorMessage();
	 * Assertions.assertEquals(expectedErrorMsg, actualErrorMsg);
	 * 
	 * System.out.println("Login Successful");
	 */

	
	//DataProvider using Excel
	
	@Test(testName = "Test Git for Valid Credentials", dataProviderClass = TestDataProviderExcel.class, dataProvider = "getUsernameandPassword")
	public void test2(String username, String password) {

		pageBean.setUsername(username);
		pageBean.setPassword(password);
		pageBean.signIn();
		/*
		 * String expectedErrorMsg = "Incorrect username and password"; String
		 * actualErrorMsg = pageBean.getErrorMessage();
		 * Assertions.assertEquals(expectedErrorMsg, actualErrorMsg);
		 */
		System.out.println("Login Successful");
	}

	/*
	 * @AfterMethod public void teardownTest() { //driver.close(); }
	 */
}
