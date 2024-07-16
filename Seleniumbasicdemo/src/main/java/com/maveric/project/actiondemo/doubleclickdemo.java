package com.maveric.project.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.utils.DriverFactory;

public class doubleclickdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseurl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		Actions act = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));	
		
		act.doubleClick(doubleclick).perform();
	}

}
