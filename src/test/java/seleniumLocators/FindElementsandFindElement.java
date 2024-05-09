package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsandFindElement {

	@Test
	public void  findElementandFindElementsMethods() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();

	int count = driver.findElements(By.xpath("//*[@id=\"content\"]//li")).size();
	
	System.out.println(count);
}
}

