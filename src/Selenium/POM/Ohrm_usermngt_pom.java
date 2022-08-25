package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ohrm_usermngt_pom {

	// declaration
		@FindBy(xpath = "//b[text()='Admin']")
		private WebElement admin;

		@FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
		private WebElement usermanagement;

		@FindBy(xpath = "//a[@id='menu_admin_viewSystemUsers']")
		private WebElement users;
		
		@FindBy(xpath = "//input[@name='btnAdd']")
		private WebElement btnadd;
		
		@FindBy(xpath = "//input[@name='systemUser[employeeName][empName]']")
		private WebElement ename;
		
		@FindBy(xpath = "//input[@name='systemUser[userName]']")
		private WebElement uname;
		
		@FindBy(xpath = "//input[@name='systemUser[password]']")
		private WebElement pwd;
		
		@FindBy(xpath = "//input[@name='systemUser[confirmPassword]']")
		private WebElement confirmPwd;
		
		@FindBy(xpath = "//input[@name='btnSave']")
		private WebElement addbutton;
		
		
		public Ohrm_usermngt_pom(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void Perform_ACT(WebDriver driver) {
			Actions act= new Actions(driver);
			act.moveToElement(admin).perform();
			act.moveToElement(usermanagement).perform();
			users.click();
			btnadd.click();
		}
		
		public void enterEname(String str) {
			ename.sendKeys(str);
		}
		
		public void enterUname(String str) {
			uname.sendKeys(str);
		}
		
		public void enterPassword(String str) {
			pwd.sendKeys(str);
		}
		
		public void enterConPassword(String str) {
			confirmPwd.sendKeys(str);
		}

		public void clickAdd() {
			addbutton.click();
			//System.out.println("clicked");
		}
}
