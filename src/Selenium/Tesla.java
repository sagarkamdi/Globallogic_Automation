package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesla {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tesla.com/");
		System.err.println("---------------------------------------------------");
		// maximiazes the window
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tesla.com/models");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("https://www.tesla.com/model3");
		Thread.sleep(5000);
		driver.navigate().to("https://www.tesla.com/modelx");
		Thread.sleep(5000);
		driver.navigate().to("https://www.tesla.com/modely");
		Thread.sleep(5000);
		driver.navigate().to("https://www.tesla.com/solarroof");
		Thread.sleep(5000);
		driver.navigate().to("https://www.tesla.com/solarpanels");
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.err.println("---------------------------------------------------");
		driver.close();
	}

}
