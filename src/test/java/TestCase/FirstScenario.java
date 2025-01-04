package TestCase;

import Pages.HomePage;
import Pages.MenuBarPage;
import Pages.SignUpForm;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScenario {
    Browser browser;
    Playwright driver;
    Page page;
    String url = "https://www.demoblaze.com/index.html";

    @Test
    public void firstScenario(){
    new HomePage(page)
            .navigateToUrl(url);
    new MenuBarPage(page)
            .clickOnSignupButtonToRegister();
    new SignUpForm(page)
            .enterDataInSignupForm("validFirstScenario","1234")
            .submitTheSignupFormToRegister();
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
