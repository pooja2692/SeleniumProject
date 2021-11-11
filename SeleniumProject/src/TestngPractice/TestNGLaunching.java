package TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGLaunching {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/pooja/eclipse-workspace/SeleniumProject/Driver/chromedriver.exe");
		driver=new ChromeDriver();	    
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().pageLoadTimeout(40,TimeUnit,SECONDS);
	    driver.get("https://www.google.com/");
	}
	@Test
	public void googleTittleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matched");
		/*
		 * if(title.equals("Google")) { System.out.println("test case pass"); } else {
		 * System.out.println("test case fail"); }
		 */
	}
		@Test 
		public void googleLogoTest() {
		boolean b=	driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(b);
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}
	

