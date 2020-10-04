package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_Demo
{
   @Test
   public void m1()
   {
	String  expected="Hello";
	AssertionError e;
	Assert.assertEquals(expected, "Hello","Two Strings are not equal");
	Assert.assertTrue(10>20,"10 is not greater than 20");
	//--Hard Assertion--//
	Assert.assertTrue(20>10);
	Assert.assertTrue(20>30);
	Assert.assertTrue(50>20);
	Assert.assertTrue(70>20);
	
	/* //--Soft Assertion--//
	SoftAssert softly=new SoftAssert();
	softly.assertTrue(1>10,"1 is not greater than 10");
	softly.assertTrue(20>10);
	softly.assertTrue(20>30,"20 is not greater than 30");
	softly.assertTrue(50>20);
	softly.assertTrue(70>20);
    softly.assertAll();//It will check all assert.It is compulsory in softAssert
*/}
}
