package adressbook.tests;

import adressbook.appmanager.ApplicationManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeAll
    public static void setUp() throws Exception {
        ApplicationManager.init();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        ApplicationManager.stop();
    }

}
