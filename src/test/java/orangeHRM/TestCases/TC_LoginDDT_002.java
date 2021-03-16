package orangeHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import orangeHRM.Utilities.XLUtils;
import orangeHRM.pageObject.LoginPage;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test (dataProvider = "LoginData")
	public void LoginDDT (String user , String pwd) {
		
		driver.get(baseurl);
		
		LoginPage lp = new LoginPage (driver) ;
		lp.setusername(user);
		lp.setpassword(pwd);
		lp.clicklogin();
		if (driver.getTitle().equals("OrangeHRM"))
		{
			Assert.assertTrue(true);
			Logger.info("Test case is passed");
			driver.close();
		}
		else  {
		Assert.assertTrue(false);
		Logger.info("Test Case is Failed");
		}
	
	}
	
	
	@DataProvider (name = "LoginData")
String [][]getdata() throws IOException {
		
		String path = "C:\\Selenium\\OrangeHRMV1\\src\\test\\java\\orangeHRM\\TestData\\LoginData.xlsx" ;
	int rownum = XLUtils.getRowCount(path, "Sheet1") ;
	int colcount = XLUtils.getCellCount(path, "Sheet1", 1) ;
	
	String logindata [][] = new String [rownum][colcount] ;
	
	
	for (int i =1 ; i<=rownum ; i++) {
		for (int j=0 ; j<colcount ; j++) {
			logindata [i-1][j] = XLUtils.getCellData(path, "sheet1", i, j) ;
		}
	}
	return logindata ;
}
	
	
	
}
