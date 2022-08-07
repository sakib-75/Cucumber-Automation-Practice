package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCodePage extends BasePage {

    public PromoCodePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(className = "promoCode")
    WebElement promoCodeInp;

    @FindBy(className = "promoBtn")
    WebElement promoCodeApply;

    @FindBy(css = "span.promoInfo")
    WebElement promoInfo;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderBtn;

    public String right_promo_code = "rahulshettyacademy";
    public String empty_promo_message = "Empty code ..!";
    public String wrong_promo_message = "Invalid code ..!";
    public String right_promo_message = "Code applied ..!";

    public void set_promo_code(String code) {
        sendText(promoCodeInp, code);
        promoCodeApply.click();
        System.out.println("Entered promo code: " + code);
    }

    public String get_promo_message() {
        System.out.println("Promo code message: " + promoInfo.getText());
        return promoInfo.getText();
    }

}
