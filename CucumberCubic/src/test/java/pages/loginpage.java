package pages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class loginpage extends TestBase{

	@FindBy(xpath = "//button[@title='Log in using your Microsoft Account account']" )
	WebElement cmd_login_type;
	
	@FindBy(name = "loginfmt" )
	WebElement txt_login;
	
	@FindBy(id = "idSIButton9" )
	WebElement cmd_next;

	@FindBy(id = "//span[@class='main-heading__page']" )
	WebElement main_heading;
	
	
	
	@FindBy(xpath = "//input[@id='i0118']" )
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@id='idSIButton9']" )
	WebElement cmd_next1;

	
	@FindBy(id = "acceptButton" )
	WebElement cmd_accept;
	
	@FindBy(id = "todoButton" )
	WebElement lbl_select;	

    
    public loginpage() {
    	
    	PageFactory.initElements(driver, this);    	
    }
    
    public HomePage clickLoginoption(String username, String password) throws InterruptedException {
    	
    	cmd_login_type.click();
    	Thread.sleep(2000);    	
    	txt_login.sendKeys(username);
    	Thread.sleep(2000);
    	cmd_next.click();
    	Thread.sleep(2000);
    	txt_password.sendKeys(password);
    	Thread.sleep(2000);
    	cmd_next1.click();
    	Thread.sleep(2000);
    	cmd_accept.click();
    	Thread.sleep(2000);

    	return new HomePage();

    }
    


    
    
}
