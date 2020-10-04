package TreeSet;

import java.util.TreeSet;

public class TreeSet_Constructor1
{
	public static void main(String[] args)
	{
		TreeSet hs=new TreeSet();//create empty tree set which has capability to sort elements in defaultNatural sorting order
		  hs.add(10);
		  hs.add(45);
		  hs.add(15);
		  hs.add(5);
		  hs.add(20);
		  hs.add(20);//duplicates will not get insert
		  System.out.println(hs);
		  hs.headSet(10);
		  
		 //TreeSet hs2=new TreeSet();
		 System.out.println("NavigableMap is: "+hs.descendingSet());
		 
		 System.out.println("TreeSet Comparator is: "+hs.comparator());
		 
		 System.out.println("Collectio is: "+hs);
		 
		 System.out.println("SortedSet is: "+hs);
		
		 	  
	}

}
