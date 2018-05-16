package driverpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement {
    public WebDriver DR;

    public FindElement(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement findAndWait(String cssSelector) throws InterruptedException {
        WebElement El = null;

        for (int i = 1; i <= 50; i++) {
            try {
                El = DR.findElement(By.cssSelector(cssSelector));
            } catch (Exception e) {
                System.out.println(1);
                Thread.sleep(200);
            }
        }

        return El;
    }
}
