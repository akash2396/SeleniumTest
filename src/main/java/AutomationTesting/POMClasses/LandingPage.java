package AutomationTesting.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage 
{
	public WebDriver driver;
	Select selectJobType;
	Actions act;
	Select selectGraduationDegree;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		selectJobType = new Select(dropDown);
		act = new Actions(driver);
		selectGraduationDegree = new Select(graduationDegree);
	}
	
	@FindBy(xpath="//div/h1")
	private WebElement actualHeaderText;
	
	public String getActualHeaderText()
	{
		return actualHeaderText.getText();
		
	}
	
	@FindBy(id="job_type")
	private WebElement dropDown;
	
	public void selectJobType(String type)
	{
		selectJobType.selectByVisibleText(type);
	}
	
	
	@FindBy(xpath="//tr/td")
	private WebElement actualText;
	
	public String getActualText()
	{
		return actualText.getText();
		
	}
	
	@FindBy(xpath="//a[text()='QA Engineer']")
	private WebElement qaEngineer;
	
	public void clickOnQaEngineer()
	{
		qaEngineer.click();
	}
	
	@FindBy(xpath="(//button[text()='Apply'])[10]")
	private WebElement applyButton;
	
	public void howerMouseToApply()
	{
		act.moveToElement(applyButton).build().perform();
	}
	
	public void clickOnApply()
	{
		applyButton.click();
	}
	
	@FindBy(id="firstName")
	private WebElement firstNameOfApplicant;
	
	public void sendFirstName(String firstName)
	{
		firstNameOfApplicant.sendKeys(firstName);
	}
	
	@FindBy(id="lastName")
	private WebElement lastNameOfApplicant;
	
	public void sendLastName(String lastName)
	{
		lastNameOfApplicant.sendKeys(lastName);
	}
	
	@FindBy(id="email")
	private WebElement emailOfApplicant;
	
	public void sendEmail(String email)
	{
		emailOfApplicant.sendKeys(email);
	}
	
	@FindBy(id="phone")
	private WebElement phoneOfApplicant;
	
	public void sendPhone(String phone)
	{
		phoneOfApplicant.sendKeys(phone);
	}
	
	@FindBy(id="hometown")
	private WebElement homeTownOfApplicant;
	
	public void sendHomeTown(String homeTown)
	{
		homeTownOfApplicant.sendKeys(homeTown);
	}
	
	@FindBy(id="dob")
	private WebElement dobOfApplicant;
	
	public void sendDOB(String dob)
	{
		dobOfApplicant.sendKeys(dob);
	}
	
	@FindBy(id="current_city")
	private WebElement cityfApplicant;
	
	public void sendCity(String city)
	{
		cityfApplicant.sendKeys(city);
	}
	
	@FindBy(id="graduation_degree")
	private WebElement graduationDegree;
	
	public void selectGraduationDegree(String degree)
	{
		selectGraduationDegree.selectByVisibleText(degree);
	}
	
	@FindBy(id="graduation_course")
	private WebElement graduationCourse;
	
	public void sendGraduationCourse(String course)
	{
		graduationCourse.sendKeys(course);
	}
	
	@FindBy(id="graduation_college")
	private WebElement graduationCollege;
	
	public void sendGraduationCollege(String college)
	{
		graduationCollege.sendKeys(college);
	}
	
	@FindBy(id="graduation_percentage")
	private WebElement graduationPercentage;
	
	public void sendGraduationPercentage(String percentage)
	{
		graduationPercentage.sendKeys(percentage);
	}

	@FindBy(id="careers_form_btn_step1")
	private WebElement nextButton;
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}
		
}
