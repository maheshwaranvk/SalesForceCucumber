package step;

import org.openqa.selenium.Keys;

import base.WrapperClass2;
import io.cucumber.java.en.*;

public class FileStep extends WrapperClass2{

	@Given("Click Service Console from App Launcher")
	public void click_service_console_from_app_launcher() throws InterruptedException {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Service Console']"));
		Thread.sleep(5000);
	}

	@Given("Select Files from the DropDown")
	public void select_files_from_the_drop_down() throws InterruptedException {
	    javaScriptClick(locateElement("xpath", "//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']"));
	    elementClick("xpath", "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Files']");
	    Thread.sleep(2000);
	}

	@Given("Click on the latest modified item link")
	public void click_on_the_latest_modified_item_link() throws InterruptedException {
	   elementClick("xpath", "//span[@title='Last Modified Date']/parent::a");
	   Thread.sleep(2000);
	}

	@Given("Click on Public link")
	public void click_on_public_link() throws InterruptedException {
	   elementClick("xpath", "(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]");
	   elementClick("xpath", "//div[@title='Public Link']//parent::a");
	   waitForIt("xpath", "//h2[text()='Public Link Sharing']");
	}

	@Then("Verify the new link text field is disabled to create public link")
	public void verify_the_new_link_text_field_is_disabled_to_create_public_link() {
	   waitForIt("xpath", "//h2[@class='title slds-text-heading--medium slds-hyphenate']");
	   getAs().assertTrue(locateElement("xpath", "//input[@disabled='']").isDisplayed());
	   getAs().assertAll();
	   
	  elementClick("xpath", "//h2[@class='title slds-text-heading--medium slds-hyphenate']");
	  elementClick("xpath", "//button[@class='slds-button slds-button_icon slds-modal__close closeIcon slds-button_icon-bare slds-button_icon-inverse']");
	   
	}

	@Given("Download the file into a specified folder inside the project")
	public void download_the_file_into_a_specified_folder_inside_the_project() throws InterruptedException {
		elementClick("xpath", "(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]");
		elementClick("xpath", "//div[@title='Download']/parent::a");
		Thread.sleep(3000);
	}

	@Given("Click on Share")
	public void click_on_share() {
		elementClick("xpath", "(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]");
		elementClick("xpath", "//div[@title='Share']/parent::a");
		waitForIt("xpath", "//h2[@class='title slds-text-heading--medium slds-hyphenate']");
	}

	@Given("Click on search user and select the Derrick Dsouza")
	public void click_on_search_user_and_select_the_derrick_dsouza() {
	    elementClick("xpath", "//input[@class=' default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']");
	    elementClick("xpath", "(//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption']//a)[1]");
	    
	}

	@Given("Verify the Error message {string}")
	public void verify_the_error_message(String string) {
		getAs().assertTrue(locateElement("xpath", "//li[@class='form-element__help']").isDisplayed());
		getAs().assertAll();
		elementClick("xpath", "//button[@class='slds-button slds-button--icon-inverse slds-modal__close uiButton--modal-closeBtn uiButton']//*[@data-key='close']");
	}

	@Given("Click on Upload Files and browse a file from your local")
	public void click_on_upload_files_and_browse_a_file_from_your_local() {
	   javaScriptClick(locateElement("xpath", "//div[@title='Upload Files']"));
	}

	@Given("Click on DrowDown for the newly uploaded file and select View File Details")
	public void click_on_drow_down_for_the_newly_uploaded_file_and_select_view_file_details() {
	   
	}

	@Then("Verify the file name and extension of the newly uploaded file")
	public void verify_the_file_name_and_extension_of_the_newly_uploaded_file() {
	   
	}

	@Then("Close the file window tab")
	public void close_the_file_window_tab() {
	    
	}

	@Then("Click on DropDown for the newly uploaded file and select Delete")
	public void click_on_drop_down_for_the_newly_uploaded_file_and_select_delete() {
	   
	}

	@Then("Confirm Delete")
	public void confirm_delete() {
	  
	}

	@Then("Verify the success message displayed for the delete")
	public void verify_the_success_message_displayed_for_the_delete() {
	   
	}
	
}
