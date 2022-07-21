package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdactinQ10 {
public static void main(String[] args) {
		
		
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\M&M\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	//WebDriver driver =new FirefoxDriver();
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M&M\\eclipse-workspace\\practise\\driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("headless");
		
		WebDriver driver =new ChromeDriver(ch);
		
		
		
		driver.get(" http://adactinhotelapp.com/");

		//driver.manage().window().maximize();
		
		 String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("manikanta");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("@1234567");
		

}

}
