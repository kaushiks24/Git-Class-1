package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver;
	public WebDriver launchBrowser()
	{
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
		return driver;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
}
	public void launchUrl(String url)
	{
		try {
			driver.get(url);
			driver.manage().window().maximize();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
	public void type(WebElement element,String string)
	{
		try {
			element.sendKeys(string);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}

	public void btnClick(WebElement element)
	{
		try {
			element.click();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
	public void quitBrowwser(WebElement element)
	{
		try {
			driver.quit();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
	public void getText(WebElement element)
	{
		try {
			String s = element.getAttribute("value");
			System.out.println(s);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
	public void dropDown(WebElement element, String value)
	{
		try {
			Select se = new Select(element);
			se.selectByValue(value);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
	public void dropDown(WebElement element, int index)
	{
		try {
			Select se = new Select(element);
			se.selectByIndex(index);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
		public void jsType(WebElement element, String data)
		{
			try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('value','"+data+"')",0);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		public String getDataFromExcel(String excelLoc,String sName,int rNo,int cNo) throws IOException {
			String value = null;
			File f = new File(excelLoc);
			FileInputStream fin = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fin);
			Sheet s =w.getSheet(sName);
			Row r = s.getRow(rNo);
			Cell c = r.getCell(cNo);
			int type =c.getCellType();
			
			if(type==1)
			{
				 value = c.getStringCellValue();
			}
			else if(type==0)
			{
				if(DateUtil.isCellDateFormatted(c))
				{
				java.util.Date date =  c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
				 value = sdf.format(date);
				}
			
				else
				{
					double d = c.getNumericCellValue();
					long l=(long)d;;
					 value = String.valueOf(l);
				}
			}
			return value;
		}
}
			












