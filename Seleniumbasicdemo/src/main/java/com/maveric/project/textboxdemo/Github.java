package com.maveric.project.textboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maveric.project.utils.DriverFactory;

public class Github {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= DriverFactory.getDriver();
		
		// TODO Auto-generated method stub
		Github gh = new Github();
		String baseurl ="https://github.com/login";
		driver.get(baseurl);
		gh.gitlogin();
		
	}
		
	public void gitlogin() throws InterruptedException {
		 WebDriver driver= DriverFactory.getDriver();
		// TODO Auto-generated method stub
		driver.findElement(By.name("login")).sendKeys("Gaurav");
		driver.findElement(By.name("password")).sendKeys("Gt@250398");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();				//Xpath
		
		
	}

}
