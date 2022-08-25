package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ohrm_login_pom {

	// declaration
	@FindBy(id = "txtUsername")
	private WebElement inputTextname;

	@FindBy(id = "txtPassword")
	private WebElement inputTextPassword;

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement btnLogin;

	// initialization
	public Ohrm_login_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void enterUsernme(String username) {
		inputTextname.sendKeys(username);
	}

	public void enterPassword(String pwd) {
		inputTextPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	

}
