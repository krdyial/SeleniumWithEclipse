package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		// Navigate google homepage
		
		Project01 obj = new Project01();
		System.setProperty(obj.webDriverEdge, obj.pathEdge );
			
		WebDriver driver= new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		
		// Verify google homepage is "www.google.com"
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl ="www.google.com";
		
		String result = actualUrl.equals(expectedUrl) ? "Passed" : "Failed";
		System.out.println(result);
		
		

	}

}
