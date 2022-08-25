package Selenium.excel_data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_excelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\Globallogic_Automation\\bin\\Data\\OHRM_data.xlsx", "Sheet1", 0, 0);
		String Password = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\Globallogic_Automation\\bin\\Data\\OHRM_data.xlsx", "Sheet1", 0, 1);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.err.println("---------------------------------------------------");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys(Username);
		WebElement pass = driver.findElement(By.name("txtPassword"));
		pass.sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();

	}

}
