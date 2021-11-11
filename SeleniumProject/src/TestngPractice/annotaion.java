package TestngPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotaion {
	
	@BeforeSuite
	public void SetPropery() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BeforeTest");
}
	@BeforeClass
	public void LoginApp() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void EnterUrl() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void testngtest() {
		System.out.println("Test");
	}
	
}

