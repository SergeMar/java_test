package adressbook.tests;

import adressbook.appmanager.ApplicationManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.EDGE;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(CHROME);

    @BeforeAll
    public static void setUp() throws Exception {
        app.init();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        app.stop();
    }
}
