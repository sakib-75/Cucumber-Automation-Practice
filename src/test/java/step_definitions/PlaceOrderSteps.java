package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.PromoCodePage;

import java.util.ArrayList;
import java.util.List;

import static utils.CommonMethods.*;

public class PlaceOrderSteps {

    HomePage home = new HomePage();
    List<String> products = new ArrayList<>();
    PromoCodePage promo_page = new PromoCodePage();
    String promo_code;

    @Given("user is on home page")
    public void home_page() {

    }

    @When("add few products to cart")
    public void add_product_to_cart() throws InterruptedException {

        products.add("Carrot");
        products.add("Brocolli");
        products.add("Cucumber");
        home.add_to_cart(products);
        Thread.sleep(2000);
    }

    @Then("verify selected product added to cart")
    public void verify_selected_product() throws InterruptedException {
        home.click_on_cart_icon();
        Assert.assertTrue(home.is_products_in_cart(products));
        Thread.sleep(2000);
    }

    @Given("user is on place order page")
    public void place_order_page() {
        home.click_on_checkout_btn();
    }

    @When("{} is added")
    public void add_promocode(String promoCode) throws InterruptedException {
        promo_code = promoCode;
        promo_page.set_promo_code(promo_code);
    }

    @Then("verify promo code alert message")
    public void verify_promo_code() {
        String expected_message, actual_message;
        actual_message = promo_page.get_promo_message();

        if (promo_code.length() == 0) {
            expected_message = promo_page.empty_promo_message;
            Assert.assertEquals(actual_message, expected_message);
        } else if (promo_code.equals(promo_page.right_promo_code)) {
            expected_message = promo_page.right_promo_message;
            Assert.assertEquals(actual_message, expected_message);
        } else {
            expected_message = promo_page.wrong_promo_message;
            Assert.assertEquals(actual_message, expected_message);
        }

    }

}
