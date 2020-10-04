/**An object is said to be comparable if and only if the corresponding class implements Comparable interface.
String class and all Wrapper classes already implements Comparable interface but StringBuffer class doesn’t implements Comparable interface.
Hence we got ClassCastException in the above example.
 * 
 */

package TreeSet;

import java.util.TreeSet;
 
public class StringBuffer_method


{
	public static void main(String[] args)
	{
	   TreeSet hs=new TreeSet();
	   hs.add("Hello");
	   hs.add("Hi");
	   hs.add("Bye");
	   hs.add(new StringBuffer("Hello"));
	   // We will get RunTimeException :ClassCastException 
       // As StringBuffer does not implements Comparable interface 
	   System.out.println(hs);
	}
}