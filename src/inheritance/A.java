package inheritance;

public class A
  {
	final int i; //instance  final variable
  // static  final int i;
   /* static  //static block
    {
     i=20;  	
    }*/
    
 /*  public A1()
    {
    	 i=20;//static final variable can not initialise inside constructor it initialize inside only static block
    }*/
  
    
    {
    	i=20;   //final variable can initialise inside instance block and static final variable can not initialise inside instance bloc 
    }
  
    
	/*public static  m1()
	{
	   i=20;  //final variable can not be initialize inside static method
	}//
*/	
    public void m1(int a)
    {
    	
    }
  }
/*	public static void main() {
		
	}*/
