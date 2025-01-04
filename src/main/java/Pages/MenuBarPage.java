package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MenuBarPage {
    //setupDriverAndBrowser
    Page page;

    //Locators
    private String signupButton = "a#signin2";
    private String loginButton = "a#login2";
    private String cartButton = "a#cartur";
    private String logoutButton = "#logout2";

    //Contractor
    public MenuBarPage(Page page){
        this.page=page;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public MenuBarPage clickOnSignupButtonToRegister(){
        page.click(signupButton);
        return this;
    }

    public MenuBarPage clickOnloginButton(){
        page.click(loginButton);
        return this;
    }

    public MenuBarPage clickOnCartButtonToCheckout(){
        page.click(cartButton);
        return this;
    }

    public MenuBarPage clickOnLogoutButton(){
        page.click(logoutButton);
        return this;
    }
}
