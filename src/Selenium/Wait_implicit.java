package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_implicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.err.println("---------------------------------------------------");
		// maximiazes the window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Qspiders");
		//Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.xpath("//*[contains(text(),'qspiders')]"));
		System.out.println(list.size());
		//Thread.sleep(2000);
		for (int i = 0; i < list.size(); i++) 
		{
			//Thread.sleep(1500);
			
	        WebElement element= list.get(i);
	        System.out.println("Text "+(i+1)+" is: " + element.getText());
		}
		//Thread.sleep(5000);
		driver.close();

	}

}
