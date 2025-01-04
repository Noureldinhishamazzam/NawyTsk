package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ProductPage{
    //setupDriverAndBrowser
    Page page;

    //Locators
    private String addToCartButton = "//a[text()='Add to cart']";

    //Contractor
    public ProductPage(Page page) {
        this.page = page;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public ProductPage clickOnAddToCartButtonToPurchaseTheTargetProduct(){
        page.click(addToCartButton);
        return this;
    }

    public ProductPage clickOnPopupAlert() {
        page.onDialog(dialog -> {
            System.out.println();
            dialog.accept();
        });
        return this;
    }
}
