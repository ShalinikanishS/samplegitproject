package testng1;

import org.testng.annotations.Test;

public class DependsOnMethod1 {
	@Test
	public void signin() {
		System.out.println("signin");
	}

	@Test(dependsOnMethods = "signout")
	public void login() {
		System.out.println("login");
		//throw new RuntimeException();
    }

	@Test(dependsOnMethods = "addcard")
	public void search() {
		System.out.println("search");
	}

	@Test(dependsOnMethods = "signin")
	public void addcard() {
		System.out.println("addcard");
	}

	@Test(dependsOnMethods = "search")
	public void signout() {
		System.out.println("signout");
	}

}
