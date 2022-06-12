import BankiRu.InvestmentsPage;
import BankiRu.NewsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NewsPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, NewsPage> NewsPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        NewsPageMap = new HashMap<String, NewsPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/news/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> NewsPageMap.put(key, new NewsPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void TimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    @Order(1)
    @DisplayName("China")
    public void China() throws InterruptedException {
        NewsPageMap.forEach((key, NewsPage) -> assertTrue(NewsPage.china.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("ClickChina")
    public void ClickChina() throws InterruptedException {
        NewsPageMap.forEach((key, NewsPage) -> NewsPage.clickChina());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }
}

