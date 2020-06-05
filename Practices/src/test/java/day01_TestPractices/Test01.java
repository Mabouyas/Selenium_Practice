package day01_TestPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://www.facebook.com";
		String expectTitle = "facebook.com";
		String tagName = "";
		driver.get(baseUrl);
		if (baseUrl.equals(expectTitle)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
		
		
		tagName = driver.findElement(By.id("email")).getText();
		System.out.println(tagName);
		
		System.exit(0);
		
		
	}
}
