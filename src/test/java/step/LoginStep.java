package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import base.WrapperClass;
import base.WrapperClass2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep extends WrapperClass2{
	
	@Given("Open browser")
	public void Open_browser() {
		launchBrowser();
	}
	
	@Given("Load SalesForce")
	public void load_sales_force_as() {
		getDriver().get("https://login.salesforce.com");
	}
	@Given("Enter UserName")
	public void enter_user_name_as() {
		getDriver().findElementById("username").sendKeys("mercury.bootcamp@testleaf.com");
	}
	@Given("Enter Password")
	public void enter_password_as() {
		getDriver().findElementById("password").sendKeys("Bootcamp$123");
	}
	@Given("Click Login Button")
	public void click_login_button() {
		getDriver().findElementById("Login").click();
	}
	@Then("Verify Home Page appeared")
	public void verify_home_page_appeared() throws InterruptedException {
		Thread.sleep(5000);
		getAs().assertTrue(driver.findElementByXPath("//h1/span[text()='Home']").getText().equals("Home"));
	}
}
