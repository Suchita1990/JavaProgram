package Hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args)
	{
		int a[]={10,20,10,30,40,20};
		
		HashSet hs=new HashSet();
		System.out.println("Duplicate elements are:");
		for(int i=0;i<a.length;i++)
		{
			boolean isDuplicate=hs.add(a[i]);
			if(isDuplicate==false)
			{
				System.out.println(a[i]);
			}
		}
	}
}



		
