package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		System.out.println(driver.getTitle());
		WebElement titleEle= driver.findElement(By.tagName("title"));
		System.out.println("Title of webpage by webelement title :"+titleEle.getAttribute("textContent"));

	}

}
