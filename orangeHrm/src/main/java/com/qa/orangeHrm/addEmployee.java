package com.qa.orangeHrm;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addEmployee {
	
	@FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	private WebElement addEmployeeTab;
	
	
	public void AddEmp() {

		addEmployeeTab.click();

	}
	

	

}
