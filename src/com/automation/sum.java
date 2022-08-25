package com.automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sum {
	@Test
	@Parameters({"a","b"})
	public void add(int c, int d) {
		// TODO Auto-generated method stub
		
		System.out.println("sum="+(c+d));

	}
	

}
