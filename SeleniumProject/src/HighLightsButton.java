import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightsButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement signin=driver.findElement(By.xpath("//a[@class='login']"));
		flash(signin,driver);
	}

public static void flash (WebElement wb, WebDriver driver) {
  JavascriptExecutor js = ((JavascriptExecutor) driver); String bgcolour =
  wb.getCssValue("backgroundColour");
  for(int i=0;i<=100;i++) {
  changeColor("(rgb)0,200,0)",wb,driver);
  
  changeColor(bgcolour,wb,driver);

 } }
  
  public static void changeColor (String color,WebElement wb, WebDriver driver){ 
  JavascriptExecutor js = ((JavascriptExecutor) driver);
  js.executeScript("argument[0].style.backgroundColour, '"+color+"'",wb);
  
  }
 
  }
 