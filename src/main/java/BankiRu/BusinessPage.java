package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BusinessPage {

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div[3]/div[2]/div/div[1]/a/div[2]/div[2]")
    public WebElement pick;

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div[2]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div[5]/div[2]")
    public WebElement more;

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div[2]/div/div[1]/div/div[3]/div/div[2]/div/div[4]/div/div/div/div[5]/div[2]")
    public WebElement someMore;

    public WebDriver driver;

    public BusinessPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickPick(){this.pick.click();}

    public void clickMore(){this.more.click();}

    public void clickSomeMore(){this.someMore.click();}
}
