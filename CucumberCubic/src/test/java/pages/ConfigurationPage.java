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

public class ConfigurationPage extends TestBase {

//--------------------Project selection	
	
	
	@FindBy(xpath = "//span[normalize-space()='Submit']")
	WebElement proj_submit;		
	
	@FindBy(xpath = "//div[@class='nav-icon is-menu-open--false']" )
	WebElement cmd_config_menu;		
	
	@FindBy(xpath = "//a[normalize-space()='Our company']" )
	WebElement cmd_config_company;			
	
	@FindBy(id = "headingMain" )
	WebElement heading_main;
	
	@FindBy(xpath = "//a[@class='settings-back-link']" )
	WebElement click_back;
	
	
	public ConfigurationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ConfigurationPage configmenuclick() throws InterruptedException {
		
		   {
			      WebElement element = driver.findElement(By.cssSelector(".nav-icon"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
		   driver.findElement(By.cssSelector(".nav-icon")).click();
		   return new ConfigurationPage();

		
		
		
	}
	

	public HomePage clickbackclick() throws InterruptedException {
		
   
		   
		   click_back.click(); 
		   return new HomePage();

		
		
		
	}
	
	
	
	public void configitemclick(String config) throws InterruptedException {
		

		 
		Thread.sleep(3000);
		 driver.findElement(By.linkText(config)).click();
		   
	     System.out.println(config + "Menu selected");	      
   	     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
  	     driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS); 
  	     Thread.sleep(3000);
		
	}	

    public String getpageTitle() {
    	
    	return driver.getTitle();
    }
    
    public String getHeading() {
    	
    	return heading_main.getText();
    }

    

}
