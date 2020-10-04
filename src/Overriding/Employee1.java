package Overriding;

public class Employee1 extends Employee{
	String[] a ={"Patil","Shinde" ,"Deshmukh"};
	public static Employee getEmployeeby(String sirname)
	{
		System.out.println("Execute database of Employee1");
		return new Employee();
	}
	/*public final Employee getEmployeeby(String sirname)
	{
		System.out.println("Execute database of Employee1");
		return new Employee();
	}
*/
}
