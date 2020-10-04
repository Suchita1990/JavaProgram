package TestNGDemo;

import org.testng.annotations.Test;

public class ClassB
{
	@Test(groups= {"Regression"})
	 public void m1()
	 {
	   System.out.println("m1 method of B");
	 }
	@Test
	 public void m2()
	 {
	   System.out.println("m2 method of B");
	 }
	@Test
	 public void m3()
	 {
	   System.out.println("m3 method of B");
	 }
	@Test
	 public void m4()
	 {
	   System.out.println("m4 method of B");
	 }
	@Test(groups= {"Regression"})
	 public void m5()
	 {
	   System.out.println("m5 method of B");
	 }
	@Test(groups= {"Suchita"})
	 public void m6()
	 {
	   System.out.println("m6 method of B");
	 }
}
