package com.takemehome.tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends BaseTest {
    @BeforeMethod
    public void precondition() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void test1() {

    }
}
