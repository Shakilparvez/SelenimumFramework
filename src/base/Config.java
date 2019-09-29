package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Config {

	public WebDriver driver;
	
	@BeforeMethod
	
	public void beforeEachMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@AfterTest

	public void afterEachMethod(){
	//System.out.println("After each method");
	//System.out.println (" ==========  ");
	driver.quit();
	}
}
	
	
	
	

