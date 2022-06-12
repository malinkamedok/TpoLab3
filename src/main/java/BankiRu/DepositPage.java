package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DepositPage {

    @FindBy(xpath = "//*[@id=\"deposit_search_form\"]/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/div")
    public WebElement inputSum;

    @FindBy(xpath = "//*[@id=\"deposit_search_form\"]/div[2]/div/div[1]/div[2]/div[1]")
    public WebElement chooseTime;

    @FindBy(xpath = "//*[@id=\"deposit_search_form\"]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div/ul/li[3]")
    public WebElement threeMonths;

    @FindBy(xpath = "//*[@id=\"deposit_search_form\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/span[2]")
    public WebElement popular;

    @FindBy(xpath = "//*[@id=\"deposit_search_form\"]/div[2]/div/div[2]/div/div[2]/div")
    public WebElement find;

    public WebDriver driver;

    public DepositPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void enterSum(String text){this.inputSum.sendKeys(text);}

    public void clickChooseTime(){this.chooseTime.click();}

    public void clickThreeMonths(){this.threeMonths.click();}

    public void clickPopular(){this.popular.click();}

    public void clickFind(){this.find.click();}

    public void clickToWrite(){this.inputSum.click();}
}
