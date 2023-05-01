package com.Automation.testcases;

import org.testng.annotations.Test;

public class Tespra

{
	
	@Test(priority=-1)
	public void m1()
	{
		System.out.println("-1");
	}
	
	@Test(priority=0)
	public void bc()
	{
		System.out.println("0");
	}

	@Test
	public void acd()
	{
		System.out.println("No priority");
	}
}
