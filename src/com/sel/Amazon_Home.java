package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Home {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=9132909880664404858&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIzPj355b38wIViQSRCh3nNA0GEAAYASAAEgIxivD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		Thread.sleep(3000);
WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));
createAccount.click();
Thread.sleep(3000);
WebElement customer = driver.findElement(By.name("customerName"));
customer.sendKeys("Dinesh");
WebElement country = driver.findElement(By.className("a-dropdown-prompt"));
Select s =new Select(country);
s.selectByVisibleText("FR +33");



		
		
	}

}
