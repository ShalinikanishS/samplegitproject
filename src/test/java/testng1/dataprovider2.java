package testng1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider2 {
	  @DataProvider (name = "data-provider")
	     public Object[][] dpMethod(){
		 return new Object[][] {{"First-Value"}, {"Second-Value"},{"Third-Value"}};
	     }
		
	    @Test (dataProvider = "data-provider")
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
	}

