package com.maveric.yatra.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	public static WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gauravra\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\gauravra\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
		}
	
	
}
