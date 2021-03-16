package orangeHRM.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro ;
	
	public ReadConfig () {
		File src = new File ("C:\\Selenium\\OrangeHRMV1\\Configuration\\config.properties") ;
		
		try {
			FileInputStream fis = new  FileInputStream (src) ;
			pro = new Properties () ;
			pro.load(fis);
			
		} catch (Exception e){
			System.out.println("Exception is " + e.getMessage()) ;
			
		}
	}
	 
	public String getApplicationURL () {
		String Url = pro.getProperty("Baseurl") ;
		return Url ;
	}
	public String getUsername () {
		String Username = pro.getProperty("username") ;
		return Username ;
	}
	public String getPassword () {
		String Password = pro.getProperty("password") ;
		return Password ;
	}
	public String getChromepath () {
		String chromedriver = pro.getProperty("Chromepath") ;
		return chromedriver ;
	}
	
	
}
