package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginSteps {

	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"e:\\Projects\\Java\\Cucumber-Udemy\\CucumberFramework\\cucumberFramework\\src\\test\\java\\CucumberFramework\\Resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("^User navigates to the stackoverflow webstite$")
	public void user_navigates_to_the_stackoverflow_webstite() throws Throwable {
		driver.get("https://stackoverflow.com/");
		
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Log In')]")).click();
	}
		
	@Given("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nivagewod@eoffice.top");
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("xxx");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		WebElement askQuestionsButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
		Assert.assertEquals(true, askQuestionsButton.isDisplayed());
	}

}
