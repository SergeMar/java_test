package adressbook.appmanager;

import adressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void createContact() {
        click(By.name("submit"));
    }

    public void fillFields(ContactData contactData) {
        enter(contactData.getFirstname(), "firstname");
        enter(contactData.getLastname(), "lastname");
    }

    public void enter(String firstname, String locator) {
        driver.findElement(By.name(locator)).click();
        driver.findElement(By.name(locator)).clear();
        driver.findElement(By.name(locator)).sendKeys(firstname);
    }

    public void contactAdd() {
        click(By.linkText("add new"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void selectGroup(String name) {
        click(By.name("new_group"));
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(name);
    }

    public void filLastnameField() {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Test_surname");
    }

    public void filFirstnameField() {
        click(By.name("firstname"));
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Test_name");
    }

    public void updateContact() {
        click(By.xpath("//div[@id='content']/form/input[22]"));
    }

    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void selectContact() {
        click(By.id("2"));
    }

    public void goToHomePage() {
        click(By.linkText("home"));
    }

}
