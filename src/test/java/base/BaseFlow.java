package base;

import pages.LoginPage;
import utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class BaseFlow {

    protected WebDriver driver;

    public BaseFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );
    }
}