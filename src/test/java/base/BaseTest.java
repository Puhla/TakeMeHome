package base;

import WebDriverSetup.WebDriverSetup;
import com.takemehome.pages.*;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends WebDriverSetup {

    protected CreateAccountPage createAccountPage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyCabinetPage myCabinetPage;
    protected NavigatePanelPage navigatePanelPage;
    protected PetCardPage petCardPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getInstance().setupDriver();
        createAccountPage = new CreateAccountPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myCabinetPage = new MyCabinetPage();
        navigatePanelPage = new NavigatePanelPage();
        petCardPage = new PetCardPage();
    }

    //  @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
