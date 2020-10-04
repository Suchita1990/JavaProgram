package SingleTone_Pattern;

public final class A1 {

	private static A1 a;
	static
	{
		a=new A1();

	}
	private A1()
	{
		
	}
	public static A1 getInstance()//createInstance
	{
		return a;
	}

}
