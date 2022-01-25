package adressbook.tests;

import adressbook.model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testsContactModification() {

        app.getContactHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillFields(new ContactData("Test_name", "Test_surname", "test"));
        app.getContactHelper().updateContact();
    }

}
