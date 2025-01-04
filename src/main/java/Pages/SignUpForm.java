package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SignUpForm {
    //setupDriverAndBrowser
    Playwright driver;
    Page page;

    //Locators
    private String userNameSignupField = "#sign-username";
    private String passwordSignupField = "#sign-password";
    private String signupButtonForm = "//button[@onclick='register()']";

    //Contractor
    public SignUpForm(Page page) {
        this.page = page;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public SignUpForm enterDataInSignupForm(String username,String password){
        page.fill(userNameSignupField,username);
        page.fill(passwordSignupField,password);
        return this;
    }

    public SignUpForm submitTheSignupFormToRegister(){
        page.click(signupButtonForm);
        return this;
    }

    public SignUpForm clickOnPopupAlert() {
        page.onDialog(dialog -> {
            dialog.accept();
        });
        return this;
    }
}
