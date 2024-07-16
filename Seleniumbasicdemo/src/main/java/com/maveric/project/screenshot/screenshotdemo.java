package com.maveric.project.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class screenshotdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String baseurl ="https://demo.nopcommerce.com/";
		
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\gauravra\\OneDrive - Maveric Systems Limited\\Pictures\\Screenshots\\Screenshot1.png");
		FileUtils.copyFile(src, trg);
		driver.close();
		
		//To read a file we need a stream 
		
	}

}
