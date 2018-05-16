import java.io.File;
import java.io.IOException;

import java.sql.Driver;

import java.util.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import BasicAction.Actions;
//import org.openqa.selenium.interactions.Actions ;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import com.sun.corba.se.impl.oa.toa.TOA;
import driverpkg.CreateDriver;

import element.*;
import net.bytebuddy.asm.Advice.Enter;


@SuppressWarnings("unused")
public class tableTest {
    public static void main(String[] args) throws Exception {
        WebDriver         driver       = new CreateDriver().getDriver();
        Actions           actions      = new Actions(driver);
        driver.manage().window().fullscreen();
        driver.get("http://uat.scv988.com/");
        Thread.sleep(3000);
        driver .findElement(By.id("username")).sendKeys("aft99testvnd");
        driver.findElement(By.id("password")).sendKeys("zNDG2r9z" + Keys.ENTER);
        Thread.sleep(5000);
        WebElement ca = driver.findElement(By.cssSelector("body > app-root > div > sss-navbar > nav > div.navbar-bottom > div > div > div.navbar-hamburger__dropdown > div:nth-child(6) > span > span:nth-child(2)"));
        actions.HoverElement(driver, ca);


        
    }
}
