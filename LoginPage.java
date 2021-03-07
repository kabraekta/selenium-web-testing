package admin.penpencil;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


public class LoginPage extends AbstractCommonMethod {
	
	String weburl = "https://admin-dev.penpencil.xyz/pages/auth/login";
	  // Title of Login Page
	@Test 
	public void testTitleOfLoginPage() throws IOException  {
		  launchandmaximize(weburl);
		  sleep(2);
		  String actualTitle = driver.getTitle(); // Reading title of login page 
		  String expectedTitle = "Pen & Pencil";
		  assertEquals(expectedTitle,actualTitle); // Checking the title of login page 
		  
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(driver);
		 String sdriver = driver.getWindowHandle();
		 FileUtils.copyFile(screenshot, new File ("C:\\Users\\beawa\\eclipse-workspace\\Admin.Automation\\target\\Screenshot\\"+sdriver+
		 "LoginPage.png"));
		  
	  }
	@Test 
    public void testTitleOfLoginForm() {
		launchandmaximize(weburl);
		sleep(2);
		String sLoginFormTitle = driver.findElement(By.cssSelector("div.title")).getText();
		String sActualloginFormTitle = "LOGIN TO YOUR ACCOUNT";
		assertEquals(sActualloginFormTitle,sLoginFormTitle);
    	
    }
	// User Login
	@Test
    public void testUserLoginPage() {
		
		 launchandmaximize(weburl);
		 String contact = "8130658504";
		 String passward = "password";
		
		 login(contact,passward);
		 sleep(5);
		 driver.findElement(By.tagName("button")).click();;
		 sleep(5);
		 String acutalurl = driver.getCurrentUrl();
		 System.out.println(acutalurl);
		 String expectedurl = "https://admin-dev.penpencil.xyz/apps/dashboard";
		 assertEquals(expectedurl,acutalurl);// Checking for user has been login or not 
  }
    

}
