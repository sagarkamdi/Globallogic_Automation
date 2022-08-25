package Selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AMAZON_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))
		 * .click(); driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
		 * "cseiiia19@rgcer.edu.in");
		 * driver.findElement(By.xpath("//input[@id='continue']")).click();
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "laxmipihu");
		 * driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 */

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'iphone')]"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			System.out.println("Text " + (i + 1) + " is: " + element.getText());
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='iphone 13']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']")).click();
		Thread.sleep(3000);
		System.out.println("-----------------------------------------------");
		String str_name = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']"))
				.getText();
		System.out.println("Product Name-" + str_name);
		// WebElement
		// element=driver.findElement(By.xpath("//span[@id='tp_price_block_total_price_ww']/..//span[@class='a-offscreen']"));
		// System.out.println("Product Price-"+element.getText());

		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
		WebElement element = driver.findElement(By.xpath("//div[@id='apex_desktop']/.//span[@class='a-price-whole']"));
		System.out.println("Product Price-" + element.getText());

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();

	}

}
