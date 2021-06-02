package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators01 {
	/*
	 Create a class : LocatorsIntro
	Create main method and complete the following task.
	user goes to http://a.testaddressbook.com/sign_in
	Locate the elements of email textbox,password textbox, and signin button
	Enter below username and password then click sign in button
	Username : testtechproed@gmail.com
	Password : Test1234!
	Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
	Verify the Addresses and Sign Out texts are displayed
	Find the number of total link on the page
	Sign out from the page
	 */
	public static void main(String[] args) {
		Project01 obj = new Project01();
		System.setProperty(obj.webDriverEdge, obj.pathEdge );
			
		WebDriver driver= new EdgeDriver();
		
	//	user goes to http://a.testaddressbook.com/sign_in
		
		driver.get("http://a.testaddressbook.com/sign_in");
		driver.manage().window().maximize();
		
		//Locate the elements of email textbox,password textbox, and signin button
		
		WebElement emailBox= driver.findElement(By.id("session_email"));
		emailBox.sendKeys("testtechproed@gmail.com");
		
		WebElement passwordBox= driver.findElement(By.id("session_password"));
		passwordBox.sendKeys("Test1234!");
		
		WebElement signinButton= driver.findElement(By.xpath("//input[@value='Sign in']"));
		signinButton.click();
		
		//Then verify that the expected user id testtechproed@gmail.com
		
		String actualUserId= driver.findElement(By.xpath("//span[@class='navbar-text']")).getText();
		System.out.println(actualUserId);
		
		String expectedUserId="testtechproed@gmail.com";
		
		String result = actualUserId.equals(expectedUserId) ? "Passed" : "Failed";
		System.out.println(result);
		
		//Verify the Addresses and Sign Out texts are displayed
		
		
		

	}

}
