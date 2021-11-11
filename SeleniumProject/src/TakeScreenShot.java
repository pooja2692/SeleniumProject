import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			//TakeScreenShot scr = (TakeScreenShot) driver;
			 File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 try {
				FileHandler.copy(screen, new File("C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\ScreenShot\\google.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

	
}