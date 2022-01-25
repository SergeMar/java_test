package adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {
    static WebDriver driver;

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void createContact() {
        click(By.name("submit"));
    }

    public void fillFields(String firstname, String lastname) {
        enter(firstname, "firstname");
        enter(firstname, "lastname");
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
}
