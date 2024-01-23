package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAssertion {
	@Test
	public void test1() {
		System.out.println("AIITE");
	}
	@Test
	public void test2() {
		System.out.println("Academy");
	}
	
	
	@Test(retryAnalyzer=FailedTestCaseRetry.class)
	public void test3() {
		String expected="Aiite academy";
		String actual="AiiteAcademy";
		Assert.assertEquals(expected, actual);	
	}

}
