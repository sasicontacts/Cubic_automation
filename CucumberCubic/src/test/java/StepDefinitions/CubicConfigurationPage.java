package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.ConfigurationPage;
import pages.HomePage;
import pages.ProjectPage;
import pages.SalesPage;
import util.TestBase;

public class CubicConfigurationPage extends TestBase {
	
	public ConfigurationPage configpage;
	public HomePage homepage;
	

	@Given("^user navigates to the configuration page$")
	public void user_navigates_to_the_configuration_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage = new HomePage();
		configpage = homepage.clickOnconfig("3000");
	    
	}

	@Given("configuration page displayed correctly {string}")
	public void configuration_page_displayed_correctly(String expectedTitle) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		configpage.configmenuclick();
        System.out.println(configpage.getpageTitle());

        Assert.assertTrue(configpage.getpageTitle().contains(expectedTitle));			
	}
	
	@Then("^user click the menu button$")
	public void user_click_the_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
       
		System.out.println("Menu click");
		configpage = configpage.configmenuclick();
	    
	}	

	
	@Then("^user select the configuration (.*)$")
	public void user_select_the_configuration(String config) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
       
		System.out.println("config menu click + : " +config);
		ConfigurationPage configpage = new ConfigurationPage();
		configpage.configitemclick(config);
	    
	}	
	
	@Then("^validate the title (.*)$")
	public void user_validate_the_title(String configtitle) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ConfigurationPage configpage = new ConfigurationPage();
		System.out.println(configpage.getHeading());		
		Assert.assertTrue(configpage.getHeading().contains(configtitle));
		System.out.println(configtitle+": true");
 
	    
	}
	
	@Then("^user clicks back to rapport$")
	public void user_clicks_back_to_rapport() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
       
		ConfigurationPage configpage = new ConfigurationPage();
		System.out.println("click back to Rapport page");
		homepage = configpage.clickbackclick();
		
//		ConfigurationPage configpage = new ConfigurationPage();
//		configpage.configitemclick(config);
	    
	}		

	@Then("back to home page {string}")
	public void user_in_home_page(String expectedTitle) throws InterruptedException {
		
		System.out.println("Home page displayed correctly");	
        System.out.println(homepage.getHomepageTitle());

        Assert.assertTrue(homepage.getHomepageTitle().contains(expectedTitle));
        
		       

	}
	
}
