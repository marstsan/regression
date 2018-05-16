package BasicAction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gurock.testrail.APIException;
import Components.Run_API;


//import driverpkg.*;
//import elenment.AdminReseller;
@SuppressWarnings("unused")
public class Actions {
    public static String path = ".//screenshots//";
    public WebDriver     DR;
    public WebElement    element;

    public Actions(WebDriver driver) {
        this.DR = driver;
    }

    public void FAILLog(WebElement element) {
        System.out.println("[X] FAIL Something wrong on the element " + element.getText());
    }

    /**
     * 第一個參數給 一個 css selector, 第二個 DR <br>
     * 會去找element,每0.2秒找一次  直到10秒 timeout
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.FindAndWait(CSSSelector, DR);
     */
    public WebElement FindAndWait(String CSSSelector, WebDriver DR) throws Exception {
        WebElement tt = null;

        for (int i = 1; i <= 50; i++) {
            try {
                tt = DR.findElement(By.cssSelector(CSSSelector));

                return tt;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        return null;
    }

    /**
     * 第一個參數給 網頁 element<br>
     * click the selector and select the option<br>
     *
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.IsElementDisplay(element);
     */
    public void IsElementDisplay(WebElement element) {
        boolean X = element.isDisplayed();

        if (X) {
            System.out.println("[-] Pass " + "" + element.getText() + " is Displayed");
        } else {
            System.out.println("[X] Fail " + "" + element.getText() + " is missing");
        }
    }

    public void LogMessage(String message) {
        System.out.println("[-] " + message);
    }

    public void PASSLog(WebElement element) {
        System.out.println("[-] Pass" + element.getText() + " Verified");
    }

    /**
     * 第一個參數給 網頁上element<br>
     * 會把element scroll 到最靠左上角的位置;
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br> <br>
     * 2. actions.ScrollIntoView(element);
     */
    public void ScrollIntoView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) DR).executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * 第一個參數給 網頁上selector element<br>
     * 第二個參數給 網頁上option上的文字 VisibleText<br>
     * click the selector and select the option
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.SelectDropDownbyText(element,VisibleText);
     */
    public void SelectDropDownbyText(WebElement element, String VisibleText) throws InterruptedException {
        Select select = new Select(element);

        select.selectByVisibleText(VisibleText);
    }

    /**
     * 第一個參數給 網頁上selector element<br>
     * 第二個參數給 網頁上option上的Visible Text<br>
     * click the selector and select the option
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.SelectDropDownbyValue(element,VisibleText);
     */
    public void SelectDropDownbyValue(WebElement element, String VisibleText) throws InterruptedException {
        Select select = new Select(element);

        select.selectByVisibleText(VisibleText);
    }

    /**
     * 第一個參數給 網頁上的inputfield
     * 第二個參數給 要輸入的字<br>
     * 每0.5秒嘗試input一次  直到15秒timeout<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.SendKeys(element,Text);
     * @throws Exception
     */
    public void SendKeys(WebElement element, String Text) throws Exception {
        for (int i = 1; i < 30; i++) {
            try {
                element.sendKeys(Text);

                break;
            } catch (Exception e) {
                Thread.sleep(500);
            }
        }
    }

    /**
     * 第一個參數給 一個column css selector, 第二個 給預期那一個但為需包韓那些字元 ,第三個 給 filter name<br>
     * 當測試all pass return true, 任何fail return false
     * Full example <br>
     * String[] ORGLIST = {"Brand Code","Brand Name","Description","Operational Email","Reseller Code","Reseller Name","Licensee Code"}<br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. boolean result = actions.VerifyFilterResult(#table > td:nth-child(2)", "tgp", "Reseller Code");
     * @return
     */
    public boolean VerifyFilterResult(String CSSSelector, String containText, String Filtername) {
        java.util.List<WebElement> Column  = DR.findElements(By.cssSelector(CSSSelector));
        boolean                    Result  = true;
        int                        correct = 0;

        for (int i = 0; i <= (Column.size() - 1); i++) {
            if (Column.get(i).getText().toLowerCase().contains(containText.toLowerCase())) {
                correct = correct + 1;
            } else {
                System.out.println("[X] Fail ******" + "The Filter " + Filtername + " resule of row : " + i
                                   + " is wrong");
            }
        }

        if (correct == Column.size()) {
            System.out.println("[-] Pass The Filter " + Filtername + " is working correctly");
        } else {
            Result = false;
        }

        return Result;
    }

    /**
     * 第一個參數給 一個網頁上label String List , 第二個參數給原始的label string list<br>
     * 當測試all pass return true, 任何fail return false
     * Full example <br>
     * String[] ORGLableList = {"Brand Code","Brand Name","Description","Operational Email","Reseller Code","Reseller Name","Licensee Code"}<br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. boolean result = actions.VerifyLables(LableList,ORGLableList);
     */
    public boolean VerifyLables(String[] LableList, String[] ORGLableList) {
        int     correctLableCount = 0;
        boolean Result            = true;

        for (int i = 0; i <= LableList.length - 1; i++) {
            if (LableList[i].equals(ORGLableList[i])) {
                correctLableCount = correctLableCount + 1;
            } else {
                System.out.println("[X] Fail " + LableList[i] + " is not the same as " + "org " + ORGLableList[i]);
            }
        }

        if (correctLableCount == LableList.length) {
            System.out.println("[-] Pass All Lable displayed correctly");
        } else {
            Result = false;
        }

        return Result;
    }

    /**
     * 第一個參數給 一個String List<br>
     * 當測試all pass return true, 任何fail return false
     * Full example <br>
     * String[] ORGLIST = {"Brand Code","Brand Name","Description","Operational Email","Reseller Code","Reseller Name","Licensee Code"}<br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. boolean result = actions.VerifyTableHeader(ORGLIST);
     * @return
     */
    public boolean VerifyTableHeader(String[] ORGlist) {
        java.util.List<WebElement> TH               =
            DR.findElements(By.cssSelector("table > thead > tr.ng-table-sort-header > th"));
        boolean                    Result           = true;
        int                        correctHederCont = 0;

        for (int i = 0; i <= ORGlist.length - 1; i++) {
            if (TH.get(i).getText().equals(ORGlist[i])) {
                correctHederCont = correctHederCont + 1;
            } else {
                System.out.println("[X] Fail " + TH.get(i).getText() + "is not the same as " + "org " + ORGlist[i]);
            }
        }

        if (correctHederCont == ORGlist.length) {
            System.out.println("[-] Pass All Table header dispplayed correctly");
        } else {
            Result = false;
        }
        ;

        return Result;
    }

    /**
     * 第一個參數給 網頁 element<br>
     * 第二個參數給 原始的文字<br>
     * click the selector and select the option<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.VerifyText(element,Text);
     */
    public void VerifyText(WebElement element, String ORGText) {
        boolean X = element.getText().equals(ORGText);

        if (X) {
            System.out.println("[-] Pass" + "" + element.getText() + "verified Pass  ");
        } else {
            System.out.println("[X] Fail" + "" + element.getText() + "is dnot the same as " + ORGText);
        }
    }

    /**
     * 第一個參數給 一個String CSS Selector<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.WaitForClickableAndClick("CSSSelector");
     *     String CSSSelecter = "#create";
     *     actions.WaitForClickableAndClickByCSS(CSSSelecter);
     */
    public void WaitForClickableAndClickByCSS(String CSSSelecter) {
        WebDriverWait wait = new WebDriverWait(DR, 20);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(CSSSelecter)));
        DR.findElement(By.cssSelector(CSSSelecter)).click();
    }

    /**
     * 第一個參數給 一個String xpath Selector<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.WaitForClickableAndClick("xpath");
     *
     *     String XPath = "//*[@id='create']";
     *     actions.WaitForClickableAndClickByXpath(XPath);
     *
     */
    public void WaitForClickableAndClickByXpath(String xpath) {
        WebDriverWait wait = new WebDriverWait(DR, 15);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        DR.findElement(By.xpath(xpath)).click();
    }

    /**
     * 第一個參數給 web element<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br> <br>
     * 2. actions.clickElement(Page.Add_Reseller_Cancel());
     * @throws InterruptedException
     */
    public void clickElement(WebElement element) throws Exception {
        for (int i = 1; i <= 60; i++) {
            try {
                element.click();

                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
    }

    /**
     * 第一個參數給 File name<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.takeVerifyScreenshot("test.png");
     */
    public void takeVerifyScreenshot(String FileName) throws IOException {
        String filename  = "Verify_" + FileName;
        File   snapshort = ((TakesScreenshot) DR).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(snapshort, new File(path + filename));
    }

    /**
     * 使用前先把網頁上的排序按成a-z
     * 第一個參數給 一個 css selector, 第二個參數給column name<br>
     * 會檢查排序是否是1~9 and a~z(不區分大小寫)<br>
     *  當測試all pass return true, 任何fail return false
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. boolean result = actions.verifySortingA_To_Z(CSSSelector,ColumnName);
     *
     */
    public boolean verifySortingA_To_Z(String CSSSelector, String ColumnName) {
        List<WebElement>  test    = DR.findElements(By.cssSelector(CSSSelector));    // 取得所有在這網頁底下的元素
        ArrayList<String> Sorted  = new ArrayList<String>();                         // 建立兩個新array list
        ArrayList<String> nonSort = new ArrayList<String>();                         // 一個放原本的結果,一個放程式排序後的結果
        String            temp;
        String            lowtempString;
        boolean           Result = true;

        for (int i = 0, l = test.size(); i < l;
                ++i)                                  // 利用迴圈把所有的元素的文字,並轉成小寫, 再照順序塞回前面建立的array list
        {
            temp          = test.get(i).getText();    // get element text
            lowtempString = temp.toLowerCase();       // 轉小寫
            Sorted.add(lowtempString);                // 塞回list
            nonSort.add(lowtempString);               // 塞回list
        }

        Collections.sort(Sorted);    // 把Sorted這個list 照1~9 a~z 排序

        if (nonSort.equals(Sorted)) {
            System.out.println("[-] Pass Sorting A-Z works correctly :" + ColumnName);
        }    // 比較兩個list
                else {
            Result = false;
            System.out.println("[X] Fail Sorting A-Z is wrong : " + ColumnName);
        }

        return Result;
    }

    /**
     * 使用前先把網頁上的排序按成z-a
     * 第一個參數給 一個 css selector, 第二個參數給column name<br>
     * 會檢查排序是否是照 Z~A,9~1 (不區分大小寫)<br>
     * 當測試all pass return true, 任何fail return false
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. biilean result = actions.verifySortingA_To_Z(CSSSelector,ColumnName);
     *
     */
    public boolean verifySortingZ_To_A(String CSSSelector, String ColumnName) {
        List<WebElement>  test    = DR.findElements(By.cssSelector(CSSSelector));    // 取得所有在這網頁底下的元素
        ArrayList<String> Sorted  = new ArrayList<String>();                         // 建立兩個新array list
        ArrayList<String> nonSort = new ArrayList<String>();                         // 一個放原本的結果,一個放程式排序後的結果
        String            temp;
        String            lowtempString;
        boolean           Result = true;

        for (int i = 0, l = test.size(); i < l;
                ++i)                                  // 利用迴圈把所有的元素的文字,並轉成小寫, 再照順序塞回前面建立的array list
        {
            temp          = test.get(i).getText();    // get element text
            lowtempString = temp.toLowerCase();       // 轉小寫
            Sorted.add(lowtempString);                // 塞回list
            nonSort.add(lowtempString);               // 塞回list
        }

        Collections.sort(Sorted, Collections.reverseOrder());    // 把Sorted這個list 照Z~A,9~1 排序

        if (nonSort.equals(Sorted)) {
            System.out.println("[-] Pass Sorting Z-A works correctly :" + ColumnName);
        }    // 比較兩個list
                else {
            Result = false;
            System.out.println("[X] Fail Sorting Z-A is wrong : " + ColumnName);
        }

        return Result;
    }

    /**
     * 在頁面完全讀完前會停住.
     * 最長loading time ＝30 秒
     */
    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(pageLoadCondition);
    }

    /**
     * 第一個參數給 web element<br>
     * Full example <br>
     * 1. adminReseller Page = new AdminReseller(DR);;<br>
     * 2. System.out.println(Page.Reseller_Code_Header_text());
     */
    public Boolean isElementDisplayed(WebElement element) throws IOException {
        return element.isDisplayed();
    }

    /**
     * 第一個參數給 網頁上element的文字  WebText<br>
     * 第二個參數給 網頁上element應該要顯示的文字 orgText <br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br> <br>
     * 2. actions.isEqualto(Page.Created_Header_text(),Page.org_Created_Header_text);
     */
    public Boolean isEqualto(String WebText, String orgText) throws IOException {
        return WebText.equals(orgText);
    }
    /**
     * String runID,String caseid,String record,String comment,String Passcomment <br>
     * if comment >0 set as fail and write comment into testrail<br>
     * if comment =0 set as pass and write Passcomment into testrail<br>
     * Full example <br>
     * 1. Actions actions = new Actions(DR);<br>
     * 2. actions.UpdateTestrail(runID,caseid, record, comment,Passcomment);
     */
    public void UpdateTestrail(String runID,String caseid,String record,String comment,String Passcomment) throws Exception, IOException, APIException{
      if (comment.length() != 0) {
        record = Run_API.FAILED;
        Run_API.setCaseResult(runID, caseid, record, comment);
    } else {
        Run_API.setCaseResult(runID, caseid, record, Passcomment);
    }
      
    }
    /**
     * actions.HoverElement(driver,elementToHover);
     */
    public void HoverElement(WebDriver driver,WebElement element){
     org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
      //action = new Actions(driver);
      ac.moveToElement(element).build().perform();
    }
    
}
