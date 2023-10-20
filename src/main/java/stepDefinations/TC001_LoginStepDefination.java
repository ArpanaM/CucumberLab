package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	WebDriver driver;
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("Launch Rediff");
	   // System.setProperty("webdriver.chrome.driver","‪D:\\2023\\Sel@10AM(EST)\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
	    
	}
	@When("user clicks on Signin Link")
	public void user_clicks_on_signin_link() {

		System.out.println("Click on Signin link");
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("check Title")
	public void check_title() {

		System.out.println("Check title");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Rediffmail");
	}
	@When("user enters username and password clicks on submit button")
	public void user_enters_username_and_password_clicks_on_submit_button() {
	    System.out.println("Enter user name, password and click on submit button");
	    driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
	}
	@Then("validate the user and display Login Successful if user is valid")
	public void validate_the_user_and_display_login_successful_if_user_is_valid() {
	    System.out.println("Login Successful...");
	    driver.quit();
	}
	@When("user enters invalid username or password clicks on submit button")
	public void user_enters_invalid_username_or_password_clicks_on_submit_button() {
	    System.out.println("Enter invalid user name and password");
	}
	@Then("Check for the error message")
	public void check_for_the_error_message() {
	    System.out.println("Invalid user name or password entered..");
	}




}
