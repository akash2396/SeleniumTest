package AutomationTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomationTesting.POMClasses.JobApplicationPage;
import AutomationTesting.POMClasses.LandingPage;
import AutomationTesting.resources.Base;

public class TC01Test extends Base
{
	public WebDriver driver;
	
	@BeforeMethod
	public void initialize() throws IOException
	{
		driver=initializedriver();	
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void verifyFunctionality() throws IOException
	{
		
		String expectedHeaderText = "JOIN OUR CREW";
		String expectedText = "There are no available job positions that match your filters.";
		String expectedURL = "https://numadic.com/careers/qa-engineer.php";
		
		LandingPage landingPage= new LandingPage(driver);
		String actualHeaderText=landingPage.getActualHeaderText();
		Assert.assertEquals(actualHeaderText, expectedHeaderText);
		landingPage.selectJobType("Internship");
		String actualText =landingPage.getActualText();
		Assert.assertEquals(actualText, expectedText);
		landingPage.selectJobType("Full time");
		landingPage.clickOnQaEngineer();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
		JobApplicationPage jobApplicationPage = new JobApplicationPage(driver);
		jobApplicationPage.clickOnApply();
		driver.navigate().to("https://numadic.com/careers/");
		
		landingPage.howerMouseToApply();
		landingPage.clickOnApply();
		landingPage.sendFirstName("Akash");
		landingPage.sendLastName("Shingavi");
		landingPage.sendEmail("akashshingavi@gmail.com");
		landingPage.sendPhone("9595752396");
		landingPage.sendHomeTown("Aurangabad");
		landingPage.sendDOB("23/06/1996");
		landingPage.sendCity("Pune");
		landingPage.selectGraduationDegree("BE");
		landingPage.sendGraduationCourse("Engineering");
		landingPage.sendGraduationCollege("SPPU,Pune");
		landingPage.sendGraduationPercentage("88");
		landingPage.clickOnNextButton();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	

}
