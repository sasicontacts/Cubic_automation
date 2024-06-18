package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class HomePage extends TestBase {

	
	
////div[@class='sc-gswNZR gSFXsg header-quick-create']//button[@aria-label='Create new item']	
	@FindBy(xpath = "//div[@class='sc-gswNZR gSFXsg header-quick-create']//button[@aria-label='Create new item']" )
	WebElement cmd_quick_menu;
	
	@FindBy(xpath = "//button[normalize-space()='Project']" )
	WebElement cmd_quick_project;	
	
	@FindBy(xpath = "//a[normalize-space()='Contact']" )
	WebElement cmd_quick_contact;
	
	@FindBy(xpath = "//a[normalize-space()='Sales invoice']" )
	WebElement cmd_quick_sales;	
	
	@FindBy(xpath = "//a[@aria-label='Rapport settings']" )
	WebElement cmd_config;	
	
	@FindBy(xpath = "//img[@title='Error: Image not found']")
	WebElement menu_logout;

	@FindBy(xpath = "//a[@class=' btn btn--red profile__a--logout']")
	WebElement cmd_logout;
	
	

	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProjectPage clickOnproject(String projecttype) throws InterruptedException {
		

		Actions action = new Actions(driver);
		
		action.moveToElement(cmd_quick_menu).build().perform();
		cmd_quick_menu.click();
		
		Thread.sleep(3000);

		Actions action1 = new Actions(driver);
		
		action1.moveToElement(cmd_quick_project).build().perform();
		cmd_quick_project.click();
		return new ProjectPage();
		
	
		
	}
	
	
    public String getHomepageTitle() {
    	
    	return driver.getTitle();
    }
    
	public ContactPage clickOncontact(String projecttype) throws InterruptedException {
		

		Actions action = new Actions(driver);
		
		action.moveToElement(cmd_quick_menu).build().perform();
		cmd_quick_menu.click();
		
		Thread.sleep(3000);

		Actions action1 = new Actions(driver);
		
		action1.moveToElement(cmd_quick_contact).build().perform();
		cmd_quick_contact.click();
		return new ContactPage();
		
	
		
	}	

	public SalesPage clickOnSales(String waittime) throws InterruptedException {
		
      
		Actions action = new Actions(driver);		
		action.moveToElement(cmd_quick_menu).build().perform();
		cmd_quick_menu.click();		
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);		
		action1.moveToElement(cmd_quick_sales).build().perform();
		cmd_quick_sales.click();
		return new SalesPage();
		
	
		
	}		


	public ConfigurationPage clickOnconfig(String waittime) throws InterruptedException {
		

		Thread.sleep(3000);
		Actions action1 = new Actions(driver);		
		action1.moveToElement(cmd_config).build().perform();
		cmd_config.click();
		System.out.println("Menu first click");
		Thread.sleep(1000);
		return new ConfigurationPage();
		
	
		
	}
	

	public LogoutPage clickLogout(String waittime) throws InterruptedException {
		

		Actions action = new Actions(driver);		
		action.moveToElement(menu_logout).build().perform();
		menu_logout.click();
		
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		
		action1.moveToElement(cmd_logout).build().perform();
		cmd_logout.click();
		return new LogoutPage();
		
		
	}
	
	
}
