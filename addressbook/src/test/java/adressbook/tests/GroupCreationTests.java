package adressbook.tests;

import adressbook.model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData group = new GroupData("test2", "test2", null);
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assertions.assertEquals(after.size(), before.size() + 1);

        int max1 = after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId(); //Лямбда выражение
        int max = after.stream().max(Comparator.comparingInt(GroupData::getId)).get().getId();
        group.setId(max);
        before.add(group);
        Assertions.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
