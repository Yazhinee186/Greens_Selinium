package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-1139998315%3A1637170554325672&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// By ID
		
		WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys("fghhj");
		
		// By ID

		WebElement lastname = driver.findElement(By.cssSelector("#lastName"));
		lastname.sendKeys("greens");
		
		
	}
}
