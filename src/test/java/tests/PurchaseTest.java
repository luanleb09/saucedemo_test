package tests;

import base.BaseFlow;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PurchaseTest extends BaseTest {

    @Test
    public void testPurchaseFlow() {

        BaseFlow flow = new BaseFlow(driver);

        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        CheckoutOverviewPage overview = new CheckoutOverviewPage(driver);

        // ✅ Reuse login
        flow.login();

        inventory.addProductsByCount(2);
        inventory.goToCart();

        Assert.assertEquals(cart.countItems(), 2);

        cart.checkout();
        checkout.fillInfo();
        checkout.continueStep();

        Assert.assertEquals(overview.countItems(), 2);

        overview.finish();
        Assert.assertEquals(
                overview.getMessage(),
                "Thank you for your order!"
        );
    }
}