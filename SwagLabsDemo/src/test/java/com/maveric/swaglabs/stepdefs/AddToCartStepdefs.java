package com.maveric.swaglabs.stepdefs;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.maveric.swaglabs.databeans.Customerbean;
import com.maveric.swaglabs.databeans.Productbean;
import com.maveric.swaglabs.databeans.Userbean;
import com.maveric.swaglabs.pagebeans.AddToCartPagebean;
import com.maveric.swaglabs.pagebeans.LoginPageBean;
import com.maveric.swaglabs.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepdefs {
	private WebDriver driver;
	private LoginPageBean pagebean;
	private AddToCartPagebean ACPagebean;
	private Userbean bean;
	private Productbean pbean;
	String baseurl = "https://www.saucedemo.com/";

	@Before
	public void SetupEnv() {
		driver = DriverFactory.getdriver();
		pagebean = PageFactory.initElements(driver, LoginPageBean.class);
		ACPagebean = PageFactory.initElements(driver, AddToCartPagebean.class);
	}

	@DataTableType
	public Productbean productdatabean(List<String> productbean) {
		Productbean pbean = new Productbean();
		pbean.setProduct(productbean.get(0));
		return pbean;
	}

	@Given("User is successfully logged in to SwagLabs account")
	public void user_is_successfully_logged_in_to_swag_labs_account() {
		driver.get(baseurl);
		pagebean.setUsername("standard_user");
		pagebean.setPassword("secret_sauce");
		pagebean.Login();
		System.out.println("User successfully logged in to Swag Labs");
	}

	@When("User clicks on Add to cart for multiple products")
	public void user_clicks_on_add_to_cart_for_multiple_products(List<Productbean> productbean)
			throws InterruptedException {
		System.out.println("Below list of Products are selected");
		for (Productbean pbean : productbean) {
			System.out.println("Product: " + pbean.getProduct());
			if (pbean.getProduct().equals("Sauce Labs Backpack"))
				ACPagebean.AddItem1();
			else if (pbean.getProduct().equals("Sauce Labs Bike Light"))
				ACPagebean.AddItem2();
			else if (pbean.getProduct().equals("Sauce Labs Bolt T-Shirt"))
				ACPagebean.AddItem3();
			Thread.sleep(3000);
		}

	}

	@When("clicks on the cart")
	public void clicks_on_the_cart() throws Exception {
		ACPagebean.cartBtnClick();
		Thread.sleep(3000);
	}

	@Then("User should view the added products in Your Cart")
	public void user_should_view_the_added_products_in_your_cart() throws Exception {
		Thread.sleep(2000);
	}

	@Then("user clicks on Checkout button")
	public void user_clicks_on_checkout_button() throws Exception {
		ACPagebean.checkoutbutton();
		Thread.sleep(3000);
	}

	@DataTableType
	public Customerbean customerbeandata(Map<String, String> custbean) {
		Customerbean cbean = new Customerbean();
		cbean.setFirstname(custbean.get("firstname"));
		cbean.setLastname(custbean.get("lastname"));
		cbean.setPostalcode(custbean.get("postalcode"));
		return cbean;
	}

	@Then("User should Enter Customer details")
	public void user_should_enter_customer_details(Customerbean cbean) throws Exception {
		ACPagebean.setFirstname(cbean.getFirstname());
		Thread.sleep(3000);
		ACPagebean.setLastname(cbean.getLastname());
		Thread.sleep(3000);
		ACPagebean.setPostalcode(cbean.getPostalcode());
		Thread.sleep(3000);
		System.out.println("Customer details entered Successfully");

		/*
		 * ACPagebean.setFirstname("Gaurav"); Thread.sleep(2000);;
		 * ACPagebean.setLastname("Telgu"); Thread.sleep(2000);
		 * ACPagebean.setPostalcode("486213"); Thread.sleep(4000);
		 */
	}

	@Then("Click on Continue")
	public void click_on_continue() throws Exception {
		ACPagebean.Continuebutton();
		Thread.sleep(3000);
	}

	@Then("User should view Checkout overview")
	public void user_should_view_checkout_overview() {
	}

	@Then("Click on Finish")
	public void click_on_finish() throws Exception {
		ACPagebean.Finishbutton();
		Thread.sleep(3000);
		
	}

	@Then("User should view Thank you for your order!")
	public void user_should_view_thank_you_for_your_order() {
	    String ExpecedMsg = "Thank you for your order!";
	    String ActualMsg = ACPagebean.getThankyoumsg();
	    Assert.assertEquals(ExpecedMsg, ActualMsg);
	    System.out.println(ActualMsg);
	    
	}
	
	@After
	public void teardownEnv(Scenario scenario) {
		// takesScreenshot = (TakesScreenshot) driver; byte [] screenShot=
		// takesScreenshot.getScreenshotAs(OutputType.BYTES);
		// scenario.attach(screenShot, "image/png", "Thankyou Screenshot");
		driver.quit();
	}

}
