package com.takemehome.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage() {
        super();
    }

    @FindBy(id = "fullName")
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
        sendKeysTextWithWaiter(userFullName, fullName);
        sendKeysTextWithWaiter(userName, nick);
        sendKeysTextWithWaiter(userPassword, password);
        sendKeysTextWithWaiter(userEmail, email);
        return this;
    }

    public CreateAccountPage clickOnCheckBoxPrivetPolice() {
        clickForElementWithWaiter(privetPolice);
        return this;
    }

    public CreateAccountPage clickOnCreateButton() {
        clickForElementWithWaiter(buttonCreate);
        return this;
    }
}
