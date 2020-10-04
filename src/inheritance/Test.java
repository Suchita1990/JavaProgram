/*
 *Runtime object create
 * compile time it shows the method of A but runtime it gives the method of B in case A a=new B()
 * A a1=new A() : in this case runtime and compile time m1 method disply of A
 * we can use parent reference variable and multiple child objects 
 */
package inheritance;

public class Test {

	public static void main(String[] args) {
		//B b=new B();//B A and Object
		//A a=new B();//jiska object uski method
//		A a1=new A_(10);
       // a.m1();//runtime inheritance
        B b1=new B(20);
     //   a1.m1();//A chi method call hoil runtime
        
       // B b=(B)new A();//there is some data loss
	
	   // System.out.println(b.x);
	}
	
}
