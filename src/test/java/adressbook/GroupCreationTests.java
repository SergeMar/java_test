package adressbook;

import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testUntitledTestCase() throws Exception {
        goToGroupPage();
        createGroup();
        fillFields(new GroupData("test1", "test2", "test3"));
        submitGroup();
        returnToGroupPage();
    }

}
