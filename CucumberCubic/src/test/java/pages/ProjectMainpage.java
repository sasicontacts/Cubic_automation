package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class ProjectMainpage extends TestBase {
	
	//----------------------- Project create	
	
	    @FindBy(id = "name" )
		WebElement txt_project_name;
		
		@FindBy(id = "desc" )
		WebElement txt_project_desc;
		
		@FindBy(id = "react-select-7-placeholder" )
		WebElement combo_projectoffice;		
		
		@FindBy(id = "react-select-7-option-0" )
		WebElement combo_projectoffice_0;

		@FindBy(xpath = "//span[@class='main-heading__page']" )
		WebElement lbl_title;		

		@FindBy(xpath = "//div[@class='css-bp8cua-ScrollManager']" )
		WebElement combo_scroll;
		
		@FindBy(id = "react-select-14-placeholder" )
		WebElement combo_projectstatus;	
		
		@FindBy(id = "react-select-14-option-1" )
		WebElement combo_projectstatus_1;		

		@FindBy(id = "react-select-15-placeholder" )
		WebElement combo_proj_section;	
		
		@FindBy(id = "react-select-15-option-1" )
		WebElement combo_proj_section_1;	
		
		@FindBy(id = "react-select-16-placeholder" )
		WebElement combo_fee_ws;	
		
		@FindBy(id = "react-select-16-option-1" )
		WebElement combo_fee_ws_1;	
		
		@FindBy(id = "react-select-10-placeholder" )
		WebElement combo_ws_template;	
		
		@FindBy(id = "react-select-10-option-0" )
		WebElement combo_ws_template_0;		
		
		@FindBy(id = "wststartDate" )
		WebElement ws_start_date;			
		
		@FindBy(id = "workstageTotalDuration" )
		WebElement ws_duration;		
		
		@FindBy(id = "react-select-11-placeholder" )
		WebElement combo_ws_duration;	
		
		@FindBy(id = "react-select-11-option-2" )
		WebElement combo_ws_duration_2;				
		
		@FindBy(id = "workstageProjectFee" )
		WebElement ws_fee;	
		
		@FindBy(id = "react-select-4-placeholder" )
		WebElement combo_open_bal;	
		
		@FindBy(id = "react-select-4-option-0" )
		WebElement combo_open_bal_0;			

		@FindBy(id = "react-select-12-placeholder" )
		WebElement combo_proj_dis;	
		
		@FindBy(id = "react-select-12-option-3" )
		WebElement combo_proj_dis_3;		
		
		@FindBy(id = "react-select-5-placeholder" )
		WebElement combo_business_entity;	
		
		@FindBy(id = "react-select-5-option-0" )
		WebElement combo_business_entity_0;		
		
		@FindBy(id = "react-select-6-placeholder" )
		WebElement combo_tax_inc;	
		
		@FindBy(id = "react-select-6-option-0" )
		WebElement combo_tax_inc_0;		

		@FindBy(id = "adl1undefined" )
		WebElement txt_address1;		

		@FindBy(id = "adl2undefined" )
		WebElement txt_address2;		
		

		
		@FindBy(id = "activeClient" )
		WebElement txt_active_client;	
		
		@FindBy(xpath = "//span[normalize-space()='Create']")
		WebElement proj_create;

		@FindBy(xpath = "//img[@alt='Selenium Testing [Pre Production]']")
		WebElement img_homepage;
		
		Integer g_wait_Time;
		
		
		@FindBy(id = "react-select-21-placeholder" )
		WebElement combo_fee_status;	
		
		@FindBy(id = "react-select-21-option-1" )
		WebElement combo_fee_status_1;				
		
	
		
		public ProjectMainpage(Integer waitTime) {
			
			PageFactory.initElements(driver, this);
			g_wait_Time = waitTime;
		}		
		
		//

	
		public HomePage createProject(String projectname) throws InterruptedException {
			
			System.out.println("Project Main Page");			
			int index = (int)(Math.random()*15027);
			txt_project_name.sendKeys(projectname+index);
			Thread.sleep(g_wait_Time);
			txt_project_desc.sendKeys("Test Automation");
			Thread.sleep(g_wait_Time);
			
			if (projectname.contains("Admin")) {
				
          		comboselect(combo_projectoffice, combo_projectoffice_0);  // Project office			
	     		comboselect(combo_projectstatus, combo_projectstatus_1); // Project Status			
				comboselect(combo_ws_template, combo_ws_template_0);  // WS template

				ws_start_date.sendKeys("22/05/24");
				ws_duration.click();
				Thread.sleep(g_wait_Time);
				ws_duration.sendKeys("25");			
				Thread.sleep(g_wait_Time);	
			    ws_fee.sendKeys("100");
			    Thread.sleep(g_wait_Time);
				
				comboselect(combo_open_bal, combo_open_bal_0);
				comboselect(combo_business_entity, combo_business_entity_0);

			}
			else 
			
			{
				comboselect(combo_projectoffice, combo_projectoffice_0);  // Project office
				comboselect(combo_fee_status, combo_fee_status_1); // Project Status	
				comboselect(combo_ws_template, combo_ws_template_0); // Project Discipline
				comboselect(combo_proj_dis, combo_proj_dis_3);  
				comboselect(combo_proj_section, combo_proj_section_1);  // project sector
				comboselect(combo_ws_duration, combo_ws_duration_2);
				
				txt_active_client.sendKeys("Sel");
				Thread.sleep(g_wait_Time);
				txt_active_client.sendKeys(Keys.ENTER);
				
				Thread.sleep(g_wait_Time);
                
				ws_start_date.sendKeys("22/05/24");
				ws_duration.click();
				Thread.sleep(g_wait_Time);
				ws_duration.sendKeys("25");			
				Thread.sleep(g_wait_Time);	
			    ws_fee.sendKeys("100");
			    Thread.sleep(g_wait_Time);
				
				comboselect(combo_open_bal, combo_open_bal_0);
				comboselect(combo_business_entity, combo_business_entity_0);
				txt_address1.sendKeys("Test1");
				txt_address2.sendKeys("Harrogate");
				
				comboselect(combo_fee_ws, combo_fee_ws_1);
				
			}
			
	
			proj_create.click();
			
		     System.out.println("Project created");	      
	    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	   	     driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);  	 
	   	  
   	    
//	   	   Thread.sleep(3000);   
	   	   System.out.println(lbl_title.getText()); 	     
	   	      
	   	   driver.findElement(By.cssSelector("a .image-wrap__image")).click();
	   	   
	   	   Thread.sleep(g_wait_Time);	   	   
   	   
	   	   Thread.sleep(g_wait_Time);
	   	   
	   	   driver.manage().deleteAllCookies();
	   	   
	   	   return new HomePage();
		
		}
		
		
		  public String getProjectpageTitle() {
	    	
	    	return driver.getTitle();
	    }		

		   public void comboselect(WebElement comboclick, WebElement combovalue) throws InterruptedException {

			    
				Actions builder = new Actions(driver);
				builder.moveToElement(comboclick).clickAndHold().perform();
				Thread.sleep(g_wait_Time);
				
			      Actions builder1 = new Actions(driver);
			      builder1.moveToElement(combo_scroll).release().perform();	 
			      Thread.sleep(g_wait_Time);			
				
			      combovalue.click();
			      Thread.sleep(g_wait_Time);	

			   
		   }
		
}
