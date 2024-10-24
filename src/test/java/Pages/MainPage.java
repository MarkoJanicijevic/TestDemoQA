package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    WebDriver driver;

    public WebElement getElements() {
        ArrayList<WebElement> lista = new ArrayList<>(driver.findElements(By.className("card-up")));
        return lista.get(0);
    }

    WebElement Elements;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElements () {
        getElements().click();
    }
}
