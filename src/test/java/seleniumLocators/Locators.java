package seleniumLocators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	@Test
	public void  allLocators() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.actitime.com/free-online-trial");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();

	
	driver.findElement(By.id("FirstName")).sendKeys("SHIVA");
	driver.findElement(By.id("LastName")).sendKeys("hello") ;


	
	}
}
