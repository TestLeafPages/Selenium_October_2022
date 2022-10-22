package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAndAlertHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to frame
		WebElement eleFrame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(eleFrame);
		
		//click on Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		//enter the name in alert
		alert.sendKeys("Hari");
		
		//accept the alert
		alert.accept();
				
		//read the text
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
