package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        driver.navigate().to("https://demoqa.com/");
    }
    @Test
    public void Test2 () throws InterruptedException {
        mainpage.clickOnElements();
        sidebarpage.clickOnWebTables();
        secondpage.clickOnAllDelete();
        Assert.assertTrue(secondpage.countUsedRows() == 0);
        secondpage.clickOnAdd();
        Thread.sleep(3000);
        formpage.fillFirstName("Marko");
        formpage.fillLastName("Janicijevic");
        formpage.fillEmail("markojanicijevicposao@gmail.com");
        formpage.fillAge("31");
        formpage.fillDepartment("IT");
        formpage.fillSalary("100000");
        formpage.clickOnSubmitButton();

    }
}
