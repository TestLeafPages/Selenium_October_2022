package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {
//	@Test(enabled = false) -> To switch on and off the @Test
//	@Ignore -> To switch on and off the @Test
//	(priority = -1) -> To set prority to @Test
	
	@Test(invocationCount = 5,invocationTimeOut = 1500)
	public void test1() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
}
