package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select s=new Select(multi);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");
		boolean multiple = s.isMultiple();
		System.out.println("Checks if the drop down is multiple:" +multiple);
		System.out.println("--------------******************************------------------");
		List<WebElement> options = s.getOptions();
		for (WebElement webelement:options) {
			System.out.println("Select all options in the drop down : "+ webelement.getText());
		}
		System.out.println("--------------******************************------------------");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webelement2:allSelectedOptions) {
			System.out.println("Print the select options alone : "+ webelement2.getText());
					}
		System.out.println("--------------******************************------------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println("The first selected option is : " + firstSelectedOption.getText());
			System.out.println("--------------******************************------------------");

		}
	}

