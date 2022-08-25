package Selenium.Exam;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys("Pranali@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("laxmipranali");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		Actions act = new Actions(driver);

		WebElement recruiters = driver.findElement(By.xpath("//a[@title='Search Recruiters']"));
		act.moveToElement(recruiters).perform();
	

		Thread.sleep(2000);
		WebElement connection = driver
				.findElement(By.xpath("//a[@href='https://resume.naukri.com/contact-recruiters-hr?fftid=GNB_RC']"));
		act.click(connection).perform();
		System.out.println(driver.getTitle());

		String winHandleBefore = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		for (String mywindows : handle) {
			String myTitle = driver.switchTo().window(mywindows).getTitle();
			if (myTitle.contains("FastForward")) {
				
				driver.switchTo().window(mywindows);
				System.out.println(driver.getTitle());
				System.out.println("switched");
				break;
			} 
			else 
			{
				driver.switchTo().window(winHandleBefore);
				System.out.println(driver.getTitle());
			}

		}
		driver.findElement(By.xpath("//span[text()='MY SERVICES']")).click();
	}
}
