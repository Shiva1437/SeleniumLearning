package seleniumLocators;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	@Test
	public void alertDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		String childWindowText = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(childWindowText);
		driver.switchTo().window(parentId);

	}
}
