package com.takemehome.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigatePanel extends BasePage{
public NavigatePanel (WebDriver driver) {
	super (driver);
	
}
@FindBy(css=".nav")
WebElement signUpLink;
public CreateAccountPage selectSignUpLink () {
	click (signUpLink);
	return new CreateAccountPage (driver);
}


}


