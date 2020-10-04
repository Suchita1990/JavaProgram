package TestDataProviders;

import org.testng.annotations.DataProvider;

import UsingJXL.ReadExcelByDataProvider;

public class DataProviders
{
   @DataProvider(name="basicInfoProvider")
   public static String[][] basicInfoProvider()
   {
	   String[][] data=ReadExcelByDataProvider.readExcel();
	     return data;
   }
}
