package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Project01 {
	String pathChrome= "C:\\Users\\Karadayi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe";
	String pathEdge= "C:\\Users\\Karadayi\\Documents\\selenium dependencies\\drivers\\msedgedriver.exe";
	String webDriverChrome= "webdriver.chrome.driver";
	public static String webDriverEdge= "webdriver.edge.driver";
	public static void main(String[] args) throws InterruptedException {
		
		String pathChrome= "C:\\Users\\Karadayi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe";
		String pathEdge= "C:\\Users\\Karadayi\\Documents\\selenium dependencies\\drivers\\msedgedriver.exe";
		String webDriverChrome= "webdriver.chrome.driver";
		String webDriverEdge= "webdriver.edge.driver";
		
		System.setProperty(webDriverEdge, pathEdge);
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Notebook Halter"+Keys.ENTER);
	
		
		

	}

}
