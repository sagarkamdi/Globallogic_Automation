package Selenium.Javascript_executor;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("C:\\Users\\sagar.kamdi\\Desktop\\html\\jsexecutor.html");
		
		driver.findElement(By.id("fname")).sendKeys("Geeky");
		String smt = "document.getElementById('lname').value='sagar'";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(smt);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.close();

	}

}