package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table//tr"));
		//each row is treated as one WebElement
					
		int size = allRows.size();
		//System.out.println(size);
			
		
		for (int i = 2; i <= size; i++) { //2,3,4 "+i+" // for traverse through rows
			
			List<WebElement> allTD = driver.findElements(By.xpath("//table//tr["+i+"]/td"));
			int columnSize = allTD.size();
			
			//table->tr->td
			for (int j = 1; j <= columnSize; j++) { // traverse through each td inside each row
				String text = driver.findElement(By.xpath("//table//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
			
		}
			
		
		
		
		
		
	}

}
