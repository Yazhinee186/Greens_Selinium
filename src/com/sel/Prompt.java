package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement prompt_button = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	prompt_button.click();
	WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	prompt.click();
	driver.switchTo().alert().sendKeys("Selinium");
	String text = driver.switchTo().alert().getText();
	System.out.println("The message in the alert box is " +text);
	driver.switchTo().alert().accept();

	
}
}
