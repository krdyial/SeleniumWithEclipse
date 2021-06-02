package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicNavigations {

	public static void main(String[] args) {
		Project01 obj = new Project01();
		
		// create set property
		System.setProperty(obj.webDriverEdge, obj.pathEdge );
		
		//create driver object
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.de");
		
		//navigate().to() is also working as get() 
		driver.navigate().to("https://www.idealo.de");
		
		// navigate to amazon.de back
		driver.navigate().back();
		// navigate forward to idealo.de
		driver.navigate().forward();
		/*
		 DIFFERENCE BETWEEN GET() AND NAVIGATE TO():
	- They are similiar. both goes to a webpage
	-get() is used more. Gets is faster and Waits for the page to load.
	-navigate(). to() is keeping the history on the browser, so we can navigate back and forward
		 */
		
		//refresh the page
		
		driver.navigate().refresh();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Close and quit the browser
		driver.close();
		

	}

}
