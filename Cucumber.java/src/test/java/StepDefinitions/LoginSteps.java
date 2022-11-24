package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver wd;

	@Given("user is on login page")
	public void verifyLoginPage() {
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
		wd=new FirefoxDriver();
		
		wd.get("https://demo.opencart.com/index.php?route=account/login");
	}

	

	@When("^The user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		wd.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(4000);
		wd.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(4000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to home page ");
	}

}
