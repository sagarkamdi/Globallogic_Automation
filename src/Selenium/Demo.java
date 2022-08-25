package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/pmojumder/login.do");
		System.err.println("---------------------------------------------------");
		// maximizes the window
		driver.manage().window().maximize();
		// driver.findElement(By.linkText("Pixel 6a")).click();
		driver.findElement(By.name("username")).sendKeys("plabani52@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Admin1234");
		Thread.sleep(500);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		// driver.findElement(By.linkText("+")).click();
		driver.findElement(By.xpath("//button[@data-for='baseTooltipId']")).click();

	}

}
