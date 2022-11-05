package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@BeforeSuite
	public void bs1() {
		System.out.println("@BeforeSuite1");
	}
	@BeforeSuite
	public void bs2() {
		System.out.println("@BeforeSuite2");
	}
	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void bc() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void ac() {
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void at() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void as() {
		System.out.println("@AfterSuite");
	}
}
