package pages;

import org.openqa.selenium.*;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInfo() {
        driver.findElement(By.id("first-name")).sendKeys("Luan");
        driver.findElement(By.id("last-name")).sendKeys("Le");
        driver.findElement(By.id("postal-code")).sendKeys("700000");
    }

    public void continueStep() {
        driver.findElement(By.id("continue")).click();
    }
}
