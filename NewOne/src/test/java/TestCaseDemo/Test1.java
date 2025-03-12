package TestCaseDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Browser.Browser;
import Pages.page1;
import ScreenShot.screenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static WebDriverWait wait;
	@DataProvider(name="title")
	public Object[] dpMethod() {
		Object[] testData=new Object[1];
		testData[0]="OrangeHRM";
		return testData;
	}
	
	@BeforeMethod
	public void open() throws Exception {
		Browser.openBrowser();
		Browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dataProvider ="title",priority=1)
	public void title(String title) throws Exception {
		Assert.assertEquals(page1.getTitle(),title);
		screenshot.screenShot("Title");
		Reporter.log("Test case 1 Title Assertion Pass");
	}
		
	@AfterMethod
	public void close() {
		page1.closeBrowser();
	}
	
}