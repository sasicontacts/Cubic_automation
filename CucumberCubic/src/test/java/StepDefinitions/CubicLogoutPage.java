package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ContactPage;
import pages.HomePage;
import pages.LogoutPage;
import pages.ProjectMainpage;
import pages.ProjectPage;
import pages.loginpage;
import util.TestBase;

public class CubicLogoutPage extends TestBase {
    
	HomePage homepage;
    LogoutPage logoutpage;
    
    
	
	@SuppressWarnings("deprecation")



	@Then("^user successfully logged out from the site$")
	public void user_successfully_logged_out_from_the_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		LogoutPage logoutpage = new LogoutPage();
		logoutpage.logoutsubmit();
	    
	}
	

	
}
