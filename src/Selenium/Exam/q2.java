package Selenium.Exam;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		
	      try {
	        	WebDriverWait wt = new WebDriverWait(driver,6);
	        	WebElement el = driver.findElement(By.xpath("//input[@id='login-button']"));
	    		wt.until(ExpectedConditions.elementToBeClickable (el));
	    		el.click();
	    	    System.out.println("Current page title:" + driver.getTitle());
	    	    TakesScreenshot t =(TakesScreenshot) driver;
				File src = t.getScreenshotAs(OutputType.FILE);
				File dest = new File("D:\\click.png");
				FileUtils.copyFile(src, dest);
				
				
			}
	      catch (Exception e) 
	        {
				System.out.println("Element is not clickable");
			}

	}

}
