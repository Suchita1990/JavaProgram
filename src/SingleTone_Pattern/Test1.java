package SingleTone_Pattern;

public class Test1 
{

	public static void main(String[] args)
	{
	  A1 a=A1.getInstance();
	  A1 b=A1.getInstance();
	if(a.equals(b))//equals method check hash code in oop And in String it check the value 
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	}

}
