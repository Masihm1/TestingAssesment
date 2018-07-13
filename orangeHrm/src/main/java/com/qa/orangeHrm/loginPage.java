package com.qa.orangeHrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	private WebElement usernameBox;

	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	private WebElement passwordBox;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	private WebElement loginButton;

	public void Login(String Admin, String AdminAdmin) {

		usernameBox.sendKeys("Admin");

		passwordBox.sendKeys("AdminAdmin");

		loginButton.click();

	}
}
