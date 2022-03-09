package adressbook.tests;

import adressbook.model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

        app.goTo().groupPage();
        List<GroupData> before = app.group().list();
        int index = before.size() - 1;
        GroupData group = new GroupData()
                .withId(before.get(index).getId()).withName("test1").withHeader("test2").withFooter("test3");
        app.group().modify(index, group);
        List<GroupData> after = app.group().list();
        Assertions.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(group);
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);
        Assertions.assertEquals(before, after);
    }


}
