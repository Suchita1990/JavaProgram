package SetInterface;

import java.util.TreeSet;

public class SortedSet_Methods {

	public static void main(String[] args)
	{
		 TreeSet t=new TreeSet();
			t.add(4);
			t.add(5);
			t.add(10);
			t.add(15);
			t.add(20);
			t.add(25);
			//t.add("Hello");//class cast exception(String is not comparable with int object).We can add only homogeneous elements
			System.out.println(t);
			System.out.println(t.first());
			System.out.println(t.last());//it return last element from given sorted set
			System.out.println(t.headSet(20));
			System.out.println(t.tailSet(5));//it returns set of elements greater than or equal to object
			System.out.println(t.subSet(4,20));//it returns set of element greater than equal to 'from element' and less than 'to element'
	        System.out.println(t.comparator());
	}

}
