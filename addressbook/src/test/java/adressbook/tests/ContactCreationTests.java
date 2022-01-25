package adressbook.tests;

import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().contactAdd();
        app.getContactHelper().fillFields("sergey", "serge");
        app.getContactHelper().selectGroup("test1");
        app.getContactHelper().createContact();
        app.getContactHelper().returnToHomePage();
    }


}