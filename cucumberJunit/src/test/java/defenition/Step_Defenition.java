package defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Defenition {
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;


	@Given("open the browser and navigate to the login page")
	public void open_the_browser_and_navigate_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(string);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("string");
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		}
	@Then("Ishould see the login page  #outcome")
	public void ishould_see_the_login_page_outcome() throws InterruptedException {
		Thread.sleep(4000);
		driver.get(url);	
	}
	@Then("Ishould not see the login page")
	public void ishould_not_see_the_login_page() throws InterruptedException {
		Thread.sleep(4000);
		driver.get(url);
		driver.close();

	}}
