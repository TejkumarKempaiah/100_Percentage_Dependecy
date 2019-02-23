#Objective:
This is project is about how to achieve 100% dependency using Maven (Build Tool) for below use case
	

#Usecase:
	1. Generally when you want to execute a simple automation script of opening the browser -> an url -> print the tab title -> exit
	
	
#What are the dependencies required to perform that task? 
	1. Selenium JAR
	2. Browser Driver executables
	
#Till now
	Till now we used to have selenium-java dependency from maven repository but for browser drivers, We used to explicitly download them 
			and give path of path of driver as mentioned below using System.setProperty(key,value);
			
			Ex: System.setProperty("webdriver.chrome.driver","path_where_chromedriver_which_is_downloded_from_is_placed");
			
				NOTE: This example is about chrome browser, Same applies for any browser for that context. 
			
	Now but this, We are not achieving 100% dependency management, If yes, Then how do we achieve it? 
	
	
	
#Solution
	WebDriverManager
	

	
#Implementation of solution along with sample code

	However, You will use selenium java dependency from maven repository
				But what about driver executables? 
				
				Here is the MAGIC! --> WebDriverManager
				
				Type in WebDriverManager from Repository or type in google that should take you to the Github page which will get you the WebDriverManager dependency
				
				NOTE: Use the WebDriverManager dependency with below mentioned package named: bonigarcia
				
					io.github.bonigarcia » webdrivermanager
					
					
					
# Dependency details 
	1. selenium-java
	
				<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
			<dependency>
			    <groupId>org.seleniumhq.selenium</groupId>
			    <artifactId>selenium-java</artifactId>
			    <version>3.141.59</version>
			</dependency>
	
	
	
	
	
	2. WebDriverManager
	
			<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
		    <groupId>io.github.bonigarcia</groupId>
		    <artifactId>webdrivermanager</artifactId>
		    <version>3.3.0</version>
		</dependency>
	