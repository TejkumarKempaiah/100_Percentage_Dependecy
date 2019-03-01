package com.MouseHover;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Demo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();

		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// locate the webelemnt upon which you want to perform mousehover operation
		WebElement shop_by_category = driver
				.findElement(By.xpath("//span[@class='nav-line-1'][contains(text(),'Shop by')]"));

		WebElement echo_alexa = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Echo & Alexa']"));
		WebElement fire_tv_stick = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Fire TV Stick']"));
		WebElement kindle_ereaders_ebooks = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Kindle E-Readers & eBooks']"));
		WebElement amazon_prime_video = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Amazon Prime Video']"));
		WebElement amazon_prime_music = driver.findElement(By.xpath("//span[@data-nav-panelkey='PrimeMusicPanel']"));
		WebElement mobiles_computers = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Mobiles, Computers']"));
		WebElement tv_appliances_electornics = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='TV, Appliances, Electronics']"));
		WebElement mens_fashion = driver.findElement(By.xpath("//span[@data-nav-panelkey='MensFashionPanel']"));
		WebElement womens_fashion = driver.findElement(By.xpath("//span[@data-nav-panelkey='WomensFashionPanel']"));
		WebElement home_kitchen_pets = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Home, Kitchen, Pets']"));
		WebElement beauty_health_grocery = driver.findElement(By.xpath("//span[@data-nav-panelkey='BeautyHpcPanel']"));
		WebElement sports_fitness_bags_luggage = driver.findElement(
				By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Sports, Fitness, Bags, Luggage']"));
		WebElement toys_baby_products = driver.findElement(By.xpath("//span[@data-nav-panelkey='ToysBabyPanel']"));
		WebElement cars_bike = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Car, Motorbike, Industrial']"));
		WebElement books_audibles = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Books & Audible']"));
		WebElement movies_music_games = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Movies, Music & Video Games']"));
		WebElement giftcard_mobile_reacharges = driver
				.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[text()='Gift Cards & Mobile Recharges']"));

		// create actions class to perform mouse over operation
		Actions action = new Actions(driver);

		// perform mouse over operation on all shop by category links
		action.moveToElement(shop_by_category).build().perform();
		Thread.sleep(2000);
		action.moveToElement(echo_alexa).build().perform();
		Thread.sleep(2000);
		action.moveToElement(fire_tv_stick).build().perform();
		Thread.sleep(2000);
		action.moveToElement(kindle_ereaders_ebooks).build().perform();
		Thread.sleep(2000);
		action.moveToElement(amazon_prime_video).build().perform();
		Thread.sleep(2000);
		action.moveToElement(amazon_prime_music).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mobiles_computers).build().perform();
		Thread.sleep(2000);
		action.moveToElement(tv_appliances_electornics).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mens_fashion).build().perform();
		Thread.sleep(2000);
		action.moveToElement(womens_fashion).build().perform();
		Thread.sleep(2000);
		action.moveToElement(home_kitchen_pets).build().perform();
		Thread.sleep(2000);
		action.moveToElement(beauty_health_grocery).build().perform();
		Thread.sleep(2000);
		action.moveToElement(sports_fitness_bags_luggage).build().perform();
		Thread.sleep(2000);
		action.moveToElement(toys_baby_products).build().perform();
		Thread.sleep(2000);
		action.moveToElement(cars_bike).build().perform();
		Thread.sleep(2000);
		action.moveToElement(books_audibles).build().perform();
		Thread.sleep(2000);
		action.moveToElement(movies_music_games).build().perform();
		Thread.sleep(2000);
		action.moveToElement(giftcard_mobile_reacharges).build().perform();
		Thread.sleep(2000);

		// close the browser
		driver.close();
	}
}
