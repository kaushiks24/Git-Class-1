package com.hexa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testtng {

	@BeforeClass
	private void beforeClass() {
 
		System.out.println("launch");
	}
	@Test
	private void tc1() {

		System.out.println("tc1");
	}
	
	@Test
	private void tc2() {

		System.out.println("tc2");
	}
	
	@AfterMethod
	private void afterMethod() {


		System.out.println("strt time");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
    System.out.println("end time");
	}
	
    @AfterClass
    private void afterClass() {

    	System.out.println("quit");
	}
}
