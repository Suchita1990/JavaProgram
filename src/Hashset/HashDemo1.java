/*
 * class cast exception
 */
package Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashDemo1 {

	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet();
		//HashSet hs=new HashSet();
		  hs.add(10);
		  hs.add(20);
		  hs.add(30);
		  hs.add("Hello");
		  hs.add(10);
		  System.out.println(hs);
	}
  
	}


