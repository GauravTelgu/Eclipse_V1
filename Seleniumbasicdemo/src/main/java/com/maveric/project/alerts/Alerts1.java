package com.maveric.project.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseurl = "https://the-internet.herokuapp.com/javascript_alerts";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		
		//Alert window for JS alert
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		//Alert window for JS Confirm
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();		//normalize-space() - Is a function which eleminates the space
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		//Alert window for JS Prompt
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();		//normalize-space() - Is a function which eleminates the space
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		alertwindow.sendKeys("Gaurav Telgu");
		driver.switchTo().alert().accept();
		
		
	}

}
