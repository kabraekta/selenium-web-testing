package admin.penpencil;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgetPasswordPage extends AbstractCommonMethod {
	public String weburl = "https://admin-dev.penpencil.xyz/pages/auth/login";

//Forget Password
  @Test
  public void testForgetPassword() {
	  launchandmaximize(weburl);
	  driver.findElement(By.cssSelector("a.secondary-text")).click();
	  sleep(2);
	  String actualUrl = driver.getCurrentUrl();
	  String expectedUrl = "https://admin-dev.penpencil.xyz/pages/auth/forgot-password";
	  assertEquals(expectedUrl,actualUrl);// Checking for Forget Password click properly or not 
	  
}
  @Test
  public void testUserContactNumber() {
	  driver.get("https://admin-dev.penpencil.xyz/pages/auth/forgot-password"); // used driver instance from supper class 
	  driver.manage().window().maximize();// Maximum the Window
	  String ContactNo = "8130658504";
	  String ContactId = "mat-input-7";
	  forgetpwdlogin(ContactNo,ContactId);
	  sleep(2);
	  driver.findElement(By.tagName("button")).click();
	  
  }
  

  
}
