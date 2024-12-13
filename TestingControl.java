package automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import java.util.concurrent.TimeUnit;

public class TestingControl {
	protected WebDriver driver;
	
	 @BeforeMethod
		@Parameters("DifferentBrowsers")
		public void Launch(String browser) throws Exception {

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
	 
			//Launching the specified URL 
			driver.get("https://screenia.app/login/authgroup");
			
			//Maximize the automated windows
			driver.manage().window().maximize();
			
			
}
			   
	 @AfterMethod
		public void tearDown()  throws Exception{
		 Thread.sleep(1000);
			driver.close(); 
				driver.quit();  
	}
}
