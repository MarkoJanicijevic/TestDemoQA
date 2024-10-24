package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SideBarPage {

    WebDriver driver;
    WebElement WebTables;

    public SideBarPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getWebTables() {
        ArrayList<WebElement> lista = new ArrayList<>(driver.findElements(By.id("item-3")));
        int index = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Web Tables")) {
                index = i;
                break;
            }
        }
        return lista.get(index);
    }

    public void clickOnWebTables () {
        getWebTables().click();
    }



}
