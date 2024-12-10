package automationTest;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.By.ByCssSelector;


public class LoginUsingDiffBrowsers {
	   WebDriver driver;
		
	   @BeforeMethod
		@Parameters("DifferentBrowsers")
		public void Launch(String browser) {

			if (browser.equals("chrome")) {
				driver = new ChromeDriver();
			}
			if (browser.equals("firefox")) {
				driver = new FirefoxDriver();
			}
			if (browser.equals("edge")) {
				driver = new EdgeDriver();
			}
			if (browser.equals("safari")) {
				driver = new SafariDriver();
			} else {
				System.out.println("Browser Tests Complete 🎯");
			}
			
			
			//Specifying implicit wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			
			
			
		}
			
		
	  @Test 
	  	public void logintest () {
		//Launching the specified URL 
			driver.get("https://screenia.app/login/authgroup");
			
			//Maximize the automated windows
			driver.manage().window().maximize();
		  
		  //Auto Insert Email 
		  WebElement Email = driver.findElement(By.id("click_login_email"));
			Email.sendKeys("mayan85344@iminko.com");
			
			//Auto Insert Password
			WebElement Password = driver.findElement(By.id("click_login_password"));
			Password.sendKeys("Mayan85344");
			
			//Auto click the Log in button
			WebElement login = driver.findElement(By.id("click_login_next"));
			login.click();
		  
	  }
	
	   @AfterMethod
		public void tearDown() {
			driver.close(); 
				driver.quit();
			}
	  
	}
	

