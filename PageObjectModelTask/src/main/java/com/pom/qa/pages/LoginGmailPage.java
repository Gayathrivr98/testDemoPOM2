package com.pom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginGmailPage {
	
	static WebDriver driver;
	
	
	By username = By.xpath("//input[@type='email']");
	By Nextbutton =By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]");
	By password=By.xpath("//input[@type='password']");
	By Loginbutton=By.xpath("//span[contains(text(),'Next')]");
	By Title= By.xpath("//div[@title='Google']");
	static By ErrorMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span");
			
	public LoginGmailPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public static String ValidateGmailTitle()
	{
	return driver.getTitle();
	}
		
	public void typeUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void ClickNext()
	{
		driver.findElement(Nextbutton).click();
	}
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void ClickLoginButton()
	{
		driver.findElement(Loginbutton).click();
	}
	
	public static String ValidateError()
	{
		return driver.findElement(ErrorMessage).getText();
	}
	}
	
