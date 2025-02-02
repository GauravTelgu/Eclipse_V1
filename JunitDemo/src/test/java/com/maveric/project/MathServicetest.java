package com.maveric.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.maveric.project.exceptions.InvalidRangeException;
import com.maveric.project.service.Mathservice;
import com.maveric.project.service.MathserviceCalc.MathserviceCalc;

public class MathServicetest {
	private static Mathservice mathservicecalculator;
	
	@BeforeAll
	public static void Setup() {
		mathservicecalculator= new MathserviceCalc();
	}
	
	@Test
	@DisplayName("Addtion of 1st positive and 2nd negative ")
	public void test1stpositiveand2ndnegative1() throws InvalidRangeException {
		
		//Assertions.assertEquals(c,mathservicecalculator.add(10,20));
		Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.add(10, -12));	
	}
		@Test
		@DisplayName("Addtion of 2nd positive and 1st negative ")
		public void test2ndpositiveand1stnegative() {
		Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.add(-100, 100));
	}
	
		@Test
		@DisplayName("Addtion of 1st positive and 2nd positive ")
		public void test1stpositiveand2ndnegative() throws InvalidRangeException {
			int a =10;
			int b=20;
			int c = a +b;
			
			Assertions.assertEquals(c,mathservicecalculator.add(10,20));
			//	Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.add(10, -12));	
		}
		
		@Test
		@DisplayName("Subtraction of 1st positive and 2nd negative ")
		public void test1stpositiveand2ndnegative1sub() throws InvalidRangeException {
			
			//Assertions.assertEquals(c,mathservicecalculator.add(10,20));
			Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(10, -12));	
		}
			@Test
			@DisplayName("Subtraction of 2nd positive and 1st negative ")
			public void test2ndpositiveand1stnegativesub() {
			Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(-100, 100));
		}
		
			@Test
			@DisplayName("Subtraction of 1st positive and 2nd positive ")
			public void test1stpositiveand2ndnegativesub() throws InvalidRangeException {
				int a =10;
				int b=20;
				int c = a-b;
				
				Assertions.assertEquals(c,mathservicecalculator.sub(10,20));
				//	Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.add(10, -12));	
			}
			
			@Test
			@DisplayName("Division of 1st positive and 2nd as 0 ")
			public void test1stpositiveand2ndzerodiv() throws InvalidRangeException {
				
				//Assertions.assertEquals(c,mathservicecalculator.add(10,20));
				Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(10, 0));	
			}
				@Test
				@DisplayName("Division of 2nd negative and 1st positive ")
				public void test2ndnegativeand1stpositivediv() {
				Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(30, -10));
			}
			
				@Test
				@DisplayName("Division of 1st positive and 2nd positive ")
				public void test1stpositiveand2ndpositivediv() throws InvalidRangeException {
					int  a= 10;
					int b=2;
					int c = a/b;
					
					Assertions.assertEquals(c,mathservicecalculator.sub(10,2));
				}
				
					@Test
					@DisplayName("Division of 1st positive and 2nd as 0 ")
					public void test1stpositiveand2ndzeromul() throws InvalidRangeException {
						
						//Assertions.assertEquals(c,mathservicecalculator.add(10,20));
						Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(10, 0));	
					}
						@Test
						@DisplayName("Division of 2nd negative and 1st positive ")
						public void test2ndnegativeand1stpositivemul() {
						Assertions.assertThrows(InvalidRangeException.class, ()-> mathservicecalculator.sub(30, -10));
					}
					
						@Test
						@DisplayName("Division of 1st positive and 2nd positive ")
						public void test1stpositiveand2ndnegativemul() throws InvalidRangeException {
							int  a= 10;
							int b=2;
							int c = a/b;
							
							Assertions.assertEquals(c,mathservicecalculator.sub(10,2));
}
}
