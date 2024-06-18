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

public class ContactPage extends TestBase {

//--------------------Project selection	
	@FindBy(id = "fn")
	WebElement txt_contactname;
	
	@FindBy(xpath = "//div[@class='css-bp8cua-ScrollManager']" )
	WebElement combo_scroll;

	@FindBy(id = "react-select-5-placeholder" )
	WebElement combo_title;
	
	@FindBy(id = "react-select-5-option-0" )
	WebElement combo_title_0;

	@FindBy(id = "react-select-11-placeholder" )
	WebElement combo_status;
	
	@FindBy(id = "react-select-11-option-0" )
	WebElement combo_status_0;	

	@FindBy(id = "dt*prof")
	WebElement txt_profession;
	
	@FindBy(id = "dt*bio")
	WebElement txt_bio;	
	
	@FindBy(id = "react-select-6-placeholder" )
	WebElement combo_relation;
	
	@FindBy(id = "react-select-6-option-3" )
	WebElement combo_relation_3;	
	
	@FindBy(xpath = "//button[@aria-label='Add new row']//div[@class='react-svg']//div//*[name()='svg']" )
	WebElement click_add;	

	@FindBy(id = "react-select-17-placeholder" )
	WebElement combo_company;
	
	@FindBy(id = "react-select-17-option-1" )
	WebElement combo_company_1;	
	
	@FindBy(id = "rel-person-0" )
	WebElement combo_person;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Create']" )	
	WebElement cmd_contact_create;
	
	@FindBy(xpath = "//span[normalize-space()='Add contact method']" )
	WebElement click_add_contact;		
	
	@FindBy(id = "react-select-18-placeholder" )
	WebElement combo_contact_type;
		
	@FindBy(id = "react-select-18-option-7" )
	WebElement combo_contact_type_7;		
	
	@FindBy(id = "emailVal0" )
	WebElement txt_email;
		
	
	
	public ContactPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage createcontact(String contactname ) throws InterruptedException {
		
		
		System.out.println("Contact Main Page");
		int index = (int)(Math.random()*15027);
		txt_contactname.sendKeys(contactname+index);
		
		comboselect(combo_status, combo_status_0);
		
        comboselect(combo_title, combo_title_0);		
        
        Thread.sleep(2000);        
        txt_profession.sendKeys("IT Consultant");
        Thread.sleep(2000);
        txt_bio.sendKeys("Created by Automation tool");
		Thread.sleep(3000);
		comboselect(combo_relation, combo_relation_3);
		Thread.sleep(3000);
    
		{
	        Actions builder = new Actions(driver);
            builder.moveToElement(click_add).perform();
            click_add.click();
        }

	    Thread.sleep(3000);
	    
	    {
	    combo_person.sendKeys("sel");
	    Thread.sleep(3000);
	    combo_person.sendKeys(Keys.ENTER);
	    }
	    
	    Thread.sleep(2000);	    
	    comboselect(combo_company, combo_company_1);
		Thread.sleep(3000);
		
		{
	        Actions builder = new Actions(driver);
            builder.moveToElement(click_add_contact).perform();
            click_add_contact.click();
        }
		
		Thread.sleep(1000);		
		txt_email.sendKeys("cubic_automation@abc.com");
		
		cmd_contact_create.click();	    
	    		
    	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   	      driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);  
   	      
   	    
   	      Thread.sleep(3000);
   	      driver.findElement(By.cssSelector("a .image-wrap__image")).click();   
   	      driver.manage().deleteAllCookies();
   	      return new HomePage();

   	 
   	      
	}
	
    public String getContactpageTitle() {
    	
    	return driver.getTitle();
    }			
	
   public void comboselect(WebElement comboclick, WebElement combovalue) throws InterruptedException {

	    
		Actions builder = new Actions(driver);
		builder.moveToElement(comboclick).clickAndHold().perform();
		Thread.sleep(2000);

		
	      Actions builder1 = new Actions(driver);
	      builder1.moveToElement(combo_scroll).release().perform();	 
	      Thread.sleep(2000);		
      
		
	      combovalue.click();
	      Thread.sleep(2000);
     

	   
   }

   public void comboselectdynamic(WebElement comboclick, WebElement combovalue, String inputvalue) throws InterruptedException {
      
	   
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("rel-person-0")).sendKeys("sel");
		Actions builder = new Actions(driver);
		builder.moveToElement(comboclick).clickAndHold().perform();
		Thread.sleep(3000);

		
	      Actions builder1 = new Actions(driver);
	      builder1.moveToElement(combo_scroll).release().perform();	 
	      Thread.sleep(3000);			
		
	      combovalue.click();
	      Thread.sleep(3000);	

	   
   }

}
