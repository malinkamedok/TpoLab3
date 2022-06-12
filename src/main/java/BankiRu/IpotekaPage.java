package BankiRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class IpotekaPage {

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/div/div/div/div/div/div/button[2]")
    public WebElement refinans;

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/section/div/div/form/div/div[1]/div/div/div/div/div")
    public WebElement type;

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/section/div/div/form/div/div[1]/div/div/div/div[2]/div/ul/li[6]")
    public WebElement garage;

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/section/div/div/div/div[2]/div/button")
    public WebElement find;

    public WebDriver driver;

    public IpotekaPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickRefinans(){this.refinans.click();}

    public void clickType(){this.type.click();}

    public void clickGarage(){this.garage.click();}

    public void clickFind(){this.find.click();}
}

