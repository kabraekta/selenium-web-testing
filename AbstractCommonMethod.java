package admin.penpencil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractCommonMethod {

	protected WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		
		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	}
	@AfterTest
	public void aftertest() {
		  driver.quit();
		  
	  }
	public void sleep(int seconds) {
		
		try {
			Thread.sleep(seconds* 1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
public void launchandmaximize(String sUrl) {
		
		driver.get(sUrl); // used driver instance from supper class 
		sleep(2);
		driver.manage().window().maximize();// Maximum the Window
		
}

public void login(String contact, String password) {
	 
	WebElement ContactElement = driver.findElement(By.id("mat-input-0"));// Contact No. 
	ContactElement.sendKeys(contact);
	sleep(5);
	WebElement PasswordElement = driver.findElement((By.id("mat-input-1")));
	PasswordElement.sendKeys(password);
	sleep(5);
			
		}

public void forgetpwdlogin(String contact, String contactid) {
	WebElement ContactElement = driver.findElement(By.id(contactid));// Contact No. 
	ContactElement.sendKeys(contact);
	sleep(5);

	}


	
}