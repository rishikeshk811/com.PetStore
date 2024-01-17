package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	
	
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement HomePagelogInbutton;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[contains(.,'Log in')]")
	private WebElement logInbutton;
	
	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerbutton;
	
	public WebElement getRegisterbutton() {
		return registerbutton;
	}


	public void setRegisterbutton(WebElement registerbutton) {
		this.registerbutton = registerbutton;
	}


	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getHomePagelogInbutton() {
		return HomePagelogInbutton;
	}


	public void setHomePagelogInbutton(WebElement homePagelogInbutton) {
		HomePagelogInbutton = homePagelogInbutton;
	}


	public WebElement getUsernameTextField() {
		return usernameTextField;
	}


	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}


	public WebElement getLogInbutton() {
		return logInbutton;
	}


	public void setLogInbutton(WebElement logInbutton) {
		this.logInbutton = logInbutton;
	}
	
	
	
	
	
}
