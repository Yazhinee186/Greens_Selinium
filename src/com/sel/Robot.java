package com.sel;

import org.openqa.selenium.By;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robot {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Actions s=new Actions(driver);
    WebElement topoffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
    s.contextClick(topoffers).build().perform();
    
    

}

}