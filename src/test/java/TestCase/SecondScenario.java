package TestCase;

import Pages.HomePage;
import Pages.LoginForm;
import Pages.MenuBarPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondScenario {
    Browser browser;
    Playwright driver;
    Page page;
    String url = "https://www.demoblaze.com/index.html";

    @Test
    public void secondScenario(){
        new HomePage(page)
                .navigateToUrl(url);
        new MenuBarPage(page)
                .clickOnloginButton();
        new LoginForm(page)
                .enterDataInLoginForm("validUserFirstScenario","validPassword")
                .clickOnLoginFormButton();
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
