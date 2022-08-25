package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_Ohrm_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Ohrm_login_pom login= new Ohrm_login_pom(driver);
		Ohrm_usermngt_pom usermngt= new Ohrm_usermngt_pom(driver);
		
		login.enterUsernme("Admin");
		login.enterPassword("admin123");
		login.clickLogin();
		usermngt.Perform_ACT(driver);
		usermngt.enterEname("Ananya Dash");
		usermngt.enterUname("Ananya_Das");
		usermngt.enterPassword("123456789");
		usermngt.enterConPassword("123456789");
		Thread.sleep(2000);
		usermngt.clickAdd();
	} 

}
