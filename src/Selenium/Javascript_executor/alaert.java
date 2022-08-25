package Selenium.Javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alaert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("C:\\Users\\sagar.kamdi\\Desktop\\html\\alert.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();

	}

}
