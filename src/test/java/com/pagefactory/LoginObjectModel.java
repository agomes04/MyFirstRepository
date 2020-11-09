package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectModel {
	
	//WebDriver driver; // is this mandatory? 
	public LoginObjectModel(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login']")
	private WebElement login;
	@FindBy(xpath="//*[@id='email']")
	private WebElement email; 
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement password; 
	@FindBy(xpath="//*[@id='SubmitLogin']")
	private WebElement finalsignBtn;
	
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getFinalsignBtn() {
		return finalsignBtn;
	}
	
	
	
	
	
}
