package com.maveric.project.textboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.utils.DriverFactory;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseurl ="https://www.google.com";
		
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Amazon");
		driver.findElement(By.name("btnK")).click();
		//driver.close();
		
		
		
	}

}
