package TestCase;

import Pages.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PurchaseProductEndToEndScenario {
    Browser browser;
    Playwright playwright;
    Page page;
    String url = "https://www.demoblaze.com/index.html";

    @Test
    public void purchaseProductTestCase() {
        new HomePage(page)
                .navigateToUrl(url);
        new MenuBarPage(page)
                .clickOnSignupButtonToRegister();
    new SignUpForm(page)
            .enterDataInSignupForm("validEndToEndScenario","validPassword")
            .submitTheSignupFormToRegister();
    new MenuBarPage(page)
            .clickOnloginButton();
    new LoginForm(page)
            .enterDataInLoginForm("validEndToEndScenario","validPassword")
            .clickOnLoginFormButton();
        new MenuBarPage(page)
                .clickOnLogoutButton();
    new HomePage(page)
            .clickOnNextButtonToGetTargetProduct();
    new ProductPage(page)
            .clickOnAddToCartButtonToPurchaseTheTargetProduct();
    new MenuBarPage(page).
            clickOnCartButtonToCheckout();
    new CheckoutPage(page)
            .clickOnPlaceOrderButtonToCompleteTheOrder()
            .EnterItsInformationToCompleteTheorder("Nour","egy","cai","1234567","3","1998")
            .clickOnPurchaseButtonToConfirmTheOrder()
            .clickOnOkButton();
    }

    @BeforeClass
    public void setupBrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterClass
    public void tearDown(){
        browser.close();
    }
}