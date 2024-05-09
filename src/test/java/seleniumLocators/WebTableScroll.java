package seleniumLocators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
public class WebTableScroll {


public class webTableScrollMethod {
	@Test
	public void alertDemo() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Entire Page Scroll
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
//		WebTableScroll
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		


	}
	}
}
