package TestNGDemo;

import org.testng.annotations.Test;

public class TestAutomation
{
	@Test(priority=10)
    public void m1() 
    {
      System.out.println("First Test Case");
    }
	@Test(priority=-20,enabled=false)
	public void m2() 
	{
      System.out.println("Second Test Case");
	}
	@Test(priority=1)
	public void m3() 
	{
      System.out.println("Third Test Case");
	}
	@Test(priority=4,enabled=false)
	public void m4() 
	{
      System.out.println("Fourth Test Case");
	}
	@Test
	public void m5() 
	{
      System.out.println("Fifth Test Case");
	}
}
