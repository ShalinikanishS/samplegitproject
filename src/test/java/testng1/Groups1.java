package testng1;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups = {"Sanity","smoke"})
	public void testMethod1() { System.out.println("TestMethod1");
	}
	@Test(groups= {"smoke"})
	public void testMethod2() { System.out.println("TestMethod2");
	}
	@Test(groups = {"Sanity"})
	public void testMethod3() { System.out.println("TestMethod3");
	}
	}



