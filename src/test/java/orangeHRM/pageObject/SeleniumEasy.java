package orangeHRM.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumEasy {
	
WebDriver ldriver ;
	
	public SeleniumEasy (WebDriver rdriver) {
		
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);	
		}

	@FindBy (xpath= "//*[@id=\"treemenu\"]/li/ul/li[1]/a")
	WebElement inputform ;
	
	@FindBy (xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a")
	WebElement radiobutton ;
	@FindBy (xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
	public static WebElement male ;
	
	@FindBy (xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")
	public static WebElement female ;
	
	@FindBy (xpath= "@FindBy (xpath= \"//*[@id=\\\"treemenu\\\"]/li/ul/li[1]/a\")\r\n"
			+ "	WebElement inputform ;")
	WebElement checkbox ;	
	
	@FindBy (xpath= "@FindBy (xpath= \"//*[@id=\\\"treemenu\\\"]/li/ul/li[1]/a\")\r\n"
			+ "	WebElement inputform ;")
	WebElement checkboxoption1 ;
	
	@FindBy (xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
	WebElement checkboxoption2 ;
	
	public void clickinputform () {
	
		inputform.click();
		
	}
	
	public void clickradiooption () {
		
		radiobutton.click();
	}
	public void clickmale () {
		male.click();
	}
	public void female () {
		female.click();
	}

	public void clickcheckbox () {
		checkbox.click();
	}
	public void clickcheckbox1 () {
		checkboxoption1.click();
	}
	public void clickcheckbox2 () {
		checkboxoption2.click();
	}
	
}
