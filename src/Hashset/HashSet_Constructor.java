package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Constructor {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		   al.add("Hello");
		   al.add("Hello");
		   al.add(10);
		   al.add(10);
		   al.add(3.14);
		   al.add('c');
		 System.out.println("ArrayList Is: "+al);
		
		TreeSet hs=new TreeSet();//create empty tree set which has capability to sort elements in defaultNatural sorting order
		  hs.add(10);
		  hs.add(45);
		  hs.add(15);
		  hs.add(5);
		  hs.add(20);
		 System.out.println("TreeSet Is:+ "+hs);
		 
		HashSet hs0=new HashSet();//create empty hashset of capacity 16 and load factor of 0.75
		 System.out.println("Capacity of Hashset is "+hs);
		
		 HashSet hs1=new HashSet(100);//2nd constructor:HashSet(int Initial capacity)
		 System.out.println("Intial Capcity of hs1: "+hs1);
		 
		 HashSet hs2=new HashSet(10,05f);//3rd Constr:HashSet(int capacity,float loadfactor)
		       hs2.add(10);
		       hs2.add(15);
		       hs2.add(20);
		       hs2.add(25);
		       hs2.add(30);
		       hs2.add(35);
		       hs2.add(40);
		       hs2.add(45);
		       hs2.add(40);//duplicates are not allowed
		       hs2.add(50);
		       hs2.add(55);
		       hs2.add(60);
		       System.out.println(hs2);
		       
		 HashSet hs3=new HashSet(al);//4th constr:HashSet(Collection c):construct Hashset from any collection c
		// ArrayList object copied inti hashset
		 System.out.println(hs3);
		 
		 /**HashSet(int initial capacity, float loadfactor,boolean dummy)
		  * it use to create dummy hashset of specified initial capacity and load factor
		  */
		 //HashSet hs4=new HashSet(20,0.5f,true);
	}

}
