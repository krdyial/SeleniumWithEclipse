package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		Project01 obj = new Project01();
		System.setProperty(obj.webDriverEdge, obj.pathEdge );
			
		WebDriver driver= new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="google";
		
		//1. WAY:
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		//2. WAY:
		
		String result = actualTitle.equals(expectedTitle) ? "Passed" : "Failed" ;
		System.out.println(result);
		
		driver.close();
		
	}

}
