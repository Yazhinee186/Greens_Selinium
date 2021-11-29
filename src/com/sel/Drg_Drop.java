package com.sel;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drg_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/");
driver.manage().window().maximize();
WebElement drggble = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[14]"));
drggble.click();
Actions s=new Actions(driver);
WebElement fromElement = driver.findElement(By.id("draggable"));
WebElement toElement = driver.findElement(By.id("droppable"));
s.moveToElement(fromElement);
s.clickAndHold();
s.moveToElement(toElement);
s.clickAndHold();
s.release().build().perform();
//s.dragAndDrop(fromElement, toElement).perform();
}
}
