package Selenium.Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sagar.kamdi/Desktop/html/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fn")).sendKeys("Geeky");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("Freak");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("77");

	}

}
