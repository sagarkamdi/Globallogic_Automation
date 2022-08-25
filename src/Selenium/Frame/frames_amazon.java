package Selenium.Frame;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sagar.kamdi27@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7709@Sak");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'iphone')]"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			System.out.println("Text " + (i + 1) + " is: " + element.getText());
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='iphone 13']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
		Thread.sleep(3000);
		System.out.println("-----------------------------------------------");
		String str_name = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']"))
				.getText();
		System.out.println("Product Name-" + str_name);
		

		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
		System.out.println("------------");

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();

		driver.findElement(By.xpath("//input[@aria-labelledby='shipToThisAddressButton-announce']")).click();
		System.out.println("ship to this add");
		
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
		driver.findElement(By.linkText("Add a credit or debit card")).click();
		System.out.println("add new card");
		
		Thread.sleep(7000);
		WebElement ele =driver.findElement(By.xpath("//iframe[contains(@name,'ApxSecureIframe')]"));
		driver.switchTo().frame(ele);
		System.out.println("switched");
		driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("1234 5678 9000");
		driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']")).click();
	}

}
