package com.leaftaps.ui.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public String excelfilename;
	public static Properties prop;
	public FileInputStream fis;

	@Parameters({ "url", "browserName","language" })
	@BeforeMethod
	public void bm(String url, String browserName, String lang) throws IOException {
		if(lang.equals("english")) {
			fis = new FileInputStream("src/main/resources/english.properties");	
		}else if(lang.equals("french")) {
			fis = new FileInputStream("src/main/resources/french.properties");
		}
		
		prop = new Properties();
		prop.load(fis);
	
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please select chrome/edge/firefox");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver);
	}

	@AfterMethod
	public void am() {
		driver.close();
	}
	
	
	@DataProvider(name = "testData",indices=0)
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcelData.getData(excelfilename);
		return data;
	}
	
	
	
	
	
	
	
	
	
	
}
