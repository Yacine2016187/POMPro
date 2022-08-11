package com.qa.Demo.PagesTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Demo.Factory.DriverFactory;
import com.qa.Demo.Pages.LoginPage;

public class BaseTest {
	DriverFactory df;
	WebDriver driver;
	LoginPage loginpage;
	Properties pro;
	
	@BeforeTest
	
	public void setup() {
		df=new DriverFactory();
		pro =df.init_prop();
	driver=	df.init_driver(pro);
	loginpage=new LoginPage(driver);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
