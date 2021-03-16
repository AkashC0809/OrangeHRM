package orangeHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import orangeHRM.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest () throws IOException {
		
		
		Logger.info("url is opned");
		
		LoginPage lp = new LoginPage (driver) ;
		lp.setusername(username);
		Logger.info("username entered");
		
		lp.setpassword(password);
		Logger.info("password entered");
		
		lp.clicklogin();
		Logger.info("login to homepage");
		
		
		if (driver.getTitle().equals("OrangeHRM"))
		{
			Assert.assertTrue(true);
			Logger.info("Test case is passed");
			
		}
		
		else {
			captureScreen (driver , "loginTest") ;
			Assert.assertTrue(false);
			Logger.info("Test case is failed");
		}
		
	}
	

}
