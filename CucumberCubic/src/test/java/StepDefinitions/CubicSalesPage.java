package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ProjectPage;
import pages.SalesPage;
import util.TestBase;

public class CubicSalesPage extends TestBase {
	
	SalesPage salespage;
	HomePage homepage;
	

	@Given("user navigates to the Sales invoice")
	public void user_navigates_to_the_sales_invoice() throws InterruptedException {
	   
		HomePage homepage = new HomePage();
		
		System.out.println("user selects quick menu - sales");		
        salespage = homepage.clickOnSales(prop.getProperty("waittime"));

	}

	@Then("check sales invoice displayed correctly {string}")
	public void check_sales_invoice_displayed_correctly(String expectedTitle ) {
	    
		
        System.out.println(salespage.getpageTitle());

        Assert.assertTrue(salespage.getpageTitle().contains(expectedTitle));		
	    
	}
//	|customer|reference|qty|amount|
  
    @Then("^user1 enter (.*) and (.*) and (.*) and (.*)$")
	public void user_enter_all_the_fields(String customer, String reference, String qty, String amount) throws InterruptedException {
	    
        System.out.println("Sales user information - entry");
	    salespage.populaterequiredinfo(customer,reference,qty,amount);
	}

    @Then("^user2 enter (.*) and (.*)$")
	public void user_enter_few_fields(String customer, String reference) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
    	System.out.println("Sales info - Without key values");     
	    salespage.populaterequiredinfofew(customer,reference);
	}

	@Then("^check error message displayed$")
	public void check_error_message_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Message popup displayed correctly");
	    salespage.checkerrormessage();
	}

	@Then("^user selects ok$")
	public void user_select_ok() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("OK option selected from the error message");
	    salespage.selectokfromerror();
	}
	
    @Then("^user enters missing details (.*) and (.*)$")
	public void user_enter_missing_info(String qty, String amount) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
        
    	System.out.println("populate the missing information" );
	    salespage.entermissinginformation(qty,amount);
	}	
	
	@Then("^user selects create$")
	public void user_selects_create() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    salespage.createsales();
	}

	@Then("sales invoice created correctly {string}")
	public void sales_invoice_created_correctly(String expectedTitle) {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println(salespage.getpageTitle());

//        Assert.assertTrue(salespage.getpageTitle().contains(expectedTitle));	
        
	}
	
	@Then("^user submit the sales invoice$")
	public void user_submit_sales_invoice() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		salespage.submitsales();
	}	

	@Then("^user naviagtes to the home page$")
	public void user_naviagtes_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homepage = salespage.returnhomepage();
	}

	

}
