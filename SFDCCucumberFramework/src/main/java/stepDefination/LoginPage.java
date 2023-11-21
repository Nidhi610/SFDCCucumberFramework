package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	 private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"error\"]")
	public WebElement wrongPassword;
	
	@FindBy(id = "Login")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"rememberUn\"]")
	public WebElement rememberMe;
	
	@FindBy(xpath = "//*[@id=\"error\"]")
	public WebElement errorMessage; //*[@id="error"]
	
	@FindBy(xpath = "//*[@id=\"forgot_password_link\"]") 
	public WebElement forgotPassword;
	
	@FindBy(id = "un")
	public WebElement forgotUserName;
	
	@FindBy(id = "//a[text()='Return to Login']")
	public WebElement returnToLoginButton;
	
	@FindBy(id = "userNavLabel")
	public WebElement userMenu;
	
	@FindBy(xpath =  "//*[@id=\"userNav-menuItems\"]/a[5]")
	public WebElement logout;
	
	
	@Given("User login page is launched")
	public void user_login_page_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        PageFactory.initElements(driver, this);
	}

	@When("Username enters username field")
	public void username_enters_username_field(String usernameText) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(usernameText);
	       
	}

	@When("Password field is empty")
	public void password_field_is_empty(String passwordText) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		password.sendKeys(passwordText);
		
	}

	@When("login button is clicked")
	public void login_button_is_clicked() {
		loginButton.click();
	}

	@Then("Error msg Displayed on login page")
	public void error_msg_displayed_on_login_page() {
		String expectedErrorMessage = "Please enter your password";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOf(errorMessage));
        String actualErrorMessage = errorMsg.getText();
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

//	@Then("close the browser")
//	public void close_the_browser() throws InterruptedException {
//		Thread.sleep(3000);
//        driver.quit();
//	}
	
	@When("{string}")
	public void string(String usernameText) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(usernameText);
	}
	
	@When("Enter {string}")
	public void enter(String usernameText) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(usernameText);
	}

	@When("clear {string}")
	public void clear(String passwordText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		password.sendKeys(passwordText);
	}
	
	
	
	@When("Clicks on Forget password link")
	public void clicks_on_forget_password_link() {
	    forgotPassword.click();
	}

	@Then("Forget password page should be display")
	public void forget_password_page_should_be_display() {
	    
	}
	
	
	
	@When("Enter {string} and valid  {string}")
	public void enter_and_valid(String usernameText, String passwordText) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(usernameText);
	     wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwordText);
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
	    loginButton.click();
	}

	@Then("Home page should be display")
	public void home_page_should_be_display() {
	    
	}
	
	
	
	@When("Check Remember me checkbox")
	public void check_remember_me_checkbox() {
	   rememberMe.click();
	}

	
	
	@When("Click on User Menu")
	public void click_on_user_menu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    userMenu.click();
	}

	@When("Click Logout")
	public void click_logout() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     logout.click();
	}

	@Then("Should be logout")
	public void should_be_logout() {
	   
	}

}
