package org.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondSuite extends BaseTest {
    String url = "https://www.selenium.dev/";

    @Test
    public void verifyTitleOnDocumentationPage() {
        driver.get(url + "documentation/");
        String title = driver.getTitle();

        Assert.assertEquals(title, "The Selenium Browser Automation Project | Selenium");
    }

    @Test
    public void verifyTitleAndUrlAfterBackOnMainPage() {
        driver.get(url);
        driver.get(url + "documentation/");
        driver.navigate().back();
        String title = driver.getTitle();

        Assert.assertEquals(title, "Selenium");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/");
    }
}
