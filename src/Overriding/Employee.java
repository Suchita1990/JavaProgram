package Overriding;
/*Method name should be same
 * List of argument should be same 
 * It should possess parent-child relation 
 * Same method signature
 * return type should be same
 * Access Modifier visibility can not be more in child than parent.We can  not reduce visibility in child class
 */
public class Employee {
	String[] a1={"Vijay","Vishal","Suresh","Reshma"};
	public static  Employee getEmployeeby(String name)//Static overriding allowed
	{ 
		
		System.out.println("Execute database of Employee");
		return new Employee();
	}
	//final method overriding is not allowed
	/*public final Employee getEmployeeby(String name)
	{ 
		
		System.out.println("Execute database of Employee");
		return new Employee();
	}*/
}
	
	