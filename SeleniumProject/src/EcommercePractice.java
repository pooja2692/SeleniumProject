import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EcommercePractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("pooja2692@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("soni");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pooja@123");
		Select sel = new Select
		(driver.findElement(By.xpath("//select[@id='days']")));
		sel.selectByValue("2");
		Select sel1 = new Select
		(driver.findElement(By.xpath("//select[@id='months']")));
		sel1.selectByIndex(6);
		Select sel2 = new Select
		(driver.findElement(By.xpath("//select[@id='years']")));
		sel2.selectByValue("1992");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("JF 269");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("jagda");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("rourkela");
		Select sel3 = new Select
	    (driver.findElement(By.xpath("//select[@id='id_state']")));
		sel3.selectByVisibleText("Alaska");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		
		  WebElement wb=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		 // JavascriptExecutor js = (JavascriptExecutor) driver;
		  //js.executeScript("arguments[0].scrollIntoView(true);", wb);
		  wb.sendKeys("9886672665");
		  driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		 
//		Thread.sleep(3000);
//		((JavascriptExecutor )driver).executeScript("scroll(0,800)");
		
	}

	}


