package adressbook.appmanager;

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

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public static void init() {
        if (browser.equals(CHROME)) {
            ContactHelper.driver = new ChromeDriver();
        } else if (browser.equals(FIREFOX)) {
            ContactHelper.driver = new FirefoxDriver();
        } else if (browser.equals(IE)) {
            ContactHelper.driver = new InternetExplorerDriver();
        } else if (browser.equals(EDGE)) {
            ContactHelper.driver = new EdgeDriver();
        }
        ContactHelper.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ContactHelper.driver.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(ContactHelper.driver);
        navigationHelper = new NavigationHelper(ContactHelper.driver);
        contactHelper = new ContactHelper(ContactHelper.driver);
        sessionHelper = new SessionHelper(ContactHelper.driver);
        sessionHelper.login("admin", "secret");
    }

    public static void stop() {
        ContactHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
