package Selenium.Javascript_executor;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_scrool {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("C:\\Users\\sagar.kamdi\\Desktop\\html/h_scrool.html");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript(
			    "document.getElementById('hscroll').scrollBy(2000,0)");
		
		Thread.sleep(5000);
		
		driver.close();

	}
 
}