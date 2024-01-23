package testng1;

import org.testng.annotations.DataProvider;

public class Dp {

	    @DataProvider (name = "dptest")
	     public Object[][] dpMethod(){
	        return new Object[][] {{"chennai"},{"thiruvarur"},{"trichy"}};
	     } 
	}


