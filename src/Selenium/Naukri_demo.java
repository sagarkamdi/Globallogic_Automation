package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Register']")).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle  : handles)
        {
            if(!windowHandle.equals(parentWindow))
            {
                driver.switchTo().window(windowHandle);

                break;
            }
         }
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pranali Rathod");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pranali@email.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("laxmipranali");
	}

}
