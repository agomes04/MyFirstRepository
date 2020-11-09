package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyFirstEncapsulation {
	
	WebDriver driver; 
	public MyFirstEncapsulation(WebDriver driver){
		// this.driver = driver; // that's how we did it Java
		PageFactory.initElements(driver, this); // this is modified in Selenium 
		// I don't understand 
	}
	
	@FindBy(xpath="//*[starts-with(@class,'login')]")
	private WebElement signIn;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email; 
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement password; 
	
	@FindBy(xpath="//*[@class='icon-lock left']")
	private WebElement finalSignInButton;
	
//	public WebDriver getDriver() { // what's the function of this???
//		return driver;
//	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getFinalSignInButton() {
		return finalSignInButton;
	} 
	
	
}
