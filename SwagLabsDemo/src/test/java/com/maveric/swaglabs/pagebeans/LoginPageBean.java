package com.maveric.swaglabs.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean {

	@FindBy(how = How.NAME, name="user-name")
	private WebElement username;
	
	@FindBy(how = How.ID, id = "password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, xpath = "//input[@type='submit']")
	private WebElement login;
	
	@FindBy(how = How.XPATH, xpath = "//h3[@data-test='error']")
	private WebElement errormsg;

	
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
		this.password.sendKeys(password);;
	}

	public String getErrormsg() {
		return errormsg.getText();
	}

	public void Login() {
		login.submit();
	}
	
	
	
}
