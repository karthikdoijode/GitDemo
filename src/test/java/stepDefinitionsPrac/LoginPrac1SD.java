package stepDefinitionsPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPrac1SD {
	public WebDriver driver;
	@Given("user opens the login site  # describes the initial state")
	public void user_opens_the_login_site_describes_the_initial_state() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.shoppersstack.com/user-signin");
	    Thread.sleep(5000);
	}

	@When("user enters the valid {string} and {string} # describes the action")
	public void user_enters_the_valid_and_describes_the_action(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.id("Email")).sendKeys(string);
	    driver.findElement(By.id("Password")).sendKeys(string2);
	}
	
	@When("user clicks on login button icon #additional conditions to the step")
	public void user_clicks_on_login_button_icon_additional_conditions_to_the_step() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	    
	}

	@Then("users home page should be displayed #describes the expected outcome")
	public void users_home_page_should_be_displayed_describes_the_expected_outcome() {
		driver.findElement(By.id("search")).isDisplayed();
	    
	}

	@Then("close the browser #additional condition")
	public void close_the_browser_additional_condition() {
	    driver.close();
	}

}
