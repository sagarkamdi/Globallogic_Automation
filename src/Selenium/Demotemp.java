package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Demotemp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.err.println("---------------------------------------------------");
		// maximizes the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Plbani@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("BOOKS")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.get("http://demowebshop.tricentis.com/cart");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
