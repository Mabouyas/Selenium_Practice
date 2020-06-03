import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Practice\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		driver.findElement(By.xpath("//*[@id='link1']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
