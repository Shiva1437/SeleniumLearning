package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://patilkaki.com/products/besan-ladoo");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='dropbtn d-flex drop-link'])[4]"))).build().perform();
		
		driver.navigate().to("https://www.google.com/");
		
		action.moveToElement(driver.findElement(By.id("APjFqb"))).click().keyDown(Keys.SHIFT).sendKeys("shiva").doubleClick().build().perform();
		
	}

}
