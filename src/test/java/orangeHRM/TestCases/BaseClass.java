package orangeHRM.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import orangeHRM.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig Readconfig = new ReadConfig() ;
	
	public String baseurl = Readconfig.getApplicationURL() ;
	public String username = Readconfig.getUsername() ;
	public String password = Readconfig.getPassword()  ;
	public static WebDriver driver ;
	public static Logger Logger ;
	
	
	
//	@Parameters ("Browser")
	@SuppressWarnings("static-access")
	@BeforeClass
	public void setup () {
		
		
		Logger = Logger.getLogger("OrangeHRM") ;
		PropertyConfigurator.configure("log4j.properties");
		
	//	if (br.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", Readconfig.getChromepath()) ;
		driver = new ChromeDriver () ;
		
		driver.get(baseurl);
	//	}
		
	/*	 else if(br.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", Readconfig.getChromepath()) ;
				driver = new FirefoxDriver () ;
		}
		
		 else if (br.equals("IE")) {
			 System.setProperty("webdriver.ie.driver", Readconfig.getChromepath()) ;
				driver = new InternetExplorerDriver () ;
			 
		 } */
		
	}
 
 @AfterTest
	public void tearDown () {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
