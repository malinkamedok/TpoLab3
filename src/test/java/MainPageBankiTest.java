import com.sun.tools.javac.Main;
import org.junit.jupiter.api.*;
import BankiRu.MainPageBanki;
import org.openqa.selenium.Dimension;

import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageBankiTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, MainPageBanki> MainPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        MainPageMap = new HashMap<String, MainPageBanki>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> MainPageMap.put(key, new MainPageBanki(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @DisplayName("MainPageButton")
    public void mainPageButton() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageButton.isDisplayed()));
    }

    @Test
    @DisplayName("StartLoginButton")
    public void startLoginButton() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.startLoginButton.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageDeposit")
    public void mainPageDeposit() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageDeposit.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageCredit")
    public void mainPageCredit() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageCredit.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageCards")
    public void mainPageCards() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageCards.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageIpoteka")
    public void mainPageIpoteka() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageIpoteka.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageInsurance")
    public void mainPageInsurance() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageInsurance.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageInvestments")
    public void mainPageInvestments() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageInvestments.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageBusiness")
    public void mainPageBusiness() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageBusiness.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageNews")
    public void mainPageNews() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageNews.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageMore")
    public void mainPageMore() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageMore.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageReviews")
    public void mainPageReviews() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageReviews.isDisplayed()));
    }

    @Test
    @DisplayName("MainPageAsk")
    public void mainPageAsk() throws InterruptedException {
        MainPageMap.forEach((key, MainPageBanki) -> assertTrue(MainPageBanki.mainPageAsk.isDisplayed()));
    }


    @AfterAll
    public static void closeUp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
    BrowserDrivers.closeBrowser();
}
}


