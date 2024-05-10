package com.takemehome.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigatePanelPage extends BasePage {
    public NavigatePanelPage() {
        super();
    }
    @FindBy(css = ".nav")
    WebElement signUpLink;

    public CreateAccountPage selectSignUpLink() {
        clickForElementWithWaiter(signUpLink);
        return new CreateAccountPage();
    }
}

