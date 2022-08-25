package Selenium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.kamdi\\eclipse-workspace"
				+ "\\Globallogic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sagar.kamdi/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("manufacturers"));
		Select select_ele=new Select(ele);
		
		select_ele.selectByIndex(1);
		Thread.sleep(5000);
		select_ele.selectByValue("10");
		Thread.sleep(5000);
		select_ele.selectByVisibleText("Skoda");
		Thread.sleep(5000);
	
		select_ele.deselectByIndex(1);
		Thread.sleep(5000);
		select_ele.deselectByValue("10");
		Thread.sleep(5000);
		select_ele.deselectByVisibleText("Skoda");
		Thread.sleep(5000);
		
		select_ele.selectByValue("10");
		select_ele.selectByValue("20");
		select_ele.selectByValue("30");
		select_ele.selectByValue("40");
		Thread.sleep(5000);
		
		select_ele.deselectAll();
		Thread.sleep(5000);
		
		
		List<WebElement> list = select_ele.getOptions();
		TreeSet<String>treelist=new TreeSet<>();
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			treelist.add(element.getText());
			System.out.println("Text " + (i + 1) + " is: " + element.getText());
		}
		
		System.out.println(treelist);
		
		driver.close();
	
		

	}

}
