package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NewsPage {

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div[1]")
    public WebElement china;

    public WebDriver driver;

    public NewsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickChina(){this.china.click();}
}
