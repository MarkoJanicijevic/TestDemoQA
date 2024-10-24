package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SecondPage {
    WebDriver driver;
    ArrayList<WebElement> lista_web_elemenata;

    public WebElement getAdd_button() {
        return driver.findElement(By.id("addNewRecordButton"));    }

    WebElement add_button;



    WebElement any_delete_button;

    public SecondPage(WebDriver driver) {
        this.driver = driver;
    }




    public ArrayList<WebElement> getLista_web_elemenata() {
        return new ArrayList<>(driver.findElements(By.className("rt-tr-group")));
    }

    public int countUsedRows () {

        return getLista_web_elemenata().size() - countBlankRows();
    }

    public int countBlankRows () {
        int counter = 0;
        for (int i = 0; i < getLista_web_elemenata().size(); i++) {

            if (getLista_web_elemenata().get(i).getText().isBlank()) {
                counter++;
            }

        }
        return counter;
    }

    public WebElement getAny_delete_button(int x) {
        return driver.findElement(By.id("delete-record-" + x));
    }

    public void clickOnAllDelete () {
        int i = countUsedRows();
        while (i > 0) {
            getAny_delete_button(i).click();
            i--;
        }
    }

    public void clickOnAdd () {
        getAdd_button().click();
    }

    public List<WebElement> getNameOfAny () {
        return driver.findElements(By.className("rt-td"));
    }
















}
