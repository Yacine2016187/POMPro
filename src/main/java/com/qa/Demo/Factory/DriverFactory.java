package com.qa.Demo.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
	
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver init_driver(Properties pro) {
		String BrowserName=pro.getProperty("browser");
		System.out.println("Browser Name is"+pro.getProperty("url"));
		
		if(BrowserName.equalsIgnoreCase(pro.getProperty("browser"))) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
				System.out.println("please enter a valide browser name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty("url"));
		return driver;
	
	
	}
	
	public Properties init_prop()   {
	 pro =new Properties();
	FileInputStream file;
	
		try {
			file = new FileInputStream("C:\\Users\\Yacine\\eclipse-workspace\\Demo\\src\\test\\ressources\\config.properties");
			try {
				pro.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
	
	
		return pro;
	}
	
}

