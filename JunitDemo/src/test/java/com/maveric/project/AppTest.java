package com.maveric.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest{
	@BeforeAll
	public static void setUpDevTestEnv() {
		System.out.println("setUpDevTestEnv()");
	}

	@BeforeEach
	public void setUpTestMocktDataEnv() {
		System.out.println("setUpTestMocktDataEnv()");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1()");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2()");
	}
	
	@AfterEach
	public void AftersetUpTestMocktDataEnv() {
		System.out.println("AftersetUpTestMocktDataEnv()");
	}
	
	@AfterAll
	public static void AftersetUpDevTestEnv() {
		System.out.println("AftersetUpDevTestEnv()");
	}
	
	
}