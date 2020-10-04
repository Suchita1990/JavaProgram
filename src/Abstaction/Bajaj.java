package Abstaction;

public class Bajaj extends Vehichle 
{
	String colorName;
	 @Override
	public void setColor(String colorName)
	{
		System.out.println("Applied color with Graphics");
		 this.colorName=colorName;
		 System.out.println("Color"+this.colorName+"Applied color with Graphics");
		
	}
	

}
