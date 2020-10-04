package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestDataProviders.DataProviders;

public class SampleTest
{
@Test(dataProvider="basicInfoProvider",dataProviderClass=DataProviders.class)
  public void m1(String srNo, String name, String rollno, String City) 
  {
    System.out.println(srNo+"\t"+name+"\t"+rollno+"\t"+City+"\t");
 }
}
