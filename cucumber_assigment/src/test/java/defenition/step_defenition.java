package defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defenition {
	public static String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	@Given("open the browser and navigate to the login page")
	public void open_the_browser_and_navigate_to_the_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	}

	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(By.name("userName")).sendKeys(string);	    
	}

	@When("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();   
	}
	@Then("Ishould see the title as :login successfully  #outcome")
	public void ishould_see_the_title_as_login_successfully_outcome()  throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);
		driver.close();
	}
}
