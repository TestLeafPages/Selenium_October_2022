package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public ChromeDriver driver;

	@Given("Open the chrome browser - maximize and set the timeout")
	public void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@And("Load the application url {string}")
	public void loadURL(String url) {
		driver.get(url);
	}

	@And("Enter username as {string}")
	public void enterUsername(String userID) {
		driver.findElement(By.id("username")).sendKeys(userID);
	}

	@And("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Login button is clicked")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@But("Verify the error message displayed")
	public void verifyErrorMessage() {
		String message = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(message);
	}

	@Then("verify the user logged-in successfully")
	public void verifySuccessMessage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	}
}
