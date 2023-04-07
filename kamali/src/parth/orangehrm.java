package parth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	public static String kam="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//parth//Documents//workspace-spring-tool-suite-4-4.16.0.RELEASE//kamali//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(kam);
		System.out.println("orangehrm is opened");
		String beforelogin = driver.getTitle();
		System.out.println(beforelogin);
		Thread.sleep(5000);
		driver.findElement( By.name("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		String afterlogin =driver.getTitle();
		System.out.println(afterlogin);
		if(beforelogin.equals(afterlogin)) {
			System.out.println("login SUCCESFULL");
			driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			Thread.sleep(5000);
		}
		else 
		{
			System.out.println("login failed");
		} 
		driver.close();
	}
}
