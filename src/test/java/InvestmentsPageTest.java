import BankiRu.InvestmentsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class InvestmentsPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, InvestmentsPage> InvestmentsPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        InvestmentsPageMap = new HashMap<String, InvestmentsPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/investment/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> InvestmentsPageMap.put(key, new InvestmentsPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
//        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().fullscreen());
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    @Order(1)
    @DisplayName("Banner")
    public void banner() throws InterruptedException {
        InvestmentsPageMap.forEach((key, InvestmentsPage) -> assertTrue(InvestmentsPage.banner.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("ClickBanner")
    public void clickBanner() throws InterruptedException {
        InvestmentsPageMap.forEach((key, InvestmentsPage) -> InvestmentsPage.clickBanner());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }
}
