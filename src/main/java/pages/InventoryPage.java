package pages;

import org.openqa.selenium.*;
import java.util.List;

public class InventoryPage {
    WebDriver driver;

    By addBtns = By.xpath("//button[contains(text(),'Add to cart')]");
    By cart = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Thêm theo số lượng (lấy từ đầu danh sách)
    public void addProductsByCount(int count) {
        List<WebElement> items = driver.findElements(addBtns);

        if (count > items.size()) {
            throw new IllegalArgumentException(
                    "Requested " + count + " items, but only " + items.size() + " available."
            );
        }

        for (int i = 0; i < count; i++) {
            items.get(i).click();
        }
    }

    // Thêm theo tên item (khớp chính xác)
    public void addProductsByName(String... productNames) {
        for (String name : productNames) {
            By addBtnByName = By.xpath(
                    "//div[normalize-space(text())='" + name + "']" +
                            "/ancestor::div[contains(@class,'inventory_item')]" +
                            "//button[contains(text(),'Add to cart')]"
            );

            List<WebElement> matchedBtns = driver.findElements(addBtnByName);

            if (matchedBtns.isEmpty()) {
                throw new NoSuchElementException("Product not found: " + name);
            }

            matchedBtns.get(0).click();
        }
    }

    public void goToCart() {
        driver.findElement(cart).click();
    }
}