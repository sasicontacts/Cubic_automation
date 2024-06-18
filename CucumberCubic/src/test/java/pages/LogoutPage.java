package 
pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBase;

public class LogoutPage extends TestBase {

	
	@FindBy(xpath = "//a[@class='settings-back-link']" )
	WebElement click_back;

	@FindBy(xpath = "//input[@name='submit.Accept']" )
	WebElement logout_submit;	
		
	
	public LogoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public LogoutPage configmenuclick() throws InterruptedException {
		
		   {
			      WebElement element = driver.findElement(By.cssSelector(".nav-icon"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
		   driver.findElement(By.cssSelector(".nav-icon")).click();
		   return new LogoutPage();

		
		
		
	}
	
	public void logoutsubmit() throws InterruptedException {
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);		
		action.moveToElement(logout_submit).build().perform();
		logout_submit.click();		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}
	
   

}
