package pages;

import org.openqa.selenium.*;

public class CheckoutOverviewPage {
    WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public int countItems() {
        return driver.findElements(By.className("cart_item")).size();
    }

    public void finish() {
        driver.findElement(By.id("finish")).click();
    }

    public String getMessage() {
        return driver.findElement(By.className("complete-header")).getText();
    }
}
