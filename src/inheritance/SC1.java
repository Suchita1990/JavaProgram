/*In JAva Every class extends object class
 * Every constructor of any class will have method (call to super class default  constructor
 *Every Constructor having first line of call to super class
 */


package inheritance;

 class SC1 extends Object
 {
	 public SC1()
	  { 
		// super();//it will call default constructor of object class it may be write or not inside parent constructor
		  System.out.println("In Constructor SC1");
	  }
    
	 public SC1(int i)
	 {
		 System.out.println("Parameterised Constructor");
	 }
}
