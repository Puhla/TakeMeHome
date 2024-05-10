package com.takemehome.tests;

import com.takemehome.pages.CreateAccountPage;
import com.takemehome.pages.HomePage;
import com.takemehome.pages.NavigatePanel;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

@BeforeMethod
public void precondition(){
	new NavigatePanel (driver).selectSignUpLink();
}
@Test
public void createYourAccountTest(){
	new CreateAccountPage (driver)
			.enterPersonalData ("Vera Verova","Vera","vera_1tr@gmail.com","Vera12367#");
			
			
			
	
}

}
