package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginSuccess() {
        LoginPage login = new LoginPage(driver);

        login.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );

        // Verify login success (URL hoặc element)
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}