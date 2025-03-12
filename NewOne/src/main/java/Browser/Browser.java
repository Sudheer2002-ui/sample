package Browser;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.page1Object;
public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	/*
	 * Open the browser based on the choice
	 */
	static page1Object obj;

	public static void openBrowser() throws Exception {
		obj=PageFactory.initElements(driver, page1Object.class);

		try {
			String choice = utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser");
		}
	}
 
	/*
	 * Pauses the URL of the application
	 */
	public static void navigateToUrl(String str) throws Exception {
		try {
			driver.get(str); 
			driver.manage().window().maximize();
			act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		} catch (Exception e) {
			System.out.println("Browser - geturl");
		}
	}
	/*
	 * Closes the Browser
	 */
	public static void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
		}

}
}