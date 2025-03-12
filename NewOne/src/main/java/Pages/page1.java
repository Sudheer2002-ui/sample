package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.Browser;
import Locators.page1Object;

public class page1 extends Browser {
	
	static page1Object obj;
	
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	
	public static void enterUsername(String data) {
		obj=PageFactory.initElements(driver, page1Object.class);
	    try {
            wait.until(ExpectedConditions.visibilityOf(obj.userName)); 
	        obj.userName.sendKeys(data);
	    } catch (Exception e) {
	        System.out.println("Exception in enterUsername: " + e);
	    }
	}

	public static void enterPassWord(String data) {
		try {
            wait.until(ExpectedConditions.visibilityOf(obj.passWord)); 
			obj.passWord.sendKeys(data);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void clickButton() {
		try {
			Thread.sleep(2000);
			obj.but.click();
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}