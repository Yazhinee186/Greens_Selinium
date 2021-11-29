package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Key {
	/**
	 * @param args
	 * @throws AWTException
	 */
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=12636556744967662167&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299844&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=EAIaIQobChMItsnkiN2f9AIV1SMrCh243gfFEAAYASAAEgKuB_D_BwE");
		driver.manage().window().maximize();
		Actions s=new Actions(driver);
	    WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	    s.contextClick(mobile).build().perform();
	    Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement bestsellers = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	    s.contextClick(bestsellers).build().perform();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	    
        WebElement electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	    s.contextClick(electronics).build().perform();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement customer_services = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	    s.contextClick(customer_services).build().perform();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
       Set<String> window=driver.getWindowHandles();
       for(String y:window) {
    	   System.out.println(driver.switchTo().window(y).getTitle());
       }
       String w="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
       for(String u:window) {
    	   if(driver.switchTo().window(u).getTitle().equalsIgnoreCase(w)) {
    		   break;
    		   
    	   }
       }
    		   
}
}
