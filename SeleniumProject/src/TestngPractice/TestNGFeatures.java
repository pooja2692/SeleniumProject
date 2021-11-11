package TestngPractice;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFeatures {
WebDriver driver;
	
/*
 * @BeforeMethod public void setup() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:/Users/pooja/eclipse-workspace/SeleniumProject/Driver/chromedriver.exe");
 * driver=new ChromeDriver(); driver.manage().window().maximize(); //
 * driver.manage().timeouts().pageLoadTimeout(40,TimeUnit,SECONDS);
 * driver.get("https://www.google.com/"); }
 */
	@Test(priority=3)
	public void aaa() {
		System.out.println("aaa");
	}
	@Test(priority=2)
	public void bbb() {
		System.out.println("bbb");
	}
	@Test(priority=1)
	public void ccc() {
		System.out.println("ccc");
	}
	@Test(groups="test")
	public void ddd() {
		System.out.println("ddd");
	}
	@Test(groups="test")
	public void eee() {
		System.out.println("eee");
	}
	@Test(groups="testing")
	public void fff() {
		System.out.println("fff");
	}
	@Test(groups="testing")
	public void ggg() {
		System.out.println("ggg");
	}
	@Test
	public void hhh() {
		System.out.println("hhh");
	}
	@Test(dependsOnMethods = "hhh")
	public void iii() {
		System.out.println("iii");
	}
	@Test(invocationCount= 5)
	public void Addition() {
		int a=5;
		int b=5;
		int c=a+b;
		System.out.println("The sum of c is " + c);
	} 
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void kkk() {
		int i = 9/0;
		
	}
}
