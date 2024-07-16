package com.maveric.project.navigate;

import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=DriverFactory.getDriver();
		
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.close();
	}

}
