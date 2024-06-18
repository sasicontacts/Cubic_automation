package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ProjectPage;
import pages.loginpage;
import util.TestBase;

public class HomePageSteps extends TestBase {
    
	loginpage H;
	HomePage homepage;
	ProjectPage projectpage;
   
	@SuppressWarnings("deprecation")
	
	@Given("^browser is open$")
	public void browser_is_open() {
		
		System.out.println("====Inside page object model=====");
	    TestBase.initialization();
	    
	}

	@Then ("^user is logon page and enter login in details$")
	public void user_cubic_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		loginpage loginpage = new loginpage();
	
		homepage = loginpage.clickLoginoption(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Then("user located home page title {string}")
	public void user_in_home_page(String expectedTitle) throws InterruptedException {
		
		System.out.println("Home page displayed correctly");	
        System.out.println(homepage.getHomepageTitle());

        Assert.assertTrue(homepage.getHomepageTitle().contains(expectedTitle));
        
		
//        projectpage= homepage.clickOnproject(prop.getProperty("projecttype"));

	}
	
//	@And("user is navigated to login username screen")
//	public void user_is_navigated_to_search_results() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("user is navigated to login screen ");
//		//driver.getPageSource().contains("Microsoft");
//		loginpage login = new loginpage(driver);
//		login.enterUsername("r3c-selenium-full@outlook.com");
//		login.clickNext();
//		Thread.sleep(2000);
//		
////		driver.findElement(By.name("loginfmt")).sendKeys("r3c-selenium-full@outlook.com");
////		driver.findElement(By.id("idSIButton9")).click();
////		Thread.sleep(2000);
//		
//		//button[@id='idSIButton9'] idSIButton9
//		
//		//passwd
//		//button[@id='idSIButton9']passwd
//		
//		//driver.close();
//		//driver.quit();
//		//acceptButton
//	}
//		@And("user is navigated to login password screen")
//		public void user_is_navigated_to_password_screen() throws InterruptedException {
//		    // Write code here that turns the phrase above into concrete actions
//			System.out.println("user is navigated to password screen ");
//			loginpage login = new loginpage(driver);
//			login.enterPassword("$ur0pa123");
//			login.clickNext();
//			Thread.sleep(2000);			
//			//driver.getPageSource().contains("Microsoft");
////			driver.findElement(By.name("passwd")).sendKeys("$ur0pa123");
////			driver.findElement(By.id("idSIButton9")).click();
////			Thread.sleep(2000);
//			//button[@id='idSIButton9']
//			
//			//passwd
//			//button[@id='idSIButton9']
//			
//			//driver.close();
//			//driver.quit();
//		}
//		@And("user is accepted")
//		public void user_is_accepted() throws InterruptedException {
//		    // Write code here that turns the phrase above into concrete actions
//			System.out.println("user is accepted ");
//			//driver.getPageSource().contains("Microsoft");
////			driver.findElement(By.id("acceptButton")).click();
////			Thread.sleep(2000);
//			loginpage login = new loginpage(driver);
//			login.clickAccept();
//			Thread.sleep(2000);
//			//button[@id='idSIButton9']
//			
//			//passwd
//			//button[@id='idSIButton9']acceptButton
//			
//			//driver.close();
//			//driver.quit();
//		}
//		
//			@Then("user located home page")
//			public void user_is_navigated_to_home_screen() throws InterruptedException {
//			    // Write code here that turns the phrase above into concrete actions
//				System.out.println("user is navigated to home screen ");
////				driver.getPageSource().contains("SELECT");
//				loginpage login = new loginpage(driver);
//				login.checkSuccessful();
//				Thread.sleep(2000);
//
//				
////				driver.close();
////				driver.quit();
				
		
		
//	}

	
}
