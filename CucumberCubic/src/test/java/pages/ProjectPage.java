package 
pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBase;

public class ProjectPage extends TestBase {

//--------------------Project selection	
	
	@FindBy(id = "react-select-4-placeholder" )
	WebElement combo_projecttype;
	
	@FindBy(xpath = "//div[@class='css-bp8cua-ScrollManager']" )
	WebElement combo_select;
	
	@FindBy(xpath = "//span[normalize-space()='Create']" )	
	WebElement cmd_proj_create;
	
	@FindBy(id = "react-select-4-option-1" )	
	WebElement cmd_click_combo;	
	
	
	@FindBy(id = "react-select-4-option-0" )	
	WebElement cmd_click_combo_fee;	
	
	public ProjectPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProjectMainpage selectProject(String projecttype ) throws InterruptedException {
		  
		  System.out.println("Scenario :" + projecttype);
	      Actions builder = new Actions(driver);
	      builder.moveToElement(combo_projecttype).clickAndHold().perform();      
	      Thread.sleep(3000);           
	      Actions builder1 = new Actions(driver);
	      if (projecttype.contains("ADMIN")) 
	      {	    	  
		      builder1.moveToElement(combo_select).release().perform();	 
		      Thread.sleep(3000);
		      cmd_click_combo.click();
	      }
	      else
	      {
		      builder1.moveToElement(combo_select).release().perform();	 
		      Thread.sleep(3000);
		      cmd_click_combo_fee.click();	    	  
	    	  
	      }
	      
	      Thread.sleep(3000);
	      
	      System.out.println("in body");
	      cmd_proj_create.click();
//	      driver.findElement(By.cssSelector("button[type='submit'] span")).click();
	      System.out.println("Click");	      
    	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   	      driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);     	      
   	      return new ProjectMainpage(2000);

   	 
   	      
	}
	


}
