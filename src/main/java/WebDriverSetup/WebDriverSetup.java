package WebDriverSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSetup {

    protected WebDriver driver;
    private static WebDriverSetup instance;

    public WebDriver setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriverSetup getInstance() {
        if (instance == null)
            instance = new WebDriverSetup();
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
