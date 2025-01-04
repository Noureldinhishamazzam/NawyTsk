package TestCase;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.MenuBarPage;
import Pages.ProductPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FourthScenario {
    Browser browser;
    Playwright driver;
    Page page;
    String url = "https://www.demoblaze.com/index.html";

    @Test
    public void fourthScenario(){
        new HomePage(page)
                .navigateToUrl(url)
                .clickOnNextButtonToGetTargetProduct()
                .clickOnProduct();
        new ProductPage(page)
                .clickOnAddToCartButtonToPurchaseTheTargetProduct();
        new MenuBarPage(page)
                .clickOnCartButtonToCheckout();
        new CheckoutPage(page)
                .clickOnPlaceOrderButtonToCompleteTheOrder()
                .EnterItsInformationToCompleteTheorder("Nour","egy","cai","1234567","3","1998")
                .clickOnPurchaseButtonToConfirmTheOrder()
                .clickOnOkButton();
    }

    @BeforeClass
    public void setupBrowser(){
        driver = Playwright.create();
        browser = driver.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterClass
    public void tearDown(){
        browser.close();
    }
}
