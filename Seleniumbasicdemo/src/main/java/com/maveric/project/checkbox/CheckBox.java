package com.maveric.project.checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.utils.DriverFactory;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseurl = "https://demo.automationtesting.in/Register.html";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("checkbox1"));
		element.click();
		Thread.sleep(2000);
		System.out.println(element.isSelected());
		
		
		List<WebElement> totalcheckboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Number of Checkboxes:" + totalcheckboxes.size());
		
		driver.close();
		
		
	}

}

