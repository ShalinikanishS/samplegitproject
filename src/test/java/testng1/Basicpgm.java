package testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Basicpgm {
	@ BeforeSuite
	public void suite() {
		System.out.println("before suite");
	}
	@ BeforeTest 
	public void test() {
		System.out.println("before test");
	}
	@Test(priority=1)
	public void maintest() {
		System.out.println("main test");
	}
	

	@ BeforeClass
	public void class1() {
		System.out.println("before class");
	}
	@ BeforeMethod
	public void method() {
		System.out.println("before method");
	}
	
}
