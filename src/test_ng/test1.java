package test_ng;

import org.testng.annotations.Test;

public class test1 extends demo {

	@Test(priority = 1)
	public void BookMyShowLogin() {
		// TODO Auto-generated method stub
		System.out.println("BMS");

	}

	@Test(priority = 3)
	public void OLALogin() {
		// TODO Auto-generated method stub
		System.out.println("OLA");

	}

	@Test(dependsOnMethods = "UberLogin")
	public void OHRMLogin() {
		// TODO Auto-generated method stub
		System.out.println("OHRM");

	}

	@Test(enabled = false)
	public void UberLogin() {
		// TODO Auto-generated method stub
		System.out.println("Uber");

	}
}
