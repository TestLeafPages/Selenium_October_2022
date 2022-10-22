package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAllChildWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String firstWindowHandle = driver.getWindowHandle();
		
		System.out.println(firstWindowHandle);

		// first window
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String eachHandle : windowHandles) {
			
			if(!eachHandle.equals(firstWindowHandle)) {
				driver.switchTo().window(eachHandle);
				driver.close();
			}
			
			
		}
		
	
		
	}

}
