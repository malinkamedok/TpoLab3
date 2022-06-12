import BankiRu.DepositPage;
import BankiRu.IpotekaPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class IpotekaPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, IpotekaPage> IpotekaPageMap;

    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        IpotekaPageMap = new HashMap<String, IpotekaPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.banki.ru/products/hypothec/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> IpotekaPageMap.put(key, new IpotekaPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @Order(1)
    @DisplayName("Refinansirovaniye")
    public void refinans() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> assertTrue(IpotekaPage.refinans.isDisplayed()));
    }

    @Test
    @Order(2)
    @DisplayName("ClickOnRefinans")
    public void clickOnRefinans() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> IpotekaPage.clickRefinans());
    }

    @Test
    @Order(3)
    @DisplayName("Type")
    public void type() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> assertTrue(IpotekaPage.type.isDisplayed()));
    }

    @Test
    @Order(4)
    @DisplayName("ClickOnType")
    public void clickOnType() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> IpotekaPage.clickType());
    }

    @Test
    @Order(5)
    @DisplayName("Garage")
    public void garage() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> assertTrue(IpotekaPage.garage.isDisplayed()));
    }

    @Test
    @Order(6)
    @DisplayName("ClickOnGarage")
    public void clickOnGarage() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> IpotekaPage.clickGarage());
    }

    @Test
    @Order(7)
    @DisplayName("Find")
    public void find() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> assertTrue(IpotekaPage.find.isDisplayed()));
    }

    @Test
    @Order(8)
    @DisplayName("ClickOnFind")
    public void clickOnFind() throws InterruptedException {
        IpotekaPageMap.forEach((key, IpotekaPage) -> IpotekaPage.clickFind());
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
        BrowserDrivers.closeBrowser();
    }
}
