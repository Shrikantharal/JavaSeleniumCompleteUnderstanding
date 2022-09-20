package Listners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ITestListener is a interface which implements testNg listeners

public class Listen1 implements ITestListener
{
	//Listeners are used to listen events happens in test execution and invoke appropriate task
	//when test cases fails,skip,pass
	//we have to tell testng xml file about listeners otherwise it will throw error.
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test start");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test successfull");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		//response if api failed
		System.out.println("this is fialed name of the failed test case"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	@Override
	public void onFinish(ITestContext context)
	{
		
	}





}
