package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.excel_data.ExcelData;

public class verify_Ohrm_login_excel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Username = ExcelData.getData(
				"D:\\OHRM_data.xlsx", "Sheet1", 0, 0);
		String Password = ExcelData.getData(
				"D:\\OHRM_data.xlsx", "Sheet1", 0, 1);
		
		String ename = ExcelData.getData(
				"D:\\OHRM_data.xlsx", "Sheet2", 0, 0);
		
		String uname = ExcelData.getData(
				"D:\\OHRM_data.xlsx", "Sheet2", 0, 1);
		System.out.println("uname-->"+uname);
		
		String pwd = ExcelData.getData(
				"D:\\OHRM_data.xlsx", "Sheet2", 0, 2);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Ohrm_login_pom login= new Ohrm_login_pom(driver);
		Ohrm_usermngt_pom usermngt= new Ohrm_usermngt_pom(driver);
		
		login.enterUsernme(Username);
		login.enterPassword(Password);
		login.clickLogin();
		usermngt.Perform_ACT(driver);
		usermngt.enterEname(ename);
		usermngt.enterUname(uname);
		usermngt.enterPassword(pwd);
		usermngt.enterConPassword(pwd);
		Thread.sleep(2000);
		usermngt.clickAdd();
	} 

}
