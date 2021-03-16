package orangeHRM.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeavePage {
	
WebDriver ldriver ;
	
	public LeavePage (WebDriver rdriver) {
		
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);	
		}

	@FindBy (xpath = "//*[@id=\"menu_leave_viewLeaveModule\"]/b") 
	WebElement Leaves ;
	
	@FindBy (xpath = "//*[@id=\"leaveList_cmbSubunit\"]") 
	WebElement SubUnit ;
	
	
	
	public void clickLeaves () {
		Leaves.click();
	}
	
	public WebElement selectoptionbyindex (int a) {
		
		Select sel1 = new Select (SubUnit) ;
	    sel1.selectByIndex(a);
	    WebElement two = sel1.getFirstSelectedOption() ;
	  return two ;
		
	}
	
	public void selectoptionbytext (String text) {
		
		Select sel1 = new Select (SubUnit) ;
		sel1.selectByVisibleText(text);
	}
	public int countoption () {
		Select sel1 = new Select (SubUnit) ;
		List <WebElement> Alloptions = sel1.getOptions() ;
		int count = Alloptions.size() ;
		return count ;
		
		
	}
	
	
}
