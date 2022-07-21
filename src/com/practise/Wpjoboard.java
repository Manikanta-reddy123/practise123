package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wpjoboard {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\eclipse-workspace\\practise\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://wpjobboard.net/");
		driver.manage().window().maximize();
		WebElement ClickDemo = driver.findElement(By.xpath("(//a[text()='Demo'])[1]"));
		ClickDemo.click();
		WebElement clickHomeDemoPage = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]"));
		clickHomeDemoPage.click();
		
		WebElement login = driver.findElement(By.name("wp-submit"));
		login.click();
		
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Full')]//preceding::td[@data-colname='Company']//child::span[contains(text(),'Spotter')])[1]"));
		String text = element.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id=\"toplevel_page_wpjb-job\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[1]/td[7]/span/span[1]/span[4]")).click();



	}

}
