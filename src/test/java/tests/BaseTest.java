package tests;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTest {

    WebDriver driver;

    Logger logger = LogManager.getLogger(BaseTest.class);

    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";

// ###################### SetUp and TearDown Methods #########################

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
        logger.info("Opening the web page " + url);
    }

    @AfterMethod
    public void tearDow(){
        driver.quit();
        logger.info("Closing the browser");
    }

// ###################### Reusable Methods #########################
    public void textExists(String text){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        saveScreenshot();
        Assert.assertTrue(driver.getPageSource().toLowerCase().contains(text.toLowerCase()));
    }

    public void saveScreenshot(){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = new SimpleDateFormat("MMddyy-Hms'.png'").format(new Date());
        try {
            FileUtils.copyFile(screenshot, new File("./evidence/" + fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
