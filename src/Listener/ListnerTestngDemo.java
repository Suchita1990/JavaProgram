package Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({LoginListner.class})
public class ListnerTestngDemo
{
	@Test
   public void m1()
   {
     System.out.println("I am first test case");
   }
	@Test
	public void m2()
	{
     System.out.println("I am second test case");
	}
	
}
