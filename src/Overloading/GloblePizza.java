package Overloading;

/*
 * In Method Overloading- 
 * List of arguments should be different
 * All same methods should be in same class
 * Method Signature should be different
 */
public class GloblePizza {
	
	public final void bakepizza(String flavours) 
	{
		
		System.out.println("Add less spices");
		System.out.println("Add more chese");
		
	}
	GloblePizza()
	{
		
	}
	
	public final void bakepizza(String flavours, String Ingradients) 
	{
		System.out.println("Add Mashrum");
		System.out.println("Add Paneer");
	}
	/*public final void bakepizza(int Ingradients) 
	{
		System.out.println("Add Mashrum");
		System.out.println("Add Paneer");
	}*/


}
