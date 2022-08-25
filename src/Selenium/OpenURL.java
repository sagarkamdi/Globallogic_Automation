package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tesla.com/");
		System.err.println("---------------------------------------------------");
		// maximiazes the window
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tesla.com/models");
		System.err.println("---------------------------------------------------");
		// displays the title of the webpage on the console
		System.out.println("TITLE------>" + driver.getTitle());
		System.err.println("---------------------------------------------------");
		// displays the URL of the webpage on the console
		System.out.println("URL------>" + driver.getCurrentUrl());
		System.err.println("---------------------------------------------------");
		// displays the source of the webpage on the console
		System.out.println("SOURCE------>" + driver.getPageSource());
		System.err.println("---------------------------------------------------");
		driver.close();
	}

}
