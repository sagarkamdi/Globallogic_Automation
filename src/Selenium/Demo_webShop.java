package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_webShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.err.println("---------------------------------------------------");
		// maximizes the window
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//label[@for='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Plabani");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Mojumdar");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Plb01907ani@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin1234");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("admin1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Plbani@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

		
	}

}
