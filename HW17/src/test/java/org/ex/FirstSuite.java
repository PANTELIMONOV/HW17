package org.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSuite extends BaseTest {
    @Test
    public void verifyTitleOnMainPage() {
        driver.get("https://www.selenium.dev/");
        String title = driver.getTitle();

        Assert.assertEquals(title, "Selenium");
    }

    @Test
    public void verifyUrlAfterRefresh() {
        driver.get("https://www.selenium.dev/");
        driver.navigate().refresh();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/");
    }
}
