package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripxpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\eclipse-workspace\\practise\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-17/07/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text()='05:15']//following::div[@class='textRight flexOne']//child::p[text()='₹ 7,424']"));
		String text = element.getText();
		System.out.println(text);
		
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='08:20']//following::div[@class='textRight flexOne']//child::p[text()='₹ 13,619']"));
		String text2 = element2.getText();
		System.out.println(text2);




	}


}
