package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	WebDriver driver;
	
	@Test(dataProvider = "dptest", dataProviderClass = Dp.class)
	public void driverLaunch(String value) {
	 

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Win\\eclipse-workspace\\testng1\\target\\chrome\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys(value +Keys.ENTER);
	}


	 
	 
	}	
