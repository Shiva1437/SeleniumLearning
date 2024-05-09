package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public void alertDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

//	driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']")).click();
//	driver.findElement(By.linkText("JavaScript Alerts")).click();

		System.out.println("*****accept methods*****");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert simpleAlert = driver.switchTo().alert();

		simpleAlert.accept();

		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		simpleAlert.dismiss();

		driver.findElement(By.cssSelector("button[onClick=\"jsPrompt()\"]")).click();
		simpleAlert.sendKeys("hello, Alert Data");
		simpleAlert.accept();

	}
}