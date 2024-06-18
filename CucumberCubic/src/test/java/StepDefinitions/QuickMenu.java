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
import pages.ProjectPage;
import pages.loginpage;
import util.TestBase;

public class QuickMenu extends TestBase {
    
	HomePage homepage;
	ProjectPage projectpage;
	ContactPage contactpage;
	LogoutPage logoutpage;
   
	@SuppressWarnings("deprecation")


	@When("^user selected Project menu$")
	public void user_selected_project_menu() throws InterruptedException {
		
		HomePage homepage = new HomePage();
		
		System.out.println("user selects quick menu - project");		
        projectpage = homepage.clickOnproject(prop.getProperty("projecttype"));

	}
	
	@When("^user selected contact menUser navigates to the  contact page$")
	public void user_selected_create_menu() throws InterruptedException {
		
		HomePage homepage = new HomePage();
		
		System.out.println("user selects quick menu - Contact page");		
        contactpage = homepage.clickOncontact(prop.getProperty("projecttype"));

	}	
	
	
	@Given("^user navigates to the logout icon$")
	public void user_naviages_to_the_logout_icon() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage = new HomePage();
		System.out.println("user click logout page");
		logoutpage = homepage.clickLogout("3000");		
	    
	}
	
}
