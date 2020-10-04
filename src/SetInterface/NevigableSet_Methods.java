package SetInterface;

import java.util.ArrayList;
import java.util.TreeSet;

public class NevigableSet_Methods {

	public static void main(String[] args)
	{
	   TreeSet t=new TreeSet();
		t.add(4);
		t.add(5);
		t.add(10);
		t.add(15);
		t.add(20);
		t.add(25);
		System.out.println(t);
		System.out.println(t.lower(15));
		System.out.println(t.higher(15));//it will give 20
		System.out.println(t.higher(25));//it will give null
		System.out.println(t.floor(0));//it return greatest element in this set which is less than or equal to specified/given element or null if no such element
		System.out.println(t.floor(21));
        System.out.println(t.ceiling(35));//returns lowest element in this set which is greater than or equal to specified element
        System.out.println(t.ceiling(24));//or null if no such element 
        System.out.println(t.pollFirst());//it will return and remove lowest element from this set
        System.out.println(t.pollLast());//it will remove and return heighest elemt from the set
	}

}
