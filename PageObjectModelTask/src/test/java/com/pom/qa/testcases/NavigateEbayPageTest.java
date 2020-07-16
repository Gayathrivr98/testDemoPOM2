package com.pom.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.qa.pages.LoginGmailPage;
import com.pom.qa.pages.NavigateEbayPage;

public class NavigateEbayPageTest
{
@ Test (priority=1)
public void verifyFirstItemPrice()
{
	

System.setProperty("webdriver.chrome.driver", "C:/Users/Indian/Downloads/chromedriver.exe");
//System.setProperty("webdriver.chrome.silentOutput","true");
WebDriver driver = new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.ebay.com");


NavigateEbayPage eBay= new NavigateEbayPage(driver);

eBay.SearchItem("electric guitar");

eBay.ClickSearch();
}
@ Test (priority=2)
public void ValidateFirstPrlicelist()
{
	String ItemPrice= NavigateEbayPage.FirstPrlicelist();
	System.out.println("First Item Price is  "+ItemPrice);
	
}
}

