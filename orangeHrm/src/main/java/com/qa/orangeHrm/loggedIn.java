package com.qa.orangeHrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loggedIn {

	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	private WebElement pimButton;

	public void LoggedIn() {

		pimButton.click();

	}
}
