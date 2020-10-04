package UsingApachePoi;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders
{
  @DataProvider(name="getInformation")
  public static Object[][] getInformation() throws IOException
   {
	  Object[][] obj=PassExcel_Using_ApachePoi.readExcelfile();
	   return obj;

   }
}
