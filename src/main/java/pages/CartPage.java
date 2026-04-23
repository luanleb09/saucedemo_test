package pages;

import org.openqa.selenium.*;

public class CartPage {
    WebDriver driver;

    By items = By.className("cart_item");
    By checkout = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int countItems() {
        return driver.findElements(items).size();
    }

    public void checkout() {
        driver.findElement(checkout).click();
    }
}
