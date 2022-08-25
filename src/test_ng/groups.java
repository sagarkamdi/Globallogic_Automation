package test_ng;

import org.testng.annotations.Test;

public class groups extends demo {

	@Test
	public void VerifyEcho() {
		// TODO Auto-generated method stub
		System.out.println("Hi.... buddies");

	}
	
	@Test(groups = {"VerifyEcho","OLALogin"})
	public void OLALogin() {
		// TODO Auto-generated method stub
		System.out.println("OLA");

	}

	
	@Test(priority = 1)
	public void OHRMLogin() {
		// TODO Auto-generated method stub
		System.out.println("OHRM logged in");

	}

	@Test(dependsOnMethods = "OHRMLogin")
	public void OHRMUsermanagement() {
		// TODO Auto-generated method stub
		System.out.println("OHRMUsermanagement");

	}

	@Test(dependsOnMethods = "OHRMUsermanagement")
	public void OHRMUser() {
		// TODO Auto-generated method stub
		System.out.println("OHRMUser");

	}

	@Test(dependsOnMethods = "OHRMUser")
	public void OHRMAddUser() {
		// TODO Auto-generated method stub
		System.out.println("OHRMAddUser");

	}
}
