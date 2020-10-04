package TestNGDemo;

import org.testng.annotations.Test;

public class SignUp 
{
  @Test(invocationCount=3)
  public void positiveTestCase()
  {
    System.out.println("Hello Testing Shastra");
  }
  @Test(invocationTimeOut=10)
  public void negativeTestCase()
  {
	System.out.println("Hello EveryOne!");

  }
}
