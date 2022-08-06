package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(css = "h4.product-name")
    List<WebElement> allProductTitle;

    @FindBy(xpath = "//div[@class='product-action']")
    List<WebElement> allAddToCart;

    @FindBy(xpath = "//a[@class='cart-icon']")
    WebElement cartIcon;

    @FindBy(xpath = "//div[@class='cart-preview active']//p[@class='product-name']")
    List<WebElement> cartProductsTitle;

    @FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
    WebElement checkoutBtn;

    public void add_to_cart(List<String> products_name) {
        int count = 0;
        for (int i = 0; i < allProductTitle.size(); i++) {
            String[] productTitle = allProductTitle.get(i).getText().split("-");
            String productName = productTitle[0].trim();

            if (products_name.contains(productName)) {
                allAddToCart.get(i).click();
                System.out.println(productName + " added to cart");
                count++;
                if (count == products_name.size()) {
                    break;
                }
            }
        }
        System.out.println("Total product in cart: " + count);
    }

    public boolean is_products_in_cart(List<String> products_name) {
        boolean condition = false;
        List<String> added_products = new ArrayList<>();

        for (WebElement product_title : cartProductsTitle) {
            String product_name = product_title.getText().split("-")[0].trim();
            added_products.add(product_name);
            condition = products_name.contains(product_name);
        }
        System.out.println("Selected products: " + products_name);
        System.out.println("Added products in cart: " + added_products);
        return condition;
    }

    public void click_on_cart_icon() {
        cartIcon.click();
    }

    public void click_on_checkout_btn() {
        checkoutBtn.click();
    }

}
