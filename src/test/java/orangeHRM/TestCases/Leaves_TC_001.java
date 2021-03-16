package orangeHRM.TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import junit.framework.Assert;
import orangeHRM.pageObject.LeavePage;
import orangeHRM.pageObject.LoginPage;

public class Leaves_TC_001 extends BaseClass{
	
	
	
	@Test
	public void TC_001 () {
		
		LeavePage Leavepage = new LeavePage(driver) ;
		LoginPage lp = new LoginPage (driver) ;
		
		System.out.println(driver.getTitle()) ;
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicklogin();
		//System.out.println(driver.getTitle()) ;
		Leavepage.clickLeaves();
		
	//	System.out.println(driver.getTitle());
	//	Assert.assertEquals("Leaves", driver.getTitle());
		int count = Leavepage.countoption();
		Assert.assertEquals(13, count);
		
	}
	@Test
	public void TC_002 () {
		
		LeavePage Leavepage = new LeavePage(driver) ;
		LoginPage lp = new LoginPage (driver) ;
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicklogin();
		Leavepage.clickLeaves();
		WebElement two = Leavepage.selectoptionbyindex(2) ;
	String selectedoption = two.getText() ;
	String option2= "Engineering" ;
	Assert.assertEquals(option2, selectedoption);
		
		

	
		
	}
	
	
	

}
