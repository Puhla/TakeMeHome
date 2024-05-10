package com.takemehome.tests;

import com.takemehome.pages.CreateAccountPage;
import com.takemehome.pages.HomePage;
import com.takemehome.pages.NavigatePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

@BeforeMethod
public void precondition(){
	new HomePage (driver).getNavigatePanel();
	new NavigatePanel (driver).selectSignUpLink();

}
@Test
public void signUpLink(){
new CreateAccountPage (driver);
	//verifySuccessTitle("Create your account")
}
}
