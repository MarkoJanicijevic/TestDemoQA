package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnterFromExcell extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void TestExcel() throws InterruptedException {
        mainpage.clickOnElements();
        sidebarpage.clickOnWebTables();
        secondpage.clickOnAllDelete();
        secondpage.clickOnAdd();
        Thread.sleep(3000);

        formpage.fillFirstName(excelReader.getStringData("sheet1", 1, 0));
        formpage.fillLastName(excelReader.getStringData("sheet1", 1, 1));
        formpage.fillEmail(excelReader.getStringData("sheet1", 1, 2));
        formpage.fillAge(String.valueOf(excelReader.getIntegerData("sheet1", 1, 3)));
        formpage.fillDepartment(excelReader.getStringData("sheet1", 1, 4));
        formpage.fillSalary(String.valueOf(excelReader.getIntegerData("sheet1", 1, 5)));
        formpage.clickOnSubmitButton();

    }

    @Test
    public void Test123() {
        System.out.println(secondpage.getNameOfAny());
    }
}
