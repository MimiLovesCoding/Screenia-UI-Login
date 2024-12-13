package automationTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomateBasicTasks extends TestingControl {

	@Test(priority = 1)
	public void positivelogintest() throws InterruptedException {

		// Email field input
		WebElement Email = driver.findElement(By.id("click_login_email"));
		Email.sendKeys("nonara9215@datingel.com");
		
		// Password field input & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.id("click_login_password"));
		Password.sendKeys("nonara9215");
		
		// Sign up button click to login & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("click_login_next"));
		Signup.click();
		
		//Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(4000);

	}


	// Test Case 2: Verify invalid Email and invalid Password
	@Test(priority = -1)
	public void negativelogintest1() throws InterruptedException {

		// Email field input
		WebElement Email = driver.findElement(By.id("click_login_email"));
		Email.sendKeys("nonara@datingel.com");
		
		// Password field input & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("click_login_password"));
		Password.sendKeys("nonaradating");
		
		// Sign up button click to login & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		WebElement Signup = driver.findElement(By.id("click_login_next"));
		Signup.click();
		
		//Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		
		// Validation
		Assert.assertEquals("Wrong Email or Password", "Wrong Information Entered!");
	}

	// Test Case 3: Verify valid Email and invalid Password
	@Test(priority = 2)
	public void negativelogintest2() throws InterruptedException {

		// Email field input
		WebElement Email = driver.findElement(By.id("click_login_email"));
		Email.sendKeys("nonara9215@datingel.com");
		
		// Password field input & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("click_login_password"));
		Password.sendKeys("nonaradating");
		
		// Sign up button click to login & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(4000);
		WebElement Signup = driver.findElement(By.id("click_login_next"));
		Signup.click();
		
		//Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		
		// Validation
		Assert.assertEquals("Wrong Email or Password", "Wrong Information Entered!");
	}

	// Test Case 4: Verify invalid Email and valid Password
	@Test(priority = 3)
	public void inegativelogintest3() throws InterruptedException {

		// Email field input
		WebElement Email = driver.findElement(By.id("click_login_email"));
		Email.sendKeys("9215@datingel.com");
		
		// Password field input & Use of a "hard wait" for control over pause duration to ease view of process
	      Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("click_login_password"));
		Password.sendKeys("nonara9215@datingel.com");
		
		// Sign up button click to login & Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);
		WebElement Signup = driver.findElement(By.id("click_login_next"));
		Signup.click();
		
		//Use of a "hard wait" for control over pause duration to ease view of process
		Thread.sleep(2000);

		// Validation
		Assert.assertEquals("Wrong Email or Password", "Wrong Information Entered!");
		

	}

}
