package com.maveric.project.suite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestSuite {
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite()");
  }

}
