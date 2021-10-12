package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {
	
	@Parameters({"userName","passWord","location","hotel","type","nRooms","checkIn","checkOut","adults","children",
		"firstname","lastname","billingaddr","ccnum","cctype","expmonth","expyear","cvvnum"})
    @Test
    private void tc1(String s1,String s2,String s3,String s4,String s5,int s6,String s7,String s8,int s9,int s10,String s11,String s12,String s13,String s14
    		,String s15,String s16,String s17,String s18){
    	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\driver1\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\driver1\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();s
		 driver.get("https://adactinhotelapp.com/index.php");
		 driver.manage().window().maximize();
		
		 WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s2);
		 driver.findElement(By.id("login")).click();
		 Select loc = new Select(driver.findElement(By.id("location")));
		 loc.selectByValue(s3);
		 Select hotel = new Select(driver.findElement(By.id("hotels")));
		 hotel.selectByValue(s4);
		 Select typeRoom = new Select(driver.findElement(By.id("room_type")));
		 typeRoom.selectByValue(s5);
		 Select noroom = new Select(driver.findElement(By.id("room_nos")));
		 noroom.selectByIndex(s6);
		 
		 WebElement checkin = driver.findElement(By.id("datepick_in"));
		 checkin.sendKeys(s7);
		 WebElement checkout = driver.findElement(By.id("datepick_out"));
		 checkout.sendKeys(s8);
		
		 Select adults = new Select(driver.findElement(By.id("adult_room")));
		 adults.selectByIndex(s9);
		 Select child = new Select(driver.findElement(By.id("child_room")));
		 child.selectByIndex(s10);
		 driver.findElement(By.id("Submit")).click();
		 driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
		 WebElement firstname = driver.findElement(By.id("first_name"));
		 firstname.sendKeys(s11);
		 WebElement lastname = driver.findElement(By.id("last_name"));
		 lastname.sendKeys(s12);
		 WebElement addr = driver.findElement(By.id("address"));
		 addr.sendKeys(s13);
		 WebElement ccNum = driver.findElement(By.id("cc_num"));
		 ccNum.sendKeys(s14);
		 Select ccType =  new Select(driver.findElement(By.id("cc_type")));
		 ccType.selectByValue(s15);
		 Select expMonth =  new Select(driver.findElement(By.id("cc_exp_month")));
		 expMonth.selectByValue(s16);
		 Select expYear =  new Select(driver.findElement(By.id("cc_exp_year")));
		 expYear.selectByValue(s17);
		 WebElement cvv = driver.findElement(By.id("cc_cvv"));
		 cvv.sendKeys(s18);
		 driver.findElement(By.id("book_now")).click();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 WebElement order = driver.findElement(By.id("order_no"));
		 String orderNo = order.getAttribute("value");
		 System.out.println(orderNo);
		 
		
		
	}
}
