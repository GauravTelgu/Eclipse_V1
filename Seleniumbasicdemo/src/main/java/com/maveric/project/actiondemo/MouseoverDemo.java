package com.maveric.project.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.utils.DriverFactory;

public class MouseoverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseurl = "https://rahulshettyacademy.com/AutomationPractice/";
		
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement mouseover = driver.findElement(By.id("mousehover"));
		WebElement mouseTop = driver.findElement(By.xpath("//a[normalize-space()='Reload']"));	
		act.moveToElement(mouseover).moveToElement(mouseTop).click().perform();
		driver.close();
		
	}

}
