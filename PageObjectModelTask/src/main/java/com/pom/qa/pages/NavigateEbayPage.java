package com.pom.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateEbayPage {
	static WebDriver driver;
	
	static By searchtext = By.xpath("//input[@type='text']");
	By searchbutton =By.xpath("//input[@type='submit']");
	static By FirstPrlicelist = By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/div[4]/div[1]/span");
	
	public NavigateEbayPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SearchItem(String et)
	{
		driver.findElement(searchtext).sendKeys(et);
	}
	public void ClickSearch()
	{
		driver.findElement(searchbutton).click();
	}
	
	public static String FirstPrlicelist()
	{
		return driver.findElement(FirstPrlicelist).getText();
		
	}
}

