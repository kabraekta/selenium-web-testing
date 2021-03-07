package admin.penpencil;
import org.testng.annotations.Test;

import admin.penpencil.framework.ClickMenu;



@Test 
public class Configuration extends AbstractCommonMethod{
  
	public String weburl = "https://admin-dev.penpencil.xyz/pages/auth/login";
	 public String contact = "8130658504";
	public  String passward = "password";

  public void testToUpdateProfile() { 
	  
	   launchandmaximize(weburl);
	   login(contact,passward);
	   // click menu 
	   ClickMenu menu = new ClickMenu(driver,"#main-navigation");
	   
	   
	   
	   
	  //First Name = id = mat-input-187  Last Name id = mat-input-188 email id = mat-input-189 
	   // Check box id //= mat-checkbox-1-input
	
	  //curr = mat-input-5 new = mat-input-6 confirm mat-input-7
	  	 
  }
  
}
