package adressbook.tests;

import adressbook.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification (){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillFields(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
    }
}
