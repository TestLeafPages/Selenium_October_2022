package week8.day2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		
		//Step1: Create object for FileInputStream -> java class to read data from file
		FileInputStream fis = new FileInputStream("src/main/resources/configuration.properties");
		
		//Step2: Create object for Properties class
		Properties prop = new Properties();
		
		//Step3: To load all the properties from a file
		prop.load(fis);
		
		//Step4: to get the data of a property
		System.out.println(prop.getProperty("url"));
		

		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		  driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99") ; 
		  driver.findElement(By.name("submitButton")).click(); 
		  String text = driver.findElement(By.id("viewLead_companyName_sp")).getText(); 
		  String id = text.replaceAll("\\D", ""); 
		  System.out.println(id);
		  
		  
		  //to write data in a file
		  FileOutputStream fos = new FileOutputStream("src/main/resources/configuration.properties");
		  
		  //Set a property name(Key) and value
		  prop.setProperty("lead_id", id);
		  
		  //to save the properties file
		  prop.store(fos, "latest lead id saved");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 

	}

}
