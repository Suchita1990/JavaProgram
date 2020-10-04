package TestNGDemo;

import org.testng.annotations.Test;

public class Smoke 
{
    
	public void show() 
	{
      System.out.println("I am in Show method");
	}
  @Test
  public void display()
  {
	  System.out.println("I am in First Test");
  }
  @Test
  public void login() 
  {
    System.out.println("This is Login case");
    StaticClassMethod.account();
  }
     
}
