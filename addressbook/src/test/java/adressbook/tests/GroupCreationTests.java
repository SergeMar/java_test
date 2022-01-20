package adressbook.tests;

import adressbook.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup();
        app.getGroupHelper().fillFields(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
