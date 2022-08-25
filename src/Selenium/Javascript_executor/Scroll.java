package Selenium.Javascript_executor;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		String scroll_down="window.scrollBy(0,5000)";
		js.executeScript(scroll_down);
		Thread.sleep(5000);
		
		String scroll_up="window.scrollBy(0,-5000)";
		js.executeScript(scroll_up);
		Thread.sleep(5000);
		driver.close();

	}

}