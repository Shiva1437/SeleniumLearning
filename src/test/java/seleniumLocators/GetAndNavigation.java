package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GetAndNavigation {

	@Test
	public void  GetandNavigationMethod() {
	WebDriver driver = new ChromeDriver();
	driver.get("	https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();

	driver.navigate().to("http://google.com/");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	
	}
}
