package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class InvestmentsPage {

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/div/div/div/div/div[4]/a")
    public WebElement banner;

    public WebDriver driver;

    public InvestmentsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickBanner(){this.banner.click();}

}
