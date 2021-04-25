package step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.WrapperClass;
import base.WrapperClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SAL2Step extends WrapperClass2{

	@Given("Click App Launcher")
	public void click_app_launcher() {
		getDriver().findElementByXPath("//div[@class='slds-icon-waffle']").click();
	}
	@Given("Click View All")
	public void click_view_all() {
		getDriver().findElementByXPath("//button[text()='View All']").click();
	}
	@Then("App Launcher should open")
	public void app_launcher_should_open() {
		waitForIt("xpath","//h2[text()='App Launcher']");
	}
	@Given("Click Opputunities")
	public void click_opputunities() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Opportunities']"));
	}
	@Then("Oppurtunities Page should open")
	public void oppurtunities_page_should_open() {
		waitForIt("xpath","//div[@data-aura-class='forceListViewManagerHeader']//*[@class='slds-var-p-right_x-small uiOutputText forceBreadCrumbItem' and text()='Opportunities']");
	}
	@Given("Click New Oppurtunity")
	public void click_new_oppurtunity() {
		getDriver().findElementByXPath("//div[@title='New']").click();
	}
	@Then("New Oppurtunity Page should pop up")
	public void new_oppurtunity_page_should_pop_up() {
		waitForIt("xpath","//div[@class='slds-modal__header']/*[text()='New Opportunity']");
	}
	@Given("Enter Opputunity Name as {string}")
	public void enter_opputunity_name_as(String name) {
		getDriver().findElementByXPath("//input[@name='Name']").sendKeys(name);
	}
	@Given("Enter Oppurtunity Close Date")
	public void enter_oppurtunity_close_date() {
		getDriver().findElementByXPath("//label[text()='Close Date']/following::input[@type='text' and @name='CloseDate']").click();
		javaScriptClick(getDriver().findElementByXPath("//button[text()='Today']"));
	}
	@Given("Enter Oppurtunity Stage")
	public void enter_oppurtunity_stage() {
		javaScriptClick(getDriver().findElementByXPath("//label[text()='Stage']/following::input[@role='combobox' and @required='']"));
		getDriver().findElementByXPath("//span[@title='Needs Analysis']").click();
	}
	@Given("Click Save button in NewOppurtunity")
	public void click_save_button_in_new_oppurtunity() {
		getDriver().findElementByXPath("//button[text()='Save']").click();
	}
	@Then("New Oppurtunity should have created with as {string}")
	public void new_oppurtunity_should_have_created(String name) {
		waitForIt("xpath","//div[@class='entityNameTitle slds-line-height--reset']");
		getAs().assertTrue(getDriver().findElementByXPath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//*[text()='"+name+"']").isDisplayed());
	}
	

	
}
