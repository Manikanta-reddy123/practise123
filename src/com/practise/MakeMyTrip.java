package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\eclipse-workspace\\practise\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		 
		
		
		
		
	}
	

}
