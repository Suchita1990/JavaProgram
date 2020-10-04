package TestNGDemo;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionHandle
{
/*  @Test(expectedExceptions= {ArithmeticException.class,IOException.class})
  public void Login() 
  {
    System.out.println("Hello Testing Shastra");
    throw new ArithmeticException();
}*/
 @Test(dataProvider="LoginDataProvider")
  public void m1(String uname,String pass)
  {
	 if(uname.contains("uname") && pass.contains("pass"))
	 {
	   System.out.println(uname+"\t"+pass);	 
	 }else
	 {
		 throw new ArithmeticException();
	 }
  }
  public Object[][] loginData() //dataprovider should always return object array it can one or two daimension array
  {
	 Object[][] values= {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}}; 
	
    	return values;
	
}
}
