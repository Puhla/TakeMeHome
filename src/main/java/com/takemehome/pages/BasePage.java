package com.takemehome.pages;

import WebDriverSetup.WebDriverSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage() {
        this.driver = WebDriverSetup.getInstance().getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickForElementWithWaiter(WebElement element) {
        logger.debug("Waiting for an element {} to be clickable", element);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        element.click();
    }

    public boolean isElementDisplayedWithWaiter(WebElement element) {
        logger.debug("Waiting for an element {} to be visible", element);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public boolean isElementNotDisplayedWithWaiter(WebElement element) {
        logger.debug("Checking if element {} is not present on the page", element);
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    public String getTextWithWaiter(WebElement element) {
        logger.debug("Waiting for an element {} to be visible", element);
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.debug("Get text attribute for an element {}", element);
        return element.getText();
    }

    public void sendKeysTextWithWaiter(WebElement element, String text) {
        logger.debug("Waiting for an element {} to be visible", element);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
        logger.debug("Send text {} for element {}", text, element);
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
