package adressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.*;

public class ApplicationManager {

    private static SessionHelper sessionHelper;
    private static GroupHelper groupHelper;
    private static ContactHelper contactHelper;
    private static NavigationHelper navigationHelper;
    private static String browser;
    private static WebDriver driver;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (browser.equals(IE)) {
           driver = new InternetExplorerDriver();
        } else if (browser.equals(EDGE)) {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper = new ContactHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper group() {
        return groupHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
