package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationSeq 
{
	@BeforeSuite
	/*public void brforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@BeforeTest
	public void brforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeClass
	public void brforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	*/
	/*@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	*/
	@Parameters({"URL"})
	@Test
	public void test2(String maiURL)
	{
		System.out.println("Test2");
		System.out.println(maiURL);
	}
	
	
	

}
