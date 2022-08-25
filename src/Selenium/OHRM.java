package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.err.println("---------------------------------------------------");
		// maximiazes the window
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']"));
		boolean status= ele.isDisplayed();
		System.out.println("ELEMENT displayed-->"+status);
		Thread.sleep(1000);
		driver.close();
	}

}
