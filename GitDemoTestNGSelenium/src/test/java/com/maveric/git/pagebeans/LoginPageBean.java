package com.maveric.git.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean {
	
	@FindBy(how = How.NAME, name = "login")
	private WebElement username;
	
	@FindBy(how = How.NAME, name = "password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='js-flash-alert']")
	private WebElement errorMessage;
	
	@FindBy(how = How.XPATH, xpath  = "//input[@type='submit']")
	private WebElement commit;

	

	public String getUsername() {
		return username.getText();
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getPassword() {
		return password.getText();
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	 
	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public void signIn() {
		commit.submit();
	}
}
