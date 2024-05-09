package seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SuggestionDropdwonExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();	
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());	
		
//		Count the no.of checkbox available in webPage
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		Click and select values in dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
		
//		Auto suggestions dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

//		driver.close();
	}

}
