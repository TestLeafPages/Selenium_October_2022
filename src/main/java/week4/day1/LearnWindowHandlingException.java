package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlingException {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		//Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		
		//to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
