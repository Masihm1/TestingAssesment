package com.qa.orangeHrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class employeeDetails {

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "middleName")
	private WebElement middleName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "employeeId")
	private WebElement employeeID;

	@FindBy(id = "materialize-lean-overlay-1")
	private WebElement location;

	@FindBy(id = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement createloginDetails;

	public void AddEmpDetails(String Marcus, String Martin, String Masih, String Unknown, String A) {

		firstName.sendKeys("Marcus");
		firstName.click();

		middleName.sendKeys("Martin");
		middleName.click();

		lastName.sendKeys("Masih");
		lastName.click();

		employeeID.sendKeys("Unknown");
		employeeID.sendKeys();

		location.click();
		location.sendKeys("A");
		location.click();

		createloginDetails.click();

	}

}
