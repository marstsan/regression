package driverpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.remote.DesiredCapabilities;

//public class CreateDriver {
public class CreateDriver {

    // private WebDriver driver;
    private final WebDriver driver;

    public CreateDriver() throws InterruptedException {
        String chromeDriverPath;

        if (System.getProperty("os.name").equals("Mac OS X")) {
            chromeDriverPath = "./resource/chromedriver0421";      // if os is mac, set chromedriver path for mac
        } else if (System.getProperty("os.name").contains("Windows")) {
            chromeDriverPath = "./resource/chromedriver.exe";    // if os is windows , set chromedriver parth for windows
        } else {
            chromeDriverPath = "./resource/chromedriver-linux";    // if os is linux, set chromedriver path for linux
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);    // setup chromedriver for webdriver

        ChromeOptions options = new ChromeOptions();

        options.addArguments("disable-infobars");    // disable info bar

        // options.addArguments("headless");//enable headless mode
        driver = new ChromeDriver(options);

        if (System.getProperty("os.name").equals("Mac OS X")) {
            driver.manage().window().fullscreen();    // on mac maximize windows
        } else {
            driver.manage().window().maximize();
        }                                             // on windows or linux maximize windows
    }

    public WebDriver getDriver() {
        return driver;
    }
}
