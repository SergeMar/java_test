package adressbook.tests;

import adressbook.model.ContactData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Disabled
    @Test
    public void testContactCreation() {
        app.getContactHelper().contactAdd();
        app.getContactHelper().fillFields(new ContactData("Name", "Surname", "test"));
        app.getContactHelper().selectGroup("test1");
        app.getContactHelper().createContact();
        app.goTo().goToHomePage();
    }


}