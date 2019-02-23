package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome 
{
	public static WebDriver driver;
	
	static
	{
		//NOTE: Below one is for chromedriver
		//WebDriverManager.chromedriver().setup();
		
		//NOTE: Below one is for firefoxdriver
		WebDriverManager.firefoxdriver().setup();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		//Below code will launch chrome browser
		//driver = new ChromeDriver();
		
		//Below code will launch firefox browser
		//driver = new FirefoxDriver();
		
		//Below code will launch safari browser
		driver = new SafariDriver();
		
		//Below code is maximum the browser
		
		
		//Below code will navigate to an URL
		driver.get("https://www.seleniumhq.org/");
		
		//Below code will stop your stop the execution of your code for 3 seconds
		Thread.sleep(3000);
		
		//Below code will display application page tab title
		System.out.println("Page title: "+driver.getTitle());
		
		//Below code will close the firefox browser
		driver.close();	
	}

}
