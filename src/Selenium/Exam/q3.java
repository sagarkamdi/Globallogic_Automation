package Selenium.Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.err.println("---------------------------------------------------");
		// maximizes the window
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String scroll_down = "window.scrollBy(0,1000)";
		js.executeScript(scroll_down);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//p[text()='Java']/../../../..//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.3.0/selenium-java-4.3.0.zip']"))
				.click();
		Thread.sleep(1000);
		driver.close();

	}

}
