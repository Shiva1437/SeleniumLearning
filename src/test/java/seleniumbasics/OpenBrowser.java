package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for Chrome Driver   
//        System.setProperty("webdriver.chrome.driver", "E:\\Selenium Learning 2023\\SeleniumLearning\\src\\test\\resources\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.get("https://www.letskodeit.com/practice");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          
          

	}

}
