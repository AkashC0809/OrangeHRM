package orangeHRM.TestCases;

import org.testng.annotations.Test;

import orangeHRM.pageObject.SeleniumEasy;

public class Inputform_002 extends BaseClass {
	@Test
	public void TC_001 () {
		SeleniumEasy SE = new SeleniumEasy (driver) ;
		SE.clickinputform();
		
	}

}
