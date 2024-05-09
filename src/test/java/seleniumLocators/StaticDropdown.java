package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdown {
	
		@Test
		public void  staticDropdowns() {
		WebDriver driver = new ChromeDriver();
		driver.get("	https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.name("dropdown-class-example"));
		Select select = new Select(element);
		select.selectByValue("option2");
		}

}
