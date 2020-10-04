package Combination;
/*
 * class can not extends classes
 */
//public class A extends B,Test
public class A
{
	public void m1()
	{
		System.out.println("I am in m1 Method");
	}
public static void main(String[] args)
{
	A a=new A();//class A extends abstract class
	a.m1();
}
}
