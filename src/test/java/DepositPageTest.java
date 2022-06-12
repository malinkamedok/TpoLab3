import BankiRu.DepositPage;
import BankiRu.MainPageBanki;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class DepositPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, DepositPage> DepositPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        DepositPageMap = new HashMap<String, DepositPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/products/deposits/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> DepositPageMap.put(key, new DepositPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void TimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @Order(1)
    @DisplayName("InputSum")
    public void InputSum() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> assertTrue(DepositPage.inputSum.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("click0")
    public void Click1() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> DepositPage.clickToWrite());
    }

//    @Test
//    @Order(3)
//    @DisplayName("InputSumEnter")
//    public void InputSumEnter() throws InterruptedException {
//        DepositPageMap.forEach((key, DepositPage) -> DepositPage.enterSum("100000"));
//    }

    @Test
    @Order(3)
    @DisplayName("ChooseTime")
    public void ChooseTime() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> assertTrue(DepositPage.chooseTime.isDisplayed()));
    }

    @Test
    @Order(4)
    @DisplayName("click1")
    public void Click() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> DepositPage.clickChooseTime());
    }

    @Test
    @Order(5)
    @DisplayName("ThreeMonths")
    public void ThreeMonths() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> assertTrue(DepositPage.threeMonths.isDisplayed()));
    }

    @Test
    @Order(6)
    @DisplayName("ClickThreeMonths")
    public void ClickThreeMonths() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> DepositPage.clickThreeMonths());
    }

    @Test
    @Order(7)
    @DisplayName("Popular")
    public void Popular() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> assertTrue(DepositPage.popular.isDisplayed()));
    }

    @Test
    @Order(8)
    @DisplayName("ChoosePopular")
    public void ChoosePopular() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> DepositPage.clickPopular());
    }

    @Test
    @Order(9)
    @DisplayName("Find")
    public void Find() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> assertTrue(DepositPage.find.isDisplayed()));
    }

    @Test
    @Order(10)
    @DisplayName("ClickFind")
    public void ClickFind() throws InterruptedException {
        DepositPageMap.forEach((key, DepositPage) -> DepositPage.clickFind());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }
}
