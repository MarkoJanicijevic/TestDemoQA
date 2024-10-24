package Base;

import Pages.FormPage;
import Pages.MainPage;
import Pages.SecondPage;
import Pages.SideBarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {


    public WebDriver driver;
    public MainPage mainpage;
    public SecondPage secondpage;
    public SideBarPage sidebarpage;
    public FormPage formpage;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        mainpage = new MainPage(driver);
        secondpage = new SecondPage(driver);
        sidebarpage = new SideBarPage(driver);
        formpage = new FormPage(driver);
        excelReader = new ExcelReader("C:\\Users\\Djang\\Documents\\Doc\\QA\\TestData.xlsx");
    }


}
