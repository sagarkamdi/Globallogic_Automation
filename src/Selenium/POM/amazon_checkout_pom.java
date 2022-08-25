package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_checkout_pom {
	
	// declaration
			@FindBy(xpath="//input[@aria-labelledby='shipToThisAddressButton-announce']")
			private WebElement clkshipAdd;
			
			@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
			private WebElement clkAddcc;
			
			@FindBy(xpath = "//input[@name='addCreditCardNumber']")
			private WebElement inputCardNo;
			
			@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
			private WebElement selectaddCard;
			
			@FindBy(xpath = "(//img[@class=\"apx-add-pm-trigger-common-image\"])[1]")
			private WebElement clkaddCard;
			
			
			// initialization
			public amazon_checkout_pom(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			// utilization
			
			public void clickShipadd() {
				clkshipAdd.click();
			}
			
			public void clickAddNewCard() {
				clkAddcc.click();
			}
			
			public void enterCardNo(String str) {
				inputCardNo.sendKeys(str);
			}
			
			public void selectAddCard() {
				selectaddCard.click();
			}
			
			public void clickAddCard() {
				clkaddCard.click();
			}
			
			

}
