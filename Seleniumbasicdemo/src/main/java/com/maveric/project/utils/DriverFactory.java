package com.maveric.project.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
		public static WebDriver getDriver() throws InterruptedException {
		
			
			//1 Explicit way by setting up the chromedriver and chrome exe (mock browser/test browser)
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauravra\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//	String baseurl ="https://www.google.com";
			
		//2 - Implicit way to configure Selenium Driver - WebDriverManager
			
	//		WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
	//		options.addArguments("headless");
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			
			//1	
			options.setBinary("C:\\Users\\gauravra\\chrome-win64\\chrome-win64\\chrome.exe");
			
			WebDriver driver= new ChromeDriver(options);
			driver.manage().window().maximize();
			Thread.sleep(2000);
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	driver.get(baseurl);
			return driver;
			
			
			
			
		}
	

	

}
