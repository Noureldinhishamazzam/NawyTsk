package TestCase;

import Pages.HomePage;
import Pages.LoginForm;
import Pages.MenuBarPage;
import Pages.SignUpForm;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThirdScenario {

    Browser browser;
    Playwright driver;
    Page page;
    String url = "https://www.demoblaze.com/index.html";

    @Test
    public void ThirdScenario(){
        new HomePage(page)
                .navigateToUrl(url);
        new MenuBarPage(page)
                .clickOnSignupButtonToRegister();
        new SignUpForm(page)
                .enterDataInSignupForm("validUserThirdScenario","validPasword")
                .submitTheSignupFormToRegister();
        new MenuBarPage(page)
                .clickOnloginButton();
        new LoginForm(page)
                .enterDataInLoginForm("validUserThirdScenario","validPasword")
                .clickOnLoginFormButton();
        new MenuBarPage(page)
                .clickOnLogoutButton();
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
