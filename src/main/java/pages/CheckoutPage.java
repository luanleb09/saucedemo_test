package pages;

import org.openqa.selenium.*;
import utils.ConfigReader;

public class CheckoutPage {
    WebDriver driver;

    By firstNameField = By.id("first-name");
    By lastNameField  = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueBtn    = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInfo() {
        driver.findElement(firstNameField).sendKeys(ConfigReader.get("first.name"));
        driver.findElement(lastNameField).sendKeys(ConfigReader.get("last.name"));
        driver.findElement(postalCodeField).sendKeys(ConfigReader.get("postal.code"));
    }

    public void continueStep() {
        driver.findElement(continueBtn).click();
    }
}