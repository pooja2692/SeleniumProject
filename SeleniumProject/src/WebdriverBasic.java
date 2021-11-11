import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

	public static void main(String[] args) {
		boolean isCorrect = false;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		//System.out.println(title);
		if(title.equals("Google")) {
			isCorrect=true;
		}
		else {
			isCorrect=false;
		}
		System.out.println(isCorrect);
	}

}
