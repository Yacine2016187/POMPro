package com.qa.Demo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Demo.Utils.ElementUtil;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil ele;

	public LoginPage (WebDriver driver) {
		this.driver=driver;
		ele=new ElementUtil(driver);
	}
	private By EmailID=By.id("input-email");
	private By PassWord=By.id("input-password");
	private By LoginBtn=By.xpath("//input[@type='submit']");
	private By registerLink=By.linkText("Register");
	private By ForgotPass=By.linkText("Forgotten Password");
	
	public String getLoginPageURL() {
		
		return driver.getCurrentUrl();
	}
	public String getLoginPageTitle() {
		return ele.doGetTitle(getLoginPageTitle(), 5);
		
	}
	public boolean isForgotPwdLinkExcite() {
		return ele.doIsDisplayed(ForgotPass);
	}
	
	public boolean isRegisterLinkExcite() {
		return ele.doIsDisplayed(registerLink);
	}
	public void DoLogin(String Username,String Passeword) {
		System.out.println("Application will be launched with "+Username+ "And "+""+Passeword);
		ele.doSendKeys(EmailID, Username);
		ele.doSendKeys(PassWord, Passeword);
		ele.doClick(LoginBtn);
	}



	
}
