package com.PetStore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.LogInPage;

public class LogInTest {

	
	@Test
	public void logInwithValidDetails() throws InterruptedException {
		/*
		 *  we are automating this testCases because it is one of the most Important functionality i.e LogIn ,and it is also a 
		 *  Regression TestCases,it is  used in as Precondition of all the TestCases ,generally in our Framework we store this code in 
		 *  base Class with @Before Class Annotaions  ,it is Adding more value in terms of Automation 
		 */
		
	// END TO END Scacerio for LogIn
		String nickname ="Mukeshkumar";
		ChromeOptions options=new ChromeOptions();
		options.addArguments(" -disable --notifications ");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.gametwist.com/en/");
		LogInPage lg =new LogInPage(driver);

		lg.getHomePagelogInbutton().click();
	lg.getUsernameTextField().sendKeys(nickname);
		lg.getPasswordTextField().sendKeys("password@123");
		
		lg.getLogInbutton().click();
	      WebElement username=	driver.findElement(By.xpath("//div[.='Mukeshkumar']"));
	      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	      wait.until(ExpectedConditions.visibilityOf(username));
	              String text=  username.getText();
	              Assert.assertEquals(text, nickname);
	              
	              username.click();
	              Thread.sleep(3000);
	              driver.findElement(By.id("onetrust-reject-all-handler")).click();
	                WebElement logOutElement=  driver.findElement(By.xpath("//a[contains(.,'Log out')]"));
	              Actions action =new Actions(driver);
	              action.scrollToElement(logOutElement).perform();
	              logOutElement.click();
	              
	                String registerButtonText= lg.getRegisterbutton().getText();
	                if (lg.getHomePagelogInbutton().isDisplayed()) {
						System.out.println("logout Successful : LogIn Page is Displayed ");
					}
	                else {
					System.out.println("Failed to Do LogOut");
					}
	                
	           Assert.assertEquals(registerButtonText, "REGISTER");
	           driver.quit();
		
		
		
	}
}
