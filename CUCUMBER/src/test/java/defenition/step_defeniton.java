package defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defeniton {
public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;


@Given("I should go to the login page  #preconditions")
public void i_should_go_to_the_login_page_preconditions() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
}

@Given("Enter the username  {string}")
public void enter_the_username(String string) throws InterruptedException {
	Thread.sleep(9000);
 driver.findElement(By.name("username")).sendKeys(string);  
}
@Given("Enter the password  {string}")
public void enter_the_password(String string) throws InterruptedException {
	Thread.sleep(9000);
	 driver.findElement(By.name("password")).sendKeys(string); 
}

@And("Click on the login button")
public void click_on_the_login_button() throws InterruptedException {
	Thread.sleep(9000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
@Then("I should redirect to the login page  #outcomes")
public void i_should_redirect_to_the_login_page_outcomes() throws InterruptedException {
	Thread.sleep(7000);
	driver.get(url);
	driver.close();
}

}