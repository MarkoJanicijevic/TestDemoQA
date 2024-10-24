package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    WebElement FirstName;
    WebElement LastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    WebElement submitButton;

    public WebElement findID (String x) {
        return driver.findElement(By.id(x));
    }

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public WebElement getFirstName() {
        return findID("firstName");
    }

    public WebElement getLastName() {
        return findID("lastName");
    }

    public WebElement getEmail() {
        return findID("userEmail");
    }

    public WebElement getAge() {
        return findID("age");
    }

    public WebElement getSalary() {
        return findID("salary");
    }

    public WebElement getDepartment() {
        return findID("department");
    }

    public void fillFirstName(String x) {
        getFirstName().sendKeys(x);
    }
    public void fillLastName(String x) {
        getLastName().sendKeys(x);
    }
    public void fillEmail(String x) {
        getEmail().sendKeys(x);
    }
    public void fillAge(String x) {
        getAge().sendKeys(x);
    }
    public void fillSalary(String x) {
        getSalary().sendKeys(x);
    }
    public void fillDepartment(String x) {
        getDepartment().sendKeys(x);
    }
    public void clickOnSubmitButton () {
        getSubmitButton().click();
    }











}
