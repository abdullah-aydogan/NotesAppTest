import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static AppiumDriver appiumDriver;

    @Before
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appPackage", "tr.abdullah.notes");
        capabilities.setCapability("appActivity", "tr.abdullah.notes.LoginActivity");
        capabilities.setCapability("platformName", "Android");

        appiumDriver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void closeDriver() {

        if(appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}