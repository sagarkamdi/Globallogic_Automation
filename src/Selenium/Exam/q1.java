package Selenium.Exam;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class q1 {
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("C:\\Users\\sagar.kamdi\\Desktop\\html\\alert.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(5000);
		Boolean foundAlert  = false;
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		
		try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	        Alert a = driver.switchTo().alert();
	        a.accept();
	    } catch (Exception eTO) {
	        foundAlert = false;
	        TakesScreenshot t =(TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\SS\\alert.jpg");
			FileUtils.copyFile(src, dest);
	    }
		
		System.out.println("Alert found-"+ foundAlert);
		

	}

}
