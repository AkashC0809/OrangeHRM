package orangeHRM.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver ;
	
	public LoginPage (WebDriver rdriver) {
		
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy (xpath = "//*[@id=\"txtUsername\"]") 
	WebElement username ;
	
	@FindBy (id = "txtPassword") 
	WebElement password ;
	
	
	@FindBy (xpath = "//*[@id=\"btnLogin\"]")
	WebElement login ;
	
	@FindBy (xpath = "//*[@id=\"welcome\"]") 
	WebElement welcomepoul ;
	
	@FindBy (xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	WebElement logout ;
	
	public void setusername (String uname) {
		
		username.sendKeys(uname) ;	
	}
    public void setpassword (String pass) {
		
		password.sendKeys(pass) ;	
	}
    public void clicklogin() {
	
	login.click(); ;	
       }
    
    public void welcomepoul () {
    	
    	welcomepoul.click();
    }
    public void clicklogout ()  {
	logout.click();
       }

	
}







