package Pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CheckoutPage {
    //setupDriverAndBrowser
    Page page;

    //Locators
    private String placeOrderButton = "//button[text()='Place Order']";
    private String nameOfuser = "#name";
    private String countryOfuser = "#country";
    private String cityOfUser = "#city";
    private String creditCardOfUser = "#card";
    private String monthOfBirh = "#month";
    private String yearOfBirth = "#year";
    private String purchaseButton = "//button[text()='Purchase']";
    private String okButton = "//button[@tabindex='1']";
    private String exitButton = "//*[@id=\"exampleModal\"]/div/div/div[1]/button";

    //Contractor
    public CheckoutPage(Page page) {
        this.page = page;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public CheckoutPage clickOnPlaceOrderButtonToCompleteTheOrder(){
        page.click(placeOrderButton);
        return this;
    }

    public CheckoutPage EnterItsInformationToCompleteTheorder(String name, String country, String city, String creditCard, String month, String year){
        page.fill(nameOfuser,name);
        page.fill(countryOfuser,country);
        page.fill(cityOfUser,city);
        page.fill(creditCardOfUser,creditCard);
        page.fill(monthOfBirh,month);
        page.fill(yearOfBirth,year);
        return this;
    }

    public CheckoutPage clickOnPurchaseButtonToConfirmTheOrder(){
        page.click(purchaseButton);
        return this;
    }

    public CheckoutPage clickOnOkButton(){
        page.click(okButton);
        return this;
    }
}
