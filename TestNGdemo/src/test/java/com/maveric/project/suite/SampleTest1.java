package com.maveric.project.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest1 {
  
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest()");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass()");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Beforemethod()");
	}
	
	@Test
	public void test1() {
		System.out.println("test1()");
	}
	
	@Test
	public void test2() {
		System.out.println("test2()");
	}
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod()");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Afterclass()");
	}
	
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest()");
	}
	
 }
