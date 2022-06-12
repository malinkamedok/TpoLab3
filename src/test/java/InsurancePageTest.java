import BankiRu.DepositPage;
import BankiRu.InsurancePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class InsurancePageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, InsurancePage> InsurancePageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        InsurancePageMap = new HashMap<String, InsurancePage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/insurance/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> InsurancePageMap.put(key, new InsurancePage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5    );
    }

    @Test
    @Order(1)
    @DisplayName("Number")
    public void number() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> assertTrue(InsurancePage.number.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("EnterNumber")
    public void enterNumber() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterNumber("Р841ОН198"));
    }

    @Test
    @Order(3)
    @DisplayName("Count")
    public void count() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> assertTrue(InsurancePage.count.isDisplayed()));
    }

    @Test
    @Order(4)
    @DisplayName("CountEnter")
    public void countEnter() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.clickCount());
    }

    @Test
    @Order(5)
    @DisplayName("EnterBrand")
    public void enterBrand() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterBrand("Land Rover"));
    }

    @Test
    @Order(6)
    @DisplayName("EnterModel")
    public void enterModel() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterModel("Discovery Sport"));
    }

    @Test
    @Order(7)
    @DisplayName("EnterYear")
    public void enterYear() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterYear("2017"));
    }

    @Test
    @Order(8)
    @DisplayName("Power")
    public void power() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterPower("180"));
    }

    @Test
    @Order(9)
    @DisplayName("CarNumber")
    public void carNumber() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterCarNumber("Р841ОН198"));
    }

    @Test
    @Order(10)
    @DisplayName("VIN")
    public void vin() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterVIN("SALCA123456789011"));
    }

    @Test
    @Order(11)
    @DisplayName("STS")
    public void sts() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterSTS("1120111111"));
    }

    @Test
    @Order(12)
    @DisplayName("Date")
    public void date() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.enterDate("10102018"));
    }

    @Test
    @Order(13)
    @DisplayName("ClickContinue")
    public void clickContinue() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.clickContinue());
    }

    @Test
    @Order(14)
    @DisplayName("ClickNoLimits")
    public void clickNoLimits() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.clickNoLimits());
    }

    @Test
    @Order(15)
    @DisplayName("ClickContinue1")
    public void clickContinue1() throws InterruptedException {
        InsurancePageMap.forEach((key, InsurancePage) -> InsurancePage.clickContinue1());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }

}
