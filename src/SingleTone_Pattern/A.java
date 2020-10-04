package SingleTone_Pattern;

public class A
{
  private static A a;//declare variable
  
  static{
	  
	    a=new A();
   }
  private A()
  {
	  
  }
 // public A()
 // {
	  
  //}
  public static A getInstance()//get method ka return type A
  {
	 return a;
  }

}
