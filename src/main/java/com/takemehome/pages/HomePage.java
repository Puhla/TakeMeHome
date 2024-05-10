package com.takemehome.pages;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


public HomePage (WebDriver driver) {
	super (driver);
}

@FindBy(css=".nav.panel:nth-child(5)")
WebElement signUpLink;

public NavigatePanel getNavigatePanel () {
	return new NavigatePanel (driver);
}
}
