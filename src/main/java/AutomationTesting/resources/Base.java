package AutomationTesting.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import AutomationTesting.POMClasses.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializedriver() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AutomationTesting\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(browserName.equals("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
			
//			System.setProperty("webdriver.chrome.driver", 
//					System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//	driver=new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
			
//			System.setProperty("webdriver.gecko.driver", 
//					System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver=WebDriverManager.edgedriver().create();
			
//			System.setProperty("webdriver.edge.driver", 
//					System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
		
	}
	


}
