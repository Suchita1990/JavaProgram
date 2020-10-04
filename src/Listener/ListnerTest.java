package Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerTestCase.class)
public class ListnerTest
{
@Test
  public void tc_01()
  {
    System.out.println("I am in First case");
 }
 @Test
  public void tc_02()
  {
	  Assert.assertTrue(10>20);
	//  System.out.println("Test Case fail");
 }
 @Test(dependsOnMethods="tc_02")
  public void tc_03()
  {
   System.out.println("I am in last case");
 }
}
