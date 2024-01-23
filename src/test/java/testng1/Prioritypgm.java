package testng1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Prioritypgm {
	
		@Test(priority = 4)
		public void testMethod1() {
			System.out.println("Testing1");
		 
		}
		@Test(priority = 1)
		public void testMethod2() {
			System.out.println("Testing2");
		}
		@Test
		public void testMethod3() {
			System.out.println("Testing3");
		}
		@Test(priority = 3)
		public void testMethod4() {
			System.out.println("Testing4");
		}
		@Test(priority = 2)
		public void testMethod5() {
			System.out.println("Testing5");
		}

	}


