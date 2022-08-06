package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PlaceOrderSteps {

    HomePage home = new HomePage();
    List<String> products = new ArrayList<>();

    @Given("user is on home page")
    public void home_page() {

    }

    @When("add few products to cart")
    public void add_product_to_cart() throws InterruptedException {

        products.add("Carrot");
        products.add("Brocolli");
        products.add("Cucumber");
        home.add_to_cart(products);
        Thread.sleep(3000);
    }

    @Then("verify selected product added to cart")
    public void verify_selected_product() throws InterruptedException {
        home.click_on_cart_icon();
        Thread.sleep(3000);
        Assert.assertTrue(home.is_products_in_cart(products));
    }

}
