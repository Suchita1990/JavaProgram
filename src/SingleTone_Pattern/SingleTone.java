//Single_Tone Pattern
package SingleTone_Pattern;

public final class SingleTone {
	/*public static A a;
	static{
		a=new A();*/
	private static SingleTone a;
	static{
		a=new  SingleTone();
		
	}
	public SingleTone()
	{
		
	}
	public static SingleTone createInstance() {
		 return a;
	}
	}

	
	


