package step;

import base.WrapperClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SAL64 extends WrapperClass2{

	@Given("Click on New in Service Territories Page")
	public void click_on_new_in_service_territories_page() {
	    javaScriptClick(locateElement("xpath", "//a[@class='forceActionLink']//*[text()='New']"));
	}
	@Given("Enter Your Name in the Name field in new ST Page")
	public void enter_your_name_in_the_name_field_in_new_st_page() {
	   locateElement("xpath", "(//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/following-sibling::input)[1]").sendKeys("Mahesh");
	}
	@Given("Click on Operating Hours and Choose the First option in new ST Page")
	public void click_on_operating_hours_and_choose_the_first_option_in_new_st_page() {
	   elementClick("xpath", "(//div[@class='autocompleteWrapper slds-grow']//input[@role='combobox'])[2]");
	   elementClick("xpath", "(//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption']//a)[1]");
	}
	@Given("Check Active Field in new ST Page")
	public void check_active_field_in_new_st_page() {
	   elementClick("xpath", "//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/following::input[@type='checkbox']");
	}
	@Given("Enter the City your residing in City Field in new ST Page")
	public void enter_the_city_your_residing_in_city_field_in_new_st_page() {
	   locateElement("xpath", "//input[@class='city compoundBorderBottom compoundBorderRight input' and @placeholder='City']").sendKeys("Chennai");
	}
	@Given("Enter the State your residing in State Field in new ST Page")
	public void enter_the_state_your_residing_in_state_field_in_new_st_page() {
	    locateElement("xpath", "//input[@class='state compoundBorderBottom input' and @placeholder='State/Province']").sendKeys("TamilNadu");
	}
	@Given("Enter the Country your residing in Country Field in new ST Page")
	public void enter_the_country_your_residing_in_country_field_in_new_st_page() {
	   locateElement("xpath", "//input[@class='country compoundBRRadius input' and @placeholder='Country']").sendKeys("India");
	}
	@Given("Enter your current Postal Zip Code  in new ST Page")
	public void enter_your_current_postal_zip_code_in_new_st_page() {
	    locateElement("xpath", "//input[@class='postalCode compoundBLRadius compoundBorderRight input' and @placeholder='Zip/Postal Code']").sendKeys("605602");
	}
	@Given("Click on Save in new ST Page")
	public void click_on_save_in_new_st_page() throws InterruptedException {
	    elementClick("xpath", "//div[@class='actionsContainer']//*[text()='Save']");
	    Thread.sleep(3000);
	}
	@Then("Verify Service Territory is created Successfully")
	public void verify_service_territory_is_created_successfully() {
	    getAs().assertTrue(locateElement("xpath", "//div[@class='slds-form-element slds-form-element_readonly slds-form-element_edit slds-grow slds-hint-parent override--slds-form-element']//*[text()='Mahesh']").isDisplayed());
	    getAs().assertAll();
	}
}
