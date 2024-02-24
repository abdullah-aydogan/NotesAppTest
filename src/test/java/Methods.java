import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Methods extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void checkElement(By locator) {

        try {
            WebDriverWait element = new WebDriverWait(appiumDriver, 10);
            element.until(ExpectedConditions.visibilityOfElementLocated(locator));
            logger.info(locator + " elementi bulundu.");
        }

        catch (Exception e) {
            Assert.fail(locator + " elementini bulmak için 10 saniye beklendi ama element bulunamadı.");
        }
    }

    public void clickElement(By locator) {

        checkElement(locator);
        appiumDriver.findElement(locator).click();
        logger.info("Bulunan elemente tıklandı.");
    }

    public void checkPage(By locator, String pageName) {

        checkElement(locator);
        boolean openPage = appiumDriver.findElement(locator).isDisplayed();

        if(openPage) {
            logger.info(pageName + " sayfası açıldı.");
        }

        else {
            Assert.fail(pageName + " sayfası açılamadı.");
        }
    }

    public void enterText(By locator, String value) {

        checkElement(locator);
        appiumDriver.findElement(locator).sendKeys(value);
        logger.info("Bulunan elemente " + value + " değeri girildi.");
    }

    public void checkDateTime(By locator) {

        checkElement(locator);
        String getDate = appiumDriver.findElement(locator).getText();

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE", new Locale("tr"));
        String formattedTime = localDate.format(formatter);

        if(formattedTime.equals(getDate)) {
            logger.info("Elementin text değeri, " + getDate + " değerini içeriyor.");
        }

        else {
            Assert.fail("Elementin text değeri, " + getDate + " değerini içermiyor.");
        }
    }
}