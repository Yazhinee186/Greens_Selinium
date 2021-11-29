package com.sel;

import java.io.File;
import java.io.IOException;

//import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Account {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create.click();
	Thread.sleep(3000);
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("yazhinee");
	WebElement lastname = driver.findElement(By.name("lastname"));
	lastname.sendKeys("S");
	WebElement email = driver.findElement(By.name("reg_email__"));
	email.sendKeys("yazh@gmail.com");
	WebElement reenter_Email = driver.findElement(By.name("reg_email_confirmation__"));
	reenter_Email.sendKeys("yazh@gmail.com");
	WebElement password = driver.findElement(By.name("reg_passwd__"));
	password.sendKeys("hello");
	WebElement date = driver.findElement(By.id("day"));
	Select s=new Select(date);
	s.selectByIndex(17);	
	WebElement month = driver.findElement(By.id("month"));
	Select y=new Select(month);
	y.selectByValue("6");
	WebElement year = driver.findElement(By.id("year"));
	Select d=new Select(year);
	d.selectByVisibleText("1989");
	WebElement female = driver.findElement(By.className("_58mt"));
	female.click();
	WebElement signup = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
	signup.click();
	Thread.sleep(3000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Screenshot\\error1.png");
	FileUtils.copyFile(source,destination);
	Thread.sleep(3000);

	
	}

}
