package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_Orange_HRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.err.println("---------------------------------------------------");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions act = new Actions(driver);
		Thread.sleep(5000);

		/*System.out.println("--------------------PIM START-------------------------");

		WebElement Pim = driver.findElement(By.xpath("//b[text()='PIM']"));
		act.moveToElement(Pim).perform();
		Thread.sleep(5000);
		WebElement add_emp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		act.click(add_emp).perform();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ananya");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Dash");

		Thread.sleep(5000);
		WebElement sel_photo = driver.findElement(By.xpath("//input[@name='photofile']"));
		sel_photo.sendKeys("C:\\Users\\sagar.kamdi\\Pictures\\Screenshots\\404-Page.png");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		System.out.println("--------------------PIM END--------------------");*/

		System.out.println("--------------------Admin usermanagement START--------------------");
		WebElement Admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		act.moveToElement(Admin).perform();
		Thread.sleep(5000);
		WebElement user_management = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		act.click(user_management).perform();
		Thread.sleep(5000);
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		act.click(users).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();

		WebElement ele = driver.findElement(By.id("systemUser_userType"));

		Select select_ele = new Select(ele);
		select_ele.selectByIndex(0);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Ananya Dash");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Ananya_D");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("123456789");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='addbutton']")).click();

		System.out.println("--------------------Admin usermanagement END--------------------");
		Thread.sleep(5000);
		driver.close();

	}

}
