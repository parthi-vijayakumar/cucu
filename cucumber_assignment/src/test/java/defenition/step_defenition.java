package defenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defenition {
	public static String url ="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	
	@Given("open the browser and navigate to the login page")
	public void open_the_browser_and_navigate_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("Enter the UserName {string}")
	public void enter_the_user_name(String string) throws InterruptedException {
		Thread.sleep(9000);
		System.out.println("user");

	}

	@When("Enter the Password {string}")
	public void enter_the_password(String string) {
	   
	}

	@When("Click on login")
	public void click_on_login() {
	   
	}

	@Then("I should see the title as welcome :mercury towers  #outcome")
	public void i_should_see_the_title_as_welcome_mercury_towers_outcome() {
	   
	}
}