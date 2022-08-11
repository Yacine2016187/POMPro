package com.qa.Demo.PagesTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Demo.Utils.Constants;

public class LoginPageTest extends BaseTest {

	
	
	
	@Test
	public void LoginPageTitleTest() {
	String AccTitle=	loginpage.getLoginPageTitle();
	System.out.println("Page Title is "+AccTitle);
	Assert.assertEquals(AccTitle, Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test
	public void loginPageURLtest() {
	String CurrURL=	loginpage.getLoginPageURL();
	System.out.println("current url is "+CurrURL);
	Assert.assertTrue(CurrURL.contains(Constants.LOGIN_PAGE_URL));
	
	}
	@Test
	public void ForgotPassTest() {
		Assert.assertTrue(loginpage.isForgotPwdLinkExcite());
	}
	
	@Test
	public void registerlinkTest() {
		Assert.assertTrue(loginpage.isRegisterLinkExcite());
	}
	
	@Test
	
	public void loginappTest() {
		loginpage.DoLogin(pro.getProperty("username"), pro.getProperty("password"));
	}
	
	
	
}
