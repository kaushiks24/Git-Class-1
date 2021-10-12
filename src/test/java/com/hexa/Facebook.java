package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Facebook {

    @Test
    public void tc1(){
    	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 SoftAssert s = new SoftAssert();
		 s.assertTrue(driver.getCurrentUrl().contains("facebook"),"Verify url");
		 WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("kaushik@gmail.com");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("kaushik");
		s.assertEquals(txtPass.getAttribute("value"), "java","Verify password");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		s.assertAll();
	}
    
    

	
	
}
