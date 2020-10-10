package com.etsy.screenshot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Listeners(ListenersClass.class)
public class Demo extends Base {
	@BeforeMethod
	public void setUp() {
		initialization();

	}
	@AfterMethod
	public void tearDown() {
		
      driver.quit();
	}
	@Test
    public void takeScreenShotTest() {
		Assert.assertEquals(true, false);

	}
}
