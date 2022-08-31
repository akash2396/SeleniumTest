package AutomationTesting.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobApplicationPage 
{
	WebDriver driver;
	
	public JobApplicationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Apply here now']")
	private WebElement applyButton;
	
	public void clickOnApply()
	{
		applyButton.click();
	}
	
}
