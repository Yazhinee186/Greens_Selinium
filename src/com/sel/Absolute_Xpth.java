package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpth {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement java = driver.findElement(By.xpath("	/html/body/div/div/div[4]/div/table/tbody/tr/td/fieldset[8]/div[1]/a[1]/div/p"));
	System.out.println(java.getText());
	java.click();
	
	WebElement tutorial = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
	System.out.println(tutorial.getText());
	
	WebElement mcq = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[19]/a[22]/span"));
	System.out.println(mcq.getText());
	mcq.click();
}
}
