package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAnnotation
{
  @Parameters({"rollNumber","StudentName"})
  @Test(description="Roll Number & Student Name")
  public void m1(String rollNumber,String StudentName) 
  {
    System.out.println("First Test Case"+rollNumber);
    System.out.println("Student Name Is:"+StudentName);
 }
  @BeforeTest
  public void m2()
  {
   System.out.println("Before Test");
 }
  @Test
  public void m3()
  {
    System.out.println("Second Test Case");
 }
  @AfterTest
  public void m4()
  {
    System.out.println("After Test");
 }
  @BeforeSuite
  private void m5() 
  {
    System.out.println("Before Suite");
  }
  @AfterSuite
  public void m6()
  {
    System.out.println("After Suite");
   }
  @BeforeMethod
  public void m7()
  {
    System.out.println("Before Method");
  }
  @AfterMethod
  public void m8()
  {
    System.out.println("After Method");
  }
  @DataProvider
  public void m9() 
  {
    System.out.println("This is Data Provider");
  }
  @BeforeClass
  public void m10()
  {
   System.out.println("Before Class");
  }
  @AfterClass
  public void m11()
  {
   System.out.println("After Class");
  }
}
