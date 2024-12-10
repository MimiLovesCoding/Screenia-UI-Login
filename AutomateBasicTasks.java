package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

			

public class AutomateBasicTasks {
	
		public static void main(String[] args) throws InterruptedException {
		System.out.println("Test starts");
		
	    WebDriver driver = new ChromeDriver();
	    System.out.println("Browser starts");
	    Thread.sleep(2000);
	    
	    //Maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    System.out.println("Window is opened");
		
	    //Open the webpage
		 driver.get("https://screenia.app/login/authgroup");
		 
		
//		 //Customer name
		WebElement userEmail = driver.findElement(By.id("click_login_email"));
		userEmail.sendKeys("mjf100.1999@gmail.com");
//
//		
//		//enter password
		WebElement userPassword = driver.findElement(By.cssSelector("#click_login_password"));
		userPassword.sendKeys("Hurryup1!");
//       
//		//click login button
//		WebElement logInButton = driver.findElement(By.id("click_login_next"));
//		logInButton.click();
	}

}
