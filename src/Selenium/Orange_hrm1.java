package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.err.println("---------------------------------------------------");
		// maximiazes the window
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("MP_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buyBtn1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Admin@yahoo.com");
		driver.findElement(By.id("contactNumber")).sendKeys("9595107397");
		driver.findElement(By.id("organization")).sendKeys("IA Labs");
		driver.findElement(By.id("modal_confirm_buy")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("MP_link")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("btn cancel")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
