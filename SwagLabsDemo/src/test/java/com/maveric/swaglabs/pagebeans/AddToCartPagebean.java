package com.maveric.swaglabs.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPagebean {

	@FindBy(how = How.XPATH, xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
	private WebElement Item1;

	@FindBy(how = How.XPATH, xpath = "//button[@name='add-to-cart-sauce-labs-bike-light']")
	private WebElement Item2;

	@FindBy(how = How.XPATH, xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement Item3;

	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	private WebElement cartButton;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Checkout')]")
	private WebElement checkout;

	@FindBy(how = How.ID, id = "first-name")
	private WebElement firstname;

	@FindBy(how = How.ID, id = "last-name")
	private WebElement lastname;

	@FindBy(how = How.ID, id = "postal-code")
	private WebElement postalcode;

	@FindBy(how = How.XPATH, xpath = "//input[@type='submit']")
	private WebElement Continue;

	@FindBy(how = How.ID, id = "finish")
	private WebElement Finish;

	@FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'Thank you for your order!')]")
	private WebElement thankyoumsg;

	public void AddItem1() throws InterruptedException {
		Item1.click();
		Thread.sleep(5000);
	}

	public void AddItem2() throws InterruptedException {
		Item2.click();
		Thread.sleep(5000);
	}

	public void AddItem3() throws InterruptedException {
		Item3.click();
		Thread.sleep(5000);
	}

	public void cartBtnClick() {
		this.cartButton.click();
	}

	public void checkoutbutton() {
		this.checkout.click();
	}

	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);

	}

	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}

	public void setPostalcode(String postalcode) {
		this.postalcode.sendKeys(postalcode);
		;
	}

	public void Continuebutton() {
		this.Continue.click();
	}

	public void Finishbutton() {
		this.Finish.click();
	}
	
	public String getThankyoumsg() {
		return thankyoumsg.getText();
	}

}
