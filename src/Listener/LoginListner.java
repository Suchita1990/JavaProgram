package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoginListner implements ITestListener {//IAnnotationListener,ITestListner,ReportListner

	/*It will invoke after the test class is intantiate.
	 *If there is 2 test cases it will invoke 2 times.
	 *It is equivalent to @Beforemethod
	 * */
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart: Test started executing");
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("OnTestSuccess: Test is pass successful");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("OnTestFailure:Test is Failure");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("OnTestSkipped: Test is skipped due to some reason");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	/*this will executes only once when the class is instantiated.means object created of class
	 * It is similar to @beforeclass */
	@Override
	public void onStart(ITestContext context)//it will start test class intantiate
	{
      System.out.println("OnStart: Test class is instantiated");		
	}
	@Override
	public void onFinish(ITestContext context)
	{
	  System.out.println("OnFinish: Test class is finished executing");	
	}

}
