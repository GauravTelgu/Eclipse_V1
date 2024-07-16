package com.maveric.project.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maveric.project.utils.DriverFactory;

public class Waitdemo {

	public static void main(String[] args) throws InterruptedException {
		String baseurl = "https://www.makemytrip.com/";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']"))));
		element.click();
		System.out.println("Element is clicked");
		driver.findElement(By.xpath(""));
		
	}
}