package Combination;
/*class extends class:true
 *class extends interface:false
 *class implements interface:true
 *class implements class:false 
 *interface extends interface:true 
 *interface implements interface:false
 *class implements I1,I2,I3:true
 *class extends c1,c2,c3:false
 */

/*class does not extends interface
 * class implements interface
 * 
 */

// public class Test extends B1 //class does not extends interface
/*public class Test implements B1//class implements interface
{
	public static void main(String[] args)
	{  
	  //B b=new B();
		Test t=new Test();
		t.show();
	}
	
	public void show()
	{
			System.out.println("In class Test");
	}
}*/

/*public class Test extends A1 //class extends abstract class
{

	public void m1()
	{
	  System.out.println("I am in m1 method of Abstract class A1");	
	}
	public static void main(String[] args)
	{
	  Test t=new Test();
	  t.m1();
	}
}*/
//Class implements interface B1,C1
/*class Test implements B1,C1
{

	public void show()
	{
	 System.out.println("I am in show method");
	}
	public void m2()
	{
		System.out.println("I am in m2 method");
    }
	public static void main(String[] args)
	{
		Test t=new Test();
		//t.show();
		t.m2();
		t.show();
	}
}*/
 /*public class Test implements C1
 {
	 public static void main(String[] args)
	 {
		 Test t=new Test();
		 t.show();
		 t.m2();
	 }

	public void show()//we can declare interface method arguments in test class
	{
	  System.out.println("Show method");	
	}
	public void m2()
	{
		System.out.println("m2 method");
	}

	
 }*/
//Interface extends Interface
/*public class Test implements C1
{

	public void show()
	{
	System.out.println("Hello Testing Shastra");	
	}
 	public void m2()
 	{
	  System.out.println("I am M2 method");	
	}
 	public static void main(String[] args)
 	{
	   Test t=new Test();
	   t.m2();
	   t.show();
	}
}*/
//abstract class extends abstract class
public class Test extends D1
{

	public void Display()
	{
		System.out.println("Hello Testing Shastra");
	}
	public void m1() 
	{
	  System.out.println("I am in m1 method");	
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.Display();
		t.m1();
	}
	
}
 