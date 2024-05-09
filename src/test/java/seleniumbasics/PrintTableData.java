package seleniumbasics;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTableData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

        // Navigate to the webpage with the table
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        // Find the table element by its ID
        WebElement table = driver.findElement(By.id("customers"));

        // Read table data into a list of lists
        List<List<String>> tableData = new ArrayList<>();
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<String> rowData = new ArrayList<>();
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                rowData.add(cell.getText());
            }
            tableData.add(rowData);
        }

        // Print the table data
        for (List<String> rowData : tableData) {
            for (String cellData : rowData) {
                System.out.print(cellData + "\t");
            }
            System.out.println();
        }

        // Close the browser session
        driver.quit();
}
}