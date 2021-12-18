package com.sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Window() methods
		
		//fullscreen		
		//driver.manage().window().fullscreen();
		
		//maximize
		driver.manage().window().maximize();
		
		//get position		
		Point p = driver.manage().window().getPosition();
		System.out.println("Get Position");
		System.out.println("X offset: " + p.x);
		System.out.println("Y Offset: " + p.y);
		System.out.println("---------------------------");
		
		//get size
		Dimension s = driver.manage().window().getSize();
		System.out.println("Height: " +s.height);
		System.out.println("Width: " +s.width);
		System.out.println("---------------------------");
		
		//set position
		Point p1=new Point(250,250);
		driver.manage().window().setPosition(p1);
		
		//set size
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		
		
		
		
	
		
		
	}

}
