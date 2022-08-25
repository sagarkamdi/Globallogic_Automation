package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_login_pom {

	// declaration
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement inputemail;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement contbtn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement inputTextPassword;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement btnLogin;

	// initialization
	public amazon_login_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void clickSignin() {
		loginbtn.click();
	}
	
	public void enterUsernme(String username) {
		inputemail.sendKeys(username);
	}
	
	public void clickCont() {
		contbtn.click();
	}
	
	public void enterPassword(String pwd) {
		inputTextPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	

}
