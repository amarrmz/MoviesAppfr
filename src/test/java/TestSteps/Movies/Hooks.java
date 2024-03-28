package TestSteps.Movies;

import TestUtils.TakeScreenshot;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class Hooks {
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "amar");
        capabilities.setCapability("udid", "KELQY19528040354");
        capabilities.setCapability("platformname", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformversion", "8");
        capabilities.setCapability("appium:newCommandTimeout", 60);
        capabilities.setCapability("app", "C:\\Users\\hp\\Desktop\\testMoviesApp\\MoviesApp\\src\\app\\TheMovies.apk");
        URL url = URI.create("http://127.0.0.1:4724/wd/hub").toURL();
        driver = new AndroidDriver(url, capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                TakeScreenshot.takeScreenshot(driver, scenario);
            } else {
                driver.quit();
            }


        }
    }

}