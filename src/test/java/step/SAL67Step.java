package step;

import org.openqa.selenium.Keys;

import base.WrapperClass;
import base.WrapperClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SAL67Step extends WrapperClass2{

	public String getName;
	
	@Given("Click on Service Territories")
	public void click_on_service_territories() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Service Territories']"));
	}

	@Then("Service Territories Page should open")
	public void service_territories_page_should_open() {
	    waitForIt("xpath", "//li//*[text()='Service Territories']");
	}

	@Given("Under Service Territories on Left Corner Click the Dropdown Option")
	public void under_service_territories_on_left_corner_click_the_dropdown_option() {
	   
	   elementClick("xpath", "//a[@title='Select List View']//*[@focusable='false']");
	}

	@Given("Select All ServiceTerritories")
	public void select_all_service_territories() {
		
		elementClick("xpath", "//li[@role='presentation']//*[text()='All Service Territories']");
	   //javaScriptClick(locateElement("xpath", "//li[@role='presentation']//*[text()='All Service Territories']"));
	}

	@Then("All ServiceTerritories should get Load")
	public void all_service_territories_should_get_load() throws InterruptedException {
	    Thread.sleep(2000);
	}

	@Given("Select The Newly created Service territory")
	public void select_the_newly_created_service_territory() throws InterruptedException {
	   elementClick("xpath", "//*[text()='Last Modified Date']/parent::a[@class='toggle slds-th__action slds-text-link--reset ']");
	   Thread.sleep(2000);
	   getName = locateElement("xpath", "(//table[@role='grid']//th//a[@data-refid='recordId'])[1]").getText();
	}

	@Given("Click on the Dropdown Icon on right Corner")
	public void click_on_the_dropdown_icon_on_right_corner() {
	    elementClick("xpath", "(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']//lightning-primitive-icon)[1]");
	}

	@Given("Click on delete")
	public void click_on_delete() {
	   elementClick("xpath", "//a[@title='Delete']");
	}

	@Then("Delete Confirmation box opens up")
	public void delete_confirmation_box_opens_up() {
	    waitForIt("xpath", "//h2[text()='Delete Service Territory']");
	}

	@Given("Click on Delete on Confirmation box")
	public void click_on_delete_on_confirmation_box() throws InterruptedException {
	    elementClick("xpath", "//button[@title='Delete']");
	    Thread.sleep(2000);
	}

	@Then("Verify Whether the Service Territory is deleted Successfully")
	public void verify_whether_the_service_territory_is_deleted_successfully() throws InterruptedException {
	   getJs().executeScript("arguments[0].value='"+getName+"'", locateElement("xpath", "//input[@name='ServiceTerritory-search-input']"));
	   locateElement("xpath", "//input[@name='ServiceTerritory-search-input']").sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
	   getAs().assertTrue(locateElement("xpath", "//p[text()='No items to display.']").isDisplayed());
	   getAs().assertAll();
	}
	
}
