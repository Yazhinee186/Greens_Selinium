package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=8698286983922265797&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=EAIaIQobChMI_MOKl9WV9AIVQg9yCh0LnwAkEAAYASAAEgJte_D_BwE");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Scroll Down		
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(3000);
	WebElement bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	js.executeScript("arguments[0].click()",bestseller);
	Thread.sleep(3000);
	WebElement hits = driver.findElement(By.xpath("(//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated'])[5]"));
	js.executeScript("arguments[0].scrollIntoView()",hits);

	}

}
