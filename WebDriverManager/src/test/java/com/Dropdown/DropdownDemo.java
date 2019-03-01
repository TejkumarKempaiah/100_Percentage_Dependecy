package com.Dropdown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// locate the dropdown for date
		// locate dropdown for month
		// locate dropdown for month
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		// create select class to be used for Dropdown
		Select select_date = new Select(date);
		Select select_month = new Select(month);
		Select select_year = new Select(year);

		// select date
		// select month
		// select year
		select_date.selectByValue("31");
		Thread.sleep(3000);
		select_month.selectByVisibleText("Dec");
		Thread.sleep(3000);
		select_year.selectByVisibleText("1987");
		Thread.sleep(3000);

		// close the browser
		driver.close();
	}
}
