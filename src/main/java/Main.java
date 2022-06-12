import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws IOException {

        BrowserDrivers BD = new BrowserDrivers();

        System.out.println("Keys: " + BD.getDrivers().keySet());

        BD.closeBrowser();

    }
}