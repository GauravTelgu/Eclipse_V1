package com.maveric.project.Tabledata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class Tabledatademo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseurl ="https://www.techlistic.com/p/demo-selenium-practice.html";
		
		WebDriver driver=DriverFactory.getDriver();
		driver.get(baseurl);
		
		int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Number of rows:" + rows);
		
		int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("Number of col:" + col);
		
		String value1 = driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[3]")).getText();
		System.out.println(value1);
 
		String value2 = driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[1]")).getText();
		System.out.println(value2);
		
		for (int r=2; r<=rows; r++) {
			for(int c = 1; c <=col; c++) {
			String data = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
			System.out.println( data + " ");
			}
		}
		System.out.println();
		
	}

}
