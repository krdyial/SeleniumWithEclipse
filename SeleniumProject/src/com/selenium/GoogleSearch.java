package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karadayi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//div[@class='jyfHyd'])[2]")).click();
	}

}
