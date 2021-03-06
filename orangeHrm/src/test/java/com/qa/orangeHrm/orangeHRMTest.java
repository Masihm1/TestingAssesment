package com.qa.orangeHrm;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeHRMTest {

	WebElement element;
	WebDriver driver;
	String webURL;
	String singedinURL;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("^the login page$")
	public void the_login_page() {

		driver.get(constant.webURL);
		//assertTrue(webURL.equals(driver.getCurrentUrl()));

	}

	@When("^I login$")
	public void i_login() {

		driver.get(constant.webURL);
		loginPage page2 = PageFactory.initElements(driver, loginPage.class);
		page2.Login("Admin", "AdminAdmin");
		//assertTrue(singedinURL.equals(driver.getCurrentUrl()));

	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() {

		driver.get(constant.singedinURL);
		loggedIn page3 = PageFactory.initElements(driver, loggedIn.class);
		page3.LoggedIn();

	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() {

		driver.get(constant.singedinURL);
		addEmployee page4 = PageFactory.initElements(driver, addEmployee.class);
		page4.AddEmp();

	}

	@When("^I fill out the Employee Details correctly$")
	public void i_fill_out_the_Employee_Details_correctly() {

		driver.get(constant.singedinURL);
		employeeDetails page5 = PageFactory.initElements(driver, employeeDetails.class);
		page5.AddEmpDetails("Marcus", "Martin", "Masih", "Unknown", "A");

	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
