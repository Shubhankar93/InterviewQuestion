package takesScreenshotDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {
		System.out.println("abc");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHANKAR\\git\\SeleniumTraining\\SeleniumWithJAVA\\selenium-server-standalone-3.141.59.jar");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		
	}

}
