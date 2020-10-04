package crossBrowsertestCase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Verify_Browser
{
	@Test(dataProvider="SignInData")
	public void SignIn(String uname,String Password)
	{
      System.out.println("uname:"+uname+"\t"+"Password:"+Password);
	}
    @DataProvider(name="SignInData")
	public Object[][] VerifypageTitle() throws IOException
	{
     // Object[][] obj=new Object[4][2];
     Reader fis=new java.io.FileReader("E:\\Eclipse Workspace\\TestNG\\src\\crossBrowsertestCase\\SignInData.csv");
     BufferedReader reader=new BufferedReader(fis);
     System.out.println(reader.readLine().split(",").length);
     int value=reader.readLine().split(",").length;
     int lines=(int) reader.lines().count();
     
    // String line=reader.readLine();
   //  int value=reader.readLine().split(",").length;
     reader=new BufferedReader(fis);
     Object[][] obj=new Object[lines][value];
     
     Scanner sc=new Scanner(reader);
   //  Object[][] obj=new Object[(int)reader.lines().count()][reader.readLine().split(",").length];
     int index=0;
    /* while(sc.hasNext())
     {
    	 String[] unamePassPair = sc.next().split(",");
    	 if(!unamePassPair[0].equals("uname"))
    	 {
    		 obj[index][0]=unamePassPair[0];
    		 obj[index][1]=unamePassPair[1];
    		 index++;
    	 }
     }*/
     while(sc.hasNext())
     {
    	 String[] unamePassPair = sc.next().split(",");
    	 if(!unamePassPair[0].equals("uname"))
    	 {
          for (int i = 0; i <= obj.length; i++)
            {
    	     for (int j = 0; j < obj[i].length; j++) {
    		 obj[i][j]=unamePassPair[j];
    	     }		   
    	 }
   	  }
   	}
	  return obj;
	}
}