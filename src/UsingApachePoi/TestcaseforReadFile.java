package UsingApachePoi;

import org.testng.annotations.Test;

public class TestcaseforReadFile 
{
  @Test(dataProvider="getInformation",dataProviderClass=DataProviders.class)
  public void Display(String uname,String Password) 
  {
    System.out.println("uname  :" +uname+ "\t" + "Password:  " +Password);
  }
}
