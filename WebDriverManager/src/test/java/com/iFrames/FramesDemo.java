package com.iFrames;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("file:///Users/tajkumarkempaiah/Desktop/Frames.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to frame 1
		driver.switchTo().frame("Frame1");

		// perform some operations
		driver.findElement(By.name("login_name")).sendKeys("FRAME 1");
		Thread.sleep(2000);

		// navigate back to default frame
		driver.switchTo().defaultContent();

		// perform some operations
		driver.findElement(By.xpath("//button[text() = 'Click Me!']")).click();
		Thread.sleep(2000);

		// handle the pop up
		driver.switchTo().alert().accept();

		// navigate to frame 2
		driver.switchTo().frame("Frame2");

		// perform some operations
		driver.findElement(By.name("login_name")).sendKeys("FRAME 2");
		Thread.sleep(2000);

		// close the browser
		driver.close();
	}
}
