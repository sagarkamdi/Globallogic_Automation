package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sagar.kamdi/Desktop/DragNDrop.html");
		System.err.println("---------------------------------------------------");

		WebElement src = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement tgt = driver.findElement(By.xpath("//div[@id='div1']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tgt).build().perform();
		Thread.sleep(1000);
		System.out.println("sghvadsghads");

	}
}
