/*abstract method can not be final it can only public and protected
 *abstract method can not be static 
 */
package Abstaction;

public abstract class Vehicle1
  { 
	int i=10;//we can write instance variable
	//abstract int i=10;
	//abstract variable not allow
	//final int i=10;//No issue about final variable
	public abstract int setMaxSpeed(int maxSpeed);
	
	//public static abstract int setMaxSpeed(int maxSpeed);
	
	  //public final abstract int setMaxSpeed(int maxSpeed);
	public void m1()
	{
	 //Concrete method allow inside abstract class	
		
	}
	    //abstract method
		// return maxSpeed;
		//Unimplemented method
	
	/*public int setMaxSpeed(int maxSpeed)//Concrete method
		{
		  Constants.maxSpeed=maxSpeed  ;
		  return Constants.maxSpeed;

		}*/
	
	}



