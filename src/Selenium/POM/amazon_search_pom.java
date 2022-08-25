package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_search_pom {
	
	// declaration
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")
		private WebElement searchBox;
		
		@FindBy(xpath="//div[@aria-label='iphone 13']")
		private WebElement clkItem;
		
		@FindBy(xpath="//span[text()='Apple iPhone 13 (128GB) - Blue']")
		private WebElement clkPro;


		// initialization
		public amazon_search_pom(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// utilization
		public void Search(String str) {
			searchBox.sendKeys(str);
		}
		
		public void clickItem() {
			clkItem.click();
		}
		
		public void clickPro() {
			clkPro.click();
		}

}
