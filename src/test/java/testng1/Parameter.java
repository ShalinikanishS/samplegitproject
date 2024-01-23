package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter {
	public WebDriver driver;

	@Parameters({"browser"}) 
	@Test
	public void driverLaunch(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
System.out.println("chrome");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Win\\eclipse-workspace\\testng1\\target\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.out.println("firefox");

	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	}
	driver.get("https://www.google.com/");
	 
	}}



