package Pages;

import com.microsoft.playwright.*;

public class HomePage {
    //setupDriverAndBrowser
    public Page page;

    //Locators
    private String nextButtonInHomePage = "//button[@id='next2']";
    private String productNameToPurchase = "//a[@href='prod.html?idp_=10']";

    //Contractor
    public HomePage(Page page) {
        this.page = page;
    }

    public HomePage navigateToUrl(String url){
        page.navigate(url);
        return this;
    }

    /// //////////////Actions\\\\\\\\\\\\\\\\\
    public HomePage clickOnNextButtonToGetTargetProduct(){
        page.dblclick(nextButtonInHomePage);
//        nextbutton.scrollIntoViewIfNeeded();
        return this;
    }

    public HomePage clickOnProduct(){
        page.click(productNameToPurchase);
        return this;
    }
}
