package test_ng;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class demo {
	
	@BeforeTest
	public void BeforeTest() {
		// TODO Auto-generated method stub
		//System.out.println("Execute before every test");

	}
	@BeforeClass
	public void BeforeClass() {
		// TODO Auto-generated method stub
		//System.out.println("Execute before every class");

	}
	
	@BeforeMethod
	public void BeforeMethod() {
		// TODO Auto-generated method stub
		//System.out.println("Execute before every Method");

	}
	
	@AfterMethod
	public void AfterMethod() {
		// TODO Auto-generated method stub
		//System.out.println("Execute after every Method");

	}
	
	
	@AfterClass
	public void AfterClass() {
		// TODO Auto-generated method stub
		//System.out.println("Execute after every class");

	}
	
	
	@AfterTest
	public void AfterTest() {
		// TODO Auto-generated method stub
		//System.out.println("Execute after every test");
		
		

	}
	

}
