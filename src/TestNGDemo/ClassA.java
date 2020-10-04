package TestNGDemo;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups = { "Regression" })
	public void m1() {
		System.out.println("m1 method of A");
		throw new ArithmeticException();// hard Dpendancy
	}

	@Test(dependsOnMethods = { "m1" })
	public void m2() {
		System.out.println("m2 method of A");
	}

	@Test(groups = { "Regression", "Suchita" })
	public void m3() {
		System.out.println("m3 method of A");
	}

	@Test(groups = { "Suchita" })
	public void m4() {
		System.out.println("m4 method of A");
	}

	@Test(dependsOnGroups = { "Regression" }, groups = { "Suchita" })
	public void m5() {
		System.out.println("m5 method of A");
	}

	@Test
	public void m6() {
		System.out.println("m6 method of A");
	}
}
