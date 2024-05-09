package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	@Test
	public void alertDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		Actions action= new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
		action.moveToElement(element).perform();
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='row']//div[2]//img[1]"));
		action.contextClick(element1).perform();
	}
}
