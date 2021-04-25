package step;

import base.WrapperClass;
import base.WrapperClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SAL25Step extends WrapperClass2{

	@Given("Click Individuals")
	public void click_individuals() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Individuals']"));
	}
	@Then("Individuals Page should open")
	public void individuals_page_should_open() {
		waitForIt("xpath", "//div[@data-aura-class='forceListViewManagerHeader']//*[text()='Individuals' and @data-aura-class='uiOutputText forceBreadCrumbItem']");
	}
	@Given("Click New Individuals")
	public void click_new_individuals() {
		elementClick("xpath", "//div[@title='New']");
	}
	@Then("New Individuals Page should pop up")
	public void new_individuals_page_should_pop_up() {
		waitForIt("xpath", "//h2[text()='New Individual']");
	}
	@Given("Enter Solicitation as {string}")
	public void enter_solicitation_as(String sol) {
		elementClick("xpath", "(//span[text()='Salutation']/following::a[@class='select'])[1]");
		elementClick("xpath", "//a[@title='"+sol+".']");
	}
	@Given("Enter Individual First Name as {string}")
	public void enter_individual_first_name_as(String fName) {
		sendText("Xpath", "//input[@placeholder='First Name']", fName);
	}
	@Given("Enter Individual Last Name as {string}")
	public void enter_individual_last_name_as(String lName) {
		sendText("Xpath", "//input[@placeholder='Last Name']", lName);
	}
	@Given("Click Save button in Individual")
	public void click_save_button_in_individual() {
		elementClick("Xpath", "//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']");
	}
	@Then("New Individual should have created with as {string},{string},{string}")
	public void new_individual_should_have_created_with_as(String sol, String fName, String lName) {
		String text = locateElement("xpath", "(//div[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/*[@class='uiOutputText'])").getText();
		getAs().assertTrue(text.contains(sol));
		getAs().assertTrue(text.contains(fName));
		getAs().assertTrue(text.contains(lName));
		getAs().assertAll();
	}
	
}
