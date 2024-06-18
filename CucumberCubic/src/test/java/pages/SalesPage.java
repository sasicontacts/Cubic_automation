package 
pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBase;

public class SalesPage extends TestBase {

//--------------------Project selection	
	Date date;
	SimpleDateFormat formatter;
	
	@FindBy(id = "pn" )	
	WebElement combo_customer;		

	@FindBy(id = "sr" )	
	WebElement txt_reference;	
	
	@FindBy(id = "ctName" )	
	WebElement txt_ctname;	
	
	@FindBy(id = "title" )	
	WebElement txt_title;	

	@FindBy(id = "desc" )	
	WebElement txt_desc;
	
	@FindBy(id = "issue" )	
	WebElement date_issuedate;
	
	@FindBy(id = "due" )	
	WebElement date_duedate;

	@FindBy(id = "proj-0" )	
	WebElement combo_project_0;

	@FindBy(id = "desc-0" )	
	WebElement combo_desc_0;
	
	@FindBy(xpath = "//input[@id='quantity-0']" )	
	WebElement txt_quantity_0;

	@FindBy(xpath = "//input[@id='unit-0']" )	
	WebElement txt_unit_0;
	
    
	@FindBy(xpath = "//div[@class='css-bp8cua-ScrollManager']" )
	WebElement combo_scroll;
	
	@FindBy(id = "react-select-10-placeholder" )
	WebElement combo_nom_code;	
	
	@FindBy(id = "react-select-10-option-0" )
	WebElement combo_nom_code_0;		
	
	@FindBy(xpath = "//span[normalize-space()='Create']")
	WebElement proj_create;	
	
	
	@FindBy(xpath = "//span[normalize-space()='Submit']")
	WebElement proj_submit;		
	
	public SalesPage() {
		
		PageFactory.initElements(driver, this);
		

	}
	

    public String getpageTitle() {
    	
    	return driver.getTitle();
    	
    }
    
    public void deletecookies() {
    	
    	driver.manage().deleteAllCookies();
    }

    public void populaterequiredinfo(String customer, String reference, String qty, String amount) throws InterruptedException {
    	
    	
    	int index = (int)(Math.random()*15027);
    	reference = reference+index;
    	combo_customer.sendKeys(customer);
    	Thread.sleep(3000);
    	combo_customer.sendKeys(Keys.ENTER);
    	txt_reference.sendKeys(reference);
    	txt_ctname.sendKeys(reference);
    	txt_title.sendKeys(reference);
    	txt_desc.sendKeys(reference);
    	Thread.sleep(2000);
 
    	String datevalue = getcurrentdate();
    	date_duedate.sendKeys(datevalue);
    	
//    	date_duedate.sendKeys("01/07/24");
    	date_duedate.sendKeys(Keys.TAB);
    	Thread.sleep(3000);
    	combo_project_0.sendKeys(customer);
    	Thread.sleep(3000);
    	combo_project_0.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	combo_desc_0.sendKeys(reference);
    	txt_quantity_0.click();
    	Thread.sleep(1000);
    	txt_quantity_0.sendKeys(qty);
    	Thread.sleep(1000);
    	txt_unit_0.click();
    	Thread.sleep(1000);
    	txt_unit_0.sendKeys(amount);    	
    	Thread.sleep(3000);
    	txt_unit_0.sendKeys(Keys.TAB);
    	Thread.sleep(1000);
   	
    	comboselect(combo_nom_code, combo_nom_code_0);
    	
    	Thread.sleep(2000);
    }    

    public void populaterequiredinfofew(String customer, String reference) throws InterruptedException {
    	
    	
    	int index = (int)(Math.random()*15027);
    	reference = reference+index;
    	combo_customer.sendKeys(customer);
    	Thread.sleep(3000);
    	combo_customer.sendKeys(Keys.ENTER);
    	txt_reference.sendKeys(reference);
    	txt_ctname.sendKeys(reference);
    	txt_title.sendKeys(reference);
    	txt_desc.sendKeys(reference);
    	Thread.sleep(2000);
    	
    	
    	String datevalue = getcurrentdate();
    	date_duedate.sendKeys(datevalue);
    	date_duedate.sendKeys(Keys.TAB);
    	Thread.sleep(3000);
    	combo_project_0.sendKeys(customer);
    	Thread.sleep(3000);
    	combo_project_0.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	combo_desc_0.sendKeys(reference);
    	Thread.sleep(3000);
    	comboselect(combo_nom_code, combo_nom_code_0);
    	
    	Thread.sleep(2000);
    }    
    
    public void checkerrormessage() {
    	
    	System.out.println("Error message displayed");
    }
    
    public void selectokfromerror() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("#errorDialogDismissButton > span")).click();
    	Thread.sleep(3000);
    	
    }    

    public void entermissinginformation(String qty, String amount) throws InterruptedException {

    	txt_quantity_0.click();
    	Thread.sleep(3000);
    	txt_quantity_0.sendKeys(qty);
    	Thread.sleep(1000);
    	txt_unit_0.click();
    	Thread.sleep(3000);
    	txt_unit_0.sendKeys(amount);
    	Thread.sleep(2000);
    	txt_unit_0.sendKeys(Keys.TAB);
    	Thread.sleep(1000);
    	
    }        
    
	   public void comboselect(WebElement comboclick, WebElement combovalue) throws InterruptedException {

		    
			Actions builder = new Actions(driver);
			builder.moveToElement(comboclick).clickAndHold().perform();
			Thread.sleep(3000);
			
		      Actions builder1 = new Actions(driver);
		      builder1.moveToElement(combo_scroll).release().perform();	 
		      Thread.sleep(3000);			
			
		      combovalue.click();
		      Thread.sleep(3000);	

		   
	   }    
	   
	   public void createsales() throws InterruptedException {
		   
		   proj_create.click();
		     System.out.println("Sales invoice created");	      
	    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	   	     driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);  	
		   Thread.sleep(2000);
	   }

	   public void submitsales() throws InterruptedException {
		   
		     Thread.sleep(3000);
		     proj_submit.click();
		     System.out.println("Sales invoice submitted");	      
	    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	   	     driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);  	
		   
	   }
	   
	   public HomePage returnhomepage() throws InterruptedException {
		   
		   Thread.sleep(3000);
		   System.out.println("Return to HomePage");
		   deletecookies();
		   driver.findElement(By.cssSelector("a .image-wrap__image")).click();
		   return new HomePage();
	   }
    
	  
	   @SuppressWarnings("deprecation")
	public String getcurrentdate() {
		   String datevalue;
		   Date date = new Date();
		   date.setDate(date.getDate()+10);
		   		   
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		   return datevalue= formatter.format(date);
		   
	   }

}
