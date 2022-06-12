import BankiRu.BusinessPage;
import BankiRu.InvestmentsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BusinessPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, BusinessPage> BusinessPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        BusinessPageMap = new HashMap<String, BusinessPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/business/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> BusinessPageMap.put(key, new BusinessPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1920, 1080)));
    }

    @BeforeEach
    @AfterEach
    public void TimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    @Order(1)
    @DisplayName("Pick")
    public void Pick() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> assertTrue(BusinessPage.pick.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("ClickPick")
    public void ClickPick() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> BusinessPage.clickPick());
    }

    @Test
    @Order(3)
    @DisplayName("More")
    public void More() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> assertTrue(BusinessPage.more.isDisplayed()));
    }

    @Test
    @Order(4)
    @DisplayName("ClickMore")
    public void ClickMore() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> BusinessPage.clickMore());
    }

    @Test
    @Order(5)
    @DisplayName("SomeMore")
    public void SomeMore() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> assertTrue(BusinessPage.someMore.isDisplayed()));
    }

    @Test
    @Order(6)
    @DisplayName("ClickSomeMore")
    public void ClickSomeMore() throws InterruptedException {
        BusinessPageMap.forEach((key, BusinessPage) -> BusinessPage.clickSomeMore());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }
}
