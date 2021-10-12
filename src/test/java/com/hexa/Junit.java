package com.hexa;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	static WebDriver driver;
	@BeforeClass
	public static void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	@Before
	public void before()
	{
		java.util.Date d = new java.util.Date();
		System.out.println(d);
	}

    @Test
    public void testcase() throws InterruptedException
    {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
    	WebElement tuser = driver.findElement(By.id("email"));
    	tuser.sendKeys("kaushik@gmail.com");

    	WebElement tpass = driver.findElement(By.id("pass"));
    	tpass.sendKeys("kaushik");
    	WebElement btn = driver.findElement(By.name("login"));
    	Thread.sleep(9000);
    	btn.click();
    }
    
    @After
    public void afer()
    {
    	java.util.Date d = new java.util.Date();
    	System.out.println(d);
    	
    }
    
    @AfterClass
    public static void afterClass()
    {
    	driver.quit();
    }
}
