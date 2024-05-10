package com.takemehome.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreateAccountPage extends BasePage{
public CreateAccountPage (WebDriver driver) {
	super (driver);
}
@FindBy(id="fullName")
WebElement userFullName;
@FindBy(id = "userName")
WebElement userName;

@FindBy(id = "password")
WebElement userPassword;

@FindBy(id = "email")
WebElement userEmail;

@FindBy(id = "checkBox")
WebElement privetPolice;
@FindBy(id = "buttonCreate")
WebElement buttonCreate;
public CreateAccountPage enterPersonalData(String fullName, String nick, String email, String password) {
	type (userFullName, fullName);
	type (userName, nick);
	type (userPassword, password);
	type (userEmail, email);
	return this;
}
public CreateAccountPage clickOnCheckBoxPrivetPolice(){
	click (privetPolice);
	return this;
}
public CreateAccountPage clickOnCreateButton(){
	click (buttonCreate);
	return this;
}
@FindBy(id = "example-modal-sizes-title-lg")
WebElement successTitle;
//public CreateAccountPage verifySuccessMyCabinet(String title){
//}
}
