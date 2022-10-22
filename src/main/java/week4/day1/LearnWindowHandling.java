package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

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
		
		System.out.println("***********************************************");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		//to get the fourth window handle
		String fourthWindowHandle = listHandles.get(3);
		
		//to switch the control to the fourth window
		driver.switchTo().window(fourthWindowHandle);
		
		//driver.close(); // will close the current
		
		//driver.quit(); //to close all the windows opened by Selenium WebDriver
		
		
	//	driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		//System.out.println(windowHandles);

		// to get the current window title
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * //to go back to the first window
		 * driver.switchTo().window(listHandles.get(0));
		 * 
		 * 
		 * 
		 * String title1 = driver.getTitle(); System.out.println(title1);
		 */
		
		
		

		// second window
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Misaki");

	}

}
