package com.hexa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class HotelNew {
public static void main(String[] args) throws IOException {
	{
		BaseClass  b = new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl("https://adactinhotelapp.com/");
		LoginPojo l= new LoginPojo();
		b.type(l.getTxtUser(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 1));
		b.type(l.getTxtPass(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 2));
		b.btnClick(l.getBtnLogin());
		Location loc = new Location();
		
		b.dropDown(loc.getLocation(), "Sydney");
		b.dropDown(loc.getHotel(), "Hotel Creek");
		b.dropDown(loc.getRoom(), "Double");
		b.dropDown(loc.getRoomno(),"2");
		b.type(loc.getDatepck(), "28/09/2021");
		b.type(loc.getDateout(), "29/09/2021");
		b.dropDown(loc.getAdult(), "2");
		b.dropDown(loc.getChild(), "1");
		b.btnClick(loc.getSearch());
		Radio r = new Radio();
		r.btnClick(r.getRadiobtn());
		r.btnClick(r.getContin());
		Card c = new Card();
		b.type(c.getFirstname(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 11));
		b.type(c.getLastname(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 12));
		b.type(c.getAddr(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 13));
		b.type(c.getCreditcard(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 14));
		b.dropDown(c.getCardtype(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 15));
		//b.dropDown(c.getMonth(), 2);
		b.dropDown(c.getMonth(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 16));
		b.type(c.getYear(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 17));
		b.type(c.getCvv(), b.getDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Maven3PM\\Excel Data\\Baseclass3.xlsx", "Sheet1", 1, 18));
		b.btnClick(c.getBooknow());
		Order o = new Order();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		b.getText(o.getOrderno());
	}

}
}
