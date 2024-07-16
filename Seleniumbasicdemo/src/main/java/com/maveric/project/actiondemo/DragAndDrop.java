package com.maveric.project.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.utils.DriverFactory;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseurl = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		
		act.dragAndDrop(rome, italy).perform();
		
	}

}
