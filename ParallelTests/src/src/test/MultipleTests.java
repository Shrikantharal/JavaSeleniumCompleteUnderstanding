package test;

import org.testng.annotations.Test;

public class MultipleTests 
{
	@Test(priority=0)
	public void test1()
	{
		System.out.println("this is first test");
	}

	@Test(priority=2)
	public void test3()
	{
		System.out.println("this is third test");
	}
	
	@Test(priority=3)
	public void test4()
	{
		System.out.println("this is fourth test");
	}
	
	@Test(priority=4)
	public void test5()
	{
		System.out.println("this is fifth test");
	}
	
	@Test(priority=5)
	public void test6()
	{
		System.out.println("this is sixth test");
	}
	
	@Test(priority=1,enabled=false)
	public void test2()
	{
		System.out.println("this is Second test");
	}
}
