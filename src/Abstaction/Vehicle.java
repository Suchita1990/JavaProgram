/* cntr+shift+/(back slash)
 *abstract classes can have zero or more than zero abstract methods
 *abstract class is used to acheive zero to 100% abstraction
 *abstract class can have all methods as abstract 
 *abstract class can have all methods as concrete
 *abstract class do not have abstract istance variable
 *variable does not have any check only on methods
 *abstract method can not be final.abstract method should have  public and protected only
 *abstract method can not be static
 * 
 * 
 */
package Abstaction;

public abstract class Vehicle {
	final int i=10;
	public abstract int setMaxSpeed(int maxSpeed);
	
	//public static abstract int setMaxSpeed(int maxSpeed);
	 public void m1()
	{
		int j=10;
	}

}
