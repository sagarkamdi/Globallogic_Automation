package Selenium;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo_implement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		System.err.println("---------------------------------------------------");
		driver.manage().window().maximize();
		
		//login-start
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Plbani@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//login-end
		
		Actions act = new Actions(driver);
		
		//computer-start
		WebElement computers = driver.findElement(By.xpath("//a[@href='/computers']"));
		act.moveToElement(computers).perform();
		Thread.sleep(2000);

		WebElement notebooks = driver.findElement(By.xpath("//a[@href='/notebooks']"));
		act.click(notebooks).perform();
		Thread.sleep(2000);

		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Select select_sort_by = new Select(sort_by);

		List<WebElement> list = select_sort_by.getOptions();
		TreeSet<String> treelist = new TreeSet<>();

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			treelist.add(element.getText());
			System.out.println("Dropdown option " + (i + 1) + " is: " + element.getText());
		}

		System.out.println(treelist);

		select_sort_by.selectByValue("http://demowebshop.tricentis.com/notebooks?orderby=11");
		Thread.sleep(3000);

		WebElement view_as = driver.findElement(By.id("products-viewmode"));
		Select select_view_as = new Select(view_as);
		select_view_as.selectByValue("http://demowebshop.tricentis.com/notebooks?orderby=11&viewmode=list");
		Thread.sleep(2000);

		WebElement display_pp = driver.findElement(By.id("products-pagesize"));
		Select select_display_pp = new Select(display_pp);
		select_display_pp.selectByValue("http://demowebshop.tricentis.com/notebooks?orderby=11&viewmode=list&pagesize=12");
		Thread.sleep(3000);
		//computer-end

		//electronics-start
		WebElement electronics = driver.findElement(By.xpath("//a[@href='/electronics']"));
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);

		WebElement cell_phones = driver.findElement(By.xpath("//a[@href='/cell-phones']"));
		act.click(cell_phones).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='/smartphone']")).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String scroll_down = "window.scrollBy(0,500)";
		js.executeScript(scroll_down);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("xyz@abc.com");
		driver.findElement(By.xpath("//textarea[@class='personal-message']")).sendKeys("Nothing phone 1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='send-email']")).click();
		System.out.println("--------------Email sent successfully---------------");
		//electronics-end
		Thread.sleep(5000);
		driver.close();

	}

}
