package inheritance;

import Combination.A;

public class  B1 extends A{
	public void m2()
	{
		System.out.println("I am in Child class");
	}
			
	public static void main(String[] args)
   {
	   B1 a=new B1();
	  // a.m1(10);
	   a.m2();
	   
   }
  }


