package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ContactPage;
import pages.HomePage;
import pages.ProjectMainpage;
import pages.ProjectPage;
import pages.loginpage;
import util.TestBase;

public class CubicContactPage extends TestBase {
    
	HomePage homepage;
    ProjectPage projectpage;
    ContactPage contactpage;
	
	@SuppressWarnings("deprecation")
//	@Given("^browser is open$")
//	public void browser_is_open() {
//		
//		System.out.println("====Inside page object model=====");
//	    TestBase.initialization();
//	    
//	}

	@Given ("^User navigates to the  contact page$")
	public void user_navigates_contact_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage = new HomePage();
		contactpage = homepage.clickOncontact(prop.getProperty("projecttype"));
		
	
	}
	
	@Given ("^user enter the required contact details$")
	public void user_creates_new_contact() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		HomePage homepage = new HomePage();
		ContactPage contactpage = new ContactPage();	
		
		homepage =  contactpage.createcontact(prop.getProperty("contactName"));
		
	
	}
	
	@Then ("^Contact page created$")
	public void contact_page_created() throws InterruptedException {
		
		System.out.println("contact page created");
		
	}
//	
//	@Given ("^User navigates to the  contact page$")
//	public void user_lands_project_page() {}
	
//	@Given ("^user enter all the required details$")
//	public void user_enter_details() throws InterruptedException {
//		
//		ProjectMainpage projectmainpage = new ProjectMainpage();
//		homepage = projectmainpage.createProject(prop.getProperty("projectName"));
//	}
//	
//	@Given ("^Project created$")
//	public void project_created() {
//		
//		
//	}	

//	@When("^user located home page$")
//	public void user_in_home_page() throws InterruptedException {
//		
//      homepage.clickOnproject(prop.getProperty("projecttype"));
//
//	}
	

	
}
