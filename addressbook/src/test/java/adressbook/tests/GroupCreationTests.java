package adressbook.tests;

import adressbook.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("test1", "test2", null));
        app.getNavigationHelper().goToGroupPage();
    }
}
