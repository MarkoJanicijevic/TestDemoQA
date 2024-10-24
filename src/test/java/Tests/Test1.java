package Tests;

import Base.BaseTest;
import Pages.MainPage;
import Pages.SecondPage;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

    @BeforeMethod
    public void pageSetUp () {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void test1 () throws InterruptedException {

        mainpage.clickOnElements();
        sidebarpage.clickOnWebTables();
        secondpage.clickOnAllDelete();
        System.out.println(secondpage.getLista_web_elemenata().size());
        System.out.println(secondpage.countUsedRows());


    }
}
