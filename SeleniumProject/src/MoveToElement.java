import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("(//a[text()='Women'])[1]")))
			.moveToElement(driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"))).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]")).click();

	}

}
