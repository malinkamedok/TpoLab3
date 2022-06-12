package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageBanki {

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[4]/div/div/a")
    public WebElement startLoginButton;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[1]/a")
    public WebElement mainPageButton;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[1]/div/a")
    public WebElement mainPageDeposit;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[2]/div/a")
    public WebElement mainPageCredit;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[3]/div/a")
    public WebElement mainPageCards;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[4]/div/a")
    public WebElement mainPageIpoteka;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[5]/div/a")
    public WebElement mainPageInsurance;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[6]/div/a")
    public WebElement mainPageInvestments;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[7]/div/a")
    public WebElement mainPageBusiness;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[8]/div/a")
    public WebElement mainPageNews;

    @FindBy(xpath = "/html/body/div[4]/header/div/div/div/div[2]/nav/ul/li[9]/div")
    public WebElement mainPageMore;

    @FindBy(xpath = "/html/body/div[4]/main/div/div[5]/div/div/div/div[2]/div[1]/div[2]/a")
    public WebElement mainPageReviews;

    @FindBy(xpath = "/html/body/div[4]/main/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/a")
    public WebElement mainPageAsk;

    public WebDriver driver;

    public MainPageBanki(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickDeposit(){this.mainPageDeposit.click();}
}