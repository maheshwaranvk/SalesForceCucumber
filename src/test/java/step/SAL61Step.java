package step;

import base.WrapperClass2;
import io.cucumber.java.en.*;

public class SAL61Step extends WrapperClass2{
	
	@Given("Click on the sliding icon until See System Status is displayed")
	public void click_on_the_sliding_icon_until_see_system_status_is_displayed() {
	   while (locateElement("xpath", "//span[text()='See System Status']").isEnabled()==false) {
		   elementClick("xpath", "//button[@class='slds-button slds-button--neutral rightArrowButton uiButton']");
	}
	   elementClick("xpath", "//span[text()='See System Status']");
	}
	@Given("Click on Get Started link")
	public void click_on_get_started_link() {
	   
	}
	@Given("Navigate to SalesForce Trust new Window")
	public void navigate_to_sales_force_trust_new_window() {
	   
	}
	@Given("Select Trust Compliance from the dropdown")
	public void select_trust_compliance_from_the_dropdown() {
	    
	}
	@Then("Click on Show Filters")
	public void click_on_show_filters() {
	   
	}
	@Given("Select Nonprofit under INDUSTRIES")
	public void select_nonprofit_under_industries() {
	   
	}
	@Then("Verify the {int} Certificates that are Nonprofit only should be displayed\"")
	public void verify_the_certificates_that_are_nonprofit_only_should_be_displayed(Integer int1) {
	    
	}
	
}
