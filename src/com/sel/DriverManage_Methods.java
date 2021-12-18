package com.sel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

public class DriverManage_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		
		//page load time out
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		// Set ScriptTime Out --- driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		
		//driver.quit();		
		
		//add cookies
		Cookie name=new Cookie("Lorem Ipsum", "12345678");
		driver.manage().addCookie(name);
		
		Cookie name1=new Cookie("dummy text", "54677");
		driver.manage().addCookie(name1);
		
		//delete cookie
		driver.manage().deleteCookie(name1);
		
		//delete cookie named
		driver.manage().deleteCookieNamed("LoremIpsum");
		
		//get cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		
		//display cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie);
					}
		
		//delete all cookies
		//driver.manage().deleteAllCookies();
		
		System.out.println();
		System.out.println("-------------------");
		
		//get cookies named
		Cookie cookieNamed = driver.manage().getCookieNamed("dummy text");
		System.out.println("Cookie Named is  " + cookieNamed);
		System.out.println("The value of specific cookie is " + cookieNamed.getValue());
		
		Logs logs = driver.manage().logs();
		System.out.println(logs);
		
		driver.manage().logs().get(null);
		
		//Set<String> availableLogTypes = driver.manage().logs().getAvailableLogTypes();
		
//		for (String log : availableLogTypes) {
	//		System.out.println("Available log types " +log);			
		//}
		
		/*ime handler
		
		//available engine
		
		List<String> availableEngines = driver.manage().ime().getAvailableEngines();
		System.out.println("The list of available engines are");
		
		//display all available engines
		for (String string : availableEngines) {
			
			System.out.println(string);
			
		}
		
		//String activeEngine = driver.manage().ime().getActiveEngine();
		//System.out.println("The active engine is " +activeEngine );
		
		//driver.manage().ime().activateEngine(activeEngine);

*/
	}	
}
