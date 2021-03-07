package admin.penpencil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class FrameWorkMethod extends AbstractCommonMethod {
	WebDriver driver;
  @Test
  public void launchandmaximize(String sUrl) {
		
		driver.get(sUrl); // used driver instance from supper class 
		sleep(2);
		driver.manage().window().maximize();// Maximum the Window
		
}

public void login(String contact, String password, String contactid, String pwdid) {
	WebElement ContactElement = driver.findElement(By.id(contactid));// Contact No. 
	ContactElement.sendKeys(contact);
	sleep(5);
	WebElement PasswordElement = driver.findElement((By.id(pwdid)));
	PasswordElement.sendKeys(password);
	sleep(5);
			
		}

public void forgetpwdlogin(String contact, String contactid) {
	WebElement ContactElement = driver.findElement(By.id(contactid));// Contact No. 
	ContactElement.sendKeys(contact);
	sleep(5);

	}
public void ClickMenu(String sMenuName) {
	
	WebElement MenuElement = driver.findElement(By.linkText(sMenuName));
	sleep(2);
	MenuElement.click();
	
}
}
