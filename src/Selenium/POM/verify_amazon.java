package Selenium.POM;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username="sagar.kamdi27@gmail.com";
		String pass="7709@Sak";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		amazon_login_pom login= new amazon_login_pom(driver);
		amazon_search_pom ser=new amazon_search_pom(driver);
		amazon_addtocart_pom atc=new amazon_addtocart_pom(driver);
		amazon_checkout_pom cout=new amazon_checkout_pom(driver);
		
		login.clickSignin();
		login.enterUsernme(username);
		login.clickCont();
		login.enterPassword(pass);
		login.clickLogin();
		ser.Search("iphone");
		ser.clickItem();
		ser.clickPro();

		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
		atc.clickAddTC();
		atc.clickCont();
		cout.clickShipadd();
		cout.selectAddCard();
		cout.clickAddNewCard();
		WebElement ele =driver.findElement(By.xpath("//iframe[contains(@name,'ApxSecureIframe')]"));
		driver.switchTo().frame(ele);
		cout.enterCardNo("1234 5678 9000");
		cout.clickAddCard();
		
	}
}
