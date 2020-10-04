//SingleTone Pattern
package SingleTone_Pattern;

public class Test
{
	public static void main(String[] args) {
		SingleTone a=SingleTone.createInstance();
		/*a=new A();
		A b=new A();*///final class make many object so it is not applicable for singletone
		SingleTone b=SingleTone.createInstance();
		SingleTone c=new SingleTone();
	    
		// A a=new A();
		//A b=new A();
		System.out.println(a+"\t"+b+"\t");//o/p:-A@6d06d9c-This is #cod
		//System.out.println(A.a);//same #code print if var is public 
		/*if(a.equals(b))
		    {
			System.out.println("Equal");
		    }
			else
			{
			System.out.println("Not Equal");
		}*/
	}
}

