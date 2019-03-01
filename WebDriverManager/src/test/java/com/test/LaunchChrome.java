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
		//NOTE: Below one is for Chromedriver
		//WebDriverManager.chromedriver().setup();
		
		//NOTE: Below one is for Firefoxdriver
		WebDriverManager.firefoxdriver().setup();

	}

	public static void main(String[] args) throws InterruptedException 
	{
		//Below code will launch Chrome browser
		//driver = new ChromeDriver();
		
		//Below code will launch Firefox browser
		driver = new FirefoxDriver();
		
		//Below code will launch Safari browser
		//driver = new SafariDriver();
				
		//Below code is maximum the browser
		driver.manage().window().fullscreen();
		
		
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
