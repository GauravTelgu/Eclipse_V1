package com.maveric.project.dropdowndemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maveric.project.utils.DriverFactory;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseurl = "https://rahulshettyacademy.com/AutomationPractice/";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		
		Select selectdrp = new Select(element);				//Create a select object
		selectdrp.selectByIndex(1);
		selectdrp.selectByValue("option2");
		selectdrp.selectByVisibleText("Option3");
		
		List<WebElement> dropdown = selectdrp.getOptions();			//Get all options from the dropdown
		
		for(WebElement opt: dropdown)
		{
			System.out.println(opt.getText());
		}
		WebElement firstselectedoption = selectdrp.getFirstSelectedOption();
		// System.out.println(firstselectedoption.getText());
		 
		driver.close();
	}

}
