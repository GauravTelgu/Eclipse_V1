package com.maveric.project.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPageBean {

	@FindBy(how = How.XPATH, xpath = "(//input[@type='text'])[1]")
	private WebElement FirstName;
	
	@FindBy(how = How.XPATH, xpath = "(//input[@type='text'])[2] ")
	private WebElement LastName;
	
	@FindBy(how = How.XPATH, xpath = "//input[@type='email']")
	private WebElement Email;
	
	@FindBy(how = How.XPATH, xpath = "//input[@type='tel']")
	private WebElement PhoneNumber;
	
	@FindBy(how = How.XPATH, xpath = "(//input[@type='radio'])[1]")
	private WebElement GenderMale;
	
	@FindBy(how = How.XPATH, xpath = "//button[@type='submit']")
	private WebElement Submit;
	
	
	
	public String getFirstName() {
		return FirstName.getText();
	}

	public void setFirstName(String FirstName) {
		this.FirstName.sendKeys(FirstName);;
	}

	public String getLastName() {
		return LastName.getText();
	}

	public void setLastName(String LastName) {
		this.LastName.sendKeys(LastName);
	}

	public String getEmail() {
		return Email.getText();
	}

		public void setEmail(String Email) {
		this.Email.sendKeys(Email);
	}

	public String getPhoneNumber() {
		return PhoneNumber.getText();
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber.sendKeys(PhoneNumber);
	}

	public void Gender() {
		GenderMale.click();
	}

	public void submitbtn() {
		Submit.submit();
	}
	
}
