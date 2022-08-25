package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_addtocart_pom {
	// declaration
		
			
			@FindBy(id="add-to-cart-button")
			private WebElement clkatc;
			
			@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
			private WebElement clkcont;


			// initialization
			public amazon_addtocart_pom(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			// utilization
			
			public void clickAddTC() {
				clkatc.click();
			}
			
			public void clickCont() {
				clkcont.click();
			}

}
