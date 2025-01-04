package Pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginForm {
    //setupDriverAndBrowser
    Page page;

    //Locators
    private String userNameLoginField = "#loginusername";
    private String passwordLoginField = "#loginpassword";
    private String LoginButtonForm = "//button[text()='Log in']";

    //Contractor
    public LoginForm(Page page) {
        this.page = page;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public LoginForm enterDataInLoginForm(String username,String password){
        page.fill(userNameLoginField,username);
        page.fill(passwordLoginField,password);
        return this;
    }

    public LoginForm clickOnLoginFormButton(){
        page.click(LoginButtonForm);
        return this;
    }
}
