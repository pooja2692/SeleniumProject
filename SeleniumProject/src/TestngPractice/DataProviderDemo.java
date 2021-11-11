package TestngPractice;

import java.util.EventObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class DataProviderDemo {
    WebDriver driver;
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

@DataProvider(name="logginApplication")
public Object[][] getData(){
	Object[][] ob = new Object[3][2];
	ob[0][0]="pooja2692@gmail.com";
	ob[0][1]="pooja@123";
	ob[1][0]="sudipta@gmail.com";
	ob[1][1]="sudipta@123";
	ob[2][0]="gangu@gmail.com";
	ob[2][1]="gangu@123";
	return  ob;
}

@Test(dataProvider = "logginApplication")
public void testData(String UserName, String Password){
	WebElement element =driver.findElement(By.xpath("//input[@id='email']"));
	element.sendKeys(UserName);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	
	
	
	
	
}}