package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class InsurancePage {

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/input")
    public WebElement number;

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/button")
    public WebElement count;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[1]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/input")
    public WebElement brand;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div/input")
    public WebElement model;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[1]/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div/input")
    public WebElement year;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/input")
    public WebElement power;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/input")
    public WebElement carnumber;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/input")
    public WebElement vin;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/input")
    public WebElement sts;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/input")
    public WebElement date;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[2]/div/div/div[2]/button/span")
    public WebElement continueButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[1]/div/form/div/div[2]/div/div[1]/div[2]/div[1]/label/span[1]")
    public WebElement noLimits;

    @FindBy(xpath = "/html/body/div[2]/div[1]/article/section/div/div/div/div[2]/div/div[2]/div/div/section/div[2]/div/div/div[2]/button")
    public WebElement continueButton1;

    public WebDriver driver;

    public InsurancePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void enterNumber(String text){this.number.sendKeys(text);}

    public void clickCount(){this.count.click();}

    public void enterBrand(String text){this.brand.sendKeys(text);}

    public void enterModel(String text){this.model.sendKeys(text);}

    public void enterYear(String text){this.year.sendKeys(text);}

    public void enterPower(String text){this.power.sendKeys(text);}

    public void enterCarNumber(String text){this.carnumber.sendKeys(text);}

    public void enterVIN(String text){this.vin.sendKeys(text);}

    public void enterSTS(String text){this.sts.sendKeys(text);}

    public void enterDate(String text){this.date.sendKeys(text);}

    public void clickContinue(){this.continueButton.click();}

    public void clickNoLimits(){this.noLimits.click();}

    public void clickContinue1(){this.continueButton1.click();}

}
