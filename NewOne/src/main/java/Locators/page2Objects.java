package Locators;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Browser.Browser;

public class page2Objects extends Browser {
    
    
    @FindBy(xpath = "//ul[@class='oxd-main-menu']")
    public WebElement ul;

    @FindBy(xpath= "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    @CacheLookup
    public static WebElement staticElement;

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li")
    @CacheLookup
    public List<WebElement> listItems;

}
