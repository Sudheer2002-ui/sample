package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import Browser.Browser;
import Locators.page2Objects;

public class page2 extends Browser {
	static page2Objects obj;
	public static String getStatic() {
		obj=PageFactory.initElements(driver, page2Objects.class);

		return page2Objects.staticElement.getText();
	}
	public static String elementText;

    public static void changePage(String pageName) {
		obj=PageFactory.initElements(driver, page2Objects.class);

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(obj.ul));
            List<WebElement> list = obj.listItems;
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                WebElement e = list.get(i);
                if (e.getText().equals(pageName)) {
                	elementText=e.getText();
                    e.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}