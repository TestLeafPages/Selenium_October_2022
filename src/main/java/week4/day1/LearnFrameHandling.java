package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev141516.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//my control is in main window so far
		
		//Switch the control inside the frame using index
	//	driver.switchTo().frame(0); // index starts with 0
		
		//switch to frame using id or name
		driver.switchTo().frame("gsft_mian");
		
		//switch to frame using webelement
		//step1: locate the iframe as WebElement
		//WebElement eleFrame = driver.findElement(By.id("gsft_main"));
		
		//pass the webelement into switch to frame
		//driver.switchTo().frame(eleFrame);
		
		
		
		
		//Inside a frame
		driver.findElement(By.id("user_name")).sendKeys("admin");


	}

}
