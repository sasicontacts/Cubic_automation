package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ProjectMainpage;
import pages.ProjectPage;
import pages.loginpage;
import util.TestBase;

public class CubicProjectPage extends TestBase {
    
//	loginpage loginpage;
	HomePage homepage;
    ProjectPage projectpage;
    String g_projecttype;
//    ProjectMainpage projectmainpage;

	
	@SuppressWarnings("deprecation")
	    
//	}

	@Given ("^User selects Project (.*) page$")
	public void user_selects_project_admin(String projecttype) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		g_projecttype = projecttype;
		
		ProjectPage projectpage = new ProjectPage();
		projectpage.selectProject(projecttype);
		
	}
	
	@Given ("user lands on project page {string}")
	public void user_lands_project_page(String expectedTitle) {
		
		System.out.println("User lands on project page");
		
		
	}
	
	@Given ("^user enter all the required details$")
	public void user_enter_details() throws InterruptedException {
		
		ProjectMainpage projectmainpage = new ProjectMainpage(1000);
		homepage = projectmainpage.createProject(prop.getProperty(g_projecttype));
		
	}
	
	@Given ("^Project created$")
	public void project_created() {
		
		System.out.println("Project created successfully");
		
	}	

	
}
