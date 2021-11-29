package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Script {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor js=(	JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,750)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-100)");
	Thread.sleep(3000);
	js.executeScript("window.scroll(0,0)");
    //WebElement email = driver.findElement(By.id("email"));
    js.executeScript("document.getElementById('email').value='hello@xy.com';");
    js.executeScript("document.getElementById('pass').value='werty';");
    WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
    js.executeScript("arguments[0].click()",login);

}
}
