package com.practise;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\eclipse-workspace\\practise\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		  List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		  int totalcount = alllinks.size();
		  System.out.println(totalcount);
		  for (WebElement link : alllinks) {
			  String attribute = link.getAttribute("href");
			 System.out.println(attribute);
			
			  if(attribute !=null) {
				  URL  u = new URL(attribute);
				  URLConnection open = u.openConnection();
				  HttpsURLConnection hp = (HttpsURLConnection) open;
				  int code = hp.getResponseCode();
				  if(code>=400) {
					  System.out.println(attribute);
				  }
			  }
		  }
		  
		
		
		
	}
	
	
	
	
	

}
