package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {

    public PlaceOrderPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "(//select)[1]")
    WebElement countrySelect;

    @FindBy(className = "chkAgree")
    WebElement checkAgree;

    @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceedBtn;

    public WebElement countrySelect() {
        return countrySelect;
    }

    public WebElement checkAgree() {
        return checkAgree;
    }

    public WebElement proceedBtn() {
        return proceedBtn;
    }

}
