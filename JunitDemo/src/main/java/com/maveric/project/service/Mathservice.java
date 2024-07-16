package com.maveric.project.service;

import com.maveric.project.exceptions.InvalidRangeException;

public interface Mathservice {

		public int add(int n1,int n2) throws InvalidRangeException;
		public int sub(int n1,int n2) throws InvalidRangeException;
		public int div(int n1,int n2) throws InvalidRangeException;
		public int mul(int n1,int n2) throws InvalidRangeException;
		
		
	}


