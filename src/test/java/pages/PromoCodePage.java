package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCodePage {

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

    public WebElement promoCodeInp() {
        return promoCodeInp;
    }

    public WebElement promoCodeApply() {
        return promoCodeApply;
    }

    public WebElement promoInfo() {
        return promoInfo;
    }

    public WebElement placeOrderBtn() {
        return placeOrderBtn;
    }

}
