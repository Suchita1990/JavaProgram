package TestNGDemo;

import org.testng.annotations.Test;

public class StaticClassMethod
{
@Test
  public static void account()
  {
	System.out.println("This is static method");
  }
@Test
  public void m1() 
  {
	Smoke m=new Smoke();
	m.display();

  }
}
