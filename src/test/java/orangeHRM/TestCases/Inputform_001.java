package orangeHRM.TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import orangeHRM.pageObject.SeleniumEasy;

public class Inputform_001 extends BaseClass{
	
	@Test
	public void TC_001 () {
		
		SeleniumEasy SE = new SeleniumEasy (driver) ;
	    SE.clickinputform();
		SE.clickradiooption();
	//	if (driver.getTitle()=="Demosite") {
			
		//	Assert.assertTrue(true);
	//	}
	//	else {
	//		Assert.assertTrue(false);
	//	}

		SE.clickmale();
		WebElement male = SE.male ;
		if(male.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}	
	
		
	}


