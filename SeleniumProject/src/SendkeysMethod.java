import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sudipta");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("panda");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("poosudipta913");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("sudipta@123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sudipta@123");
		driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']")).click();
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9778597272");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
	}

}
