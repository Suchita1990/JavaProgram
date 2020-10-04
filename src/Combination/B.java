package Combination;

public class B extends A {
	public void m2()
	{
		System.out.println("I am in m2 Method");
	}

	public static void main(String[] args)
	{
		//A a=new A();
		B b=new B();
		b.m1();
		b.m2();
	}

}
