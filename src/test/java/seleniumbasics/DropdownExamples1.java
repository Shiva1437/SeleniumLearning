package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropdownExamples1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i = 1;
//		By using while loop
//		while (i <= 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		by using for loop
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
	}

}
