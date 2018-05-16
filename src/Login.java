import java.io.FileInputStream;
import java.io.IOException;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.collections.transformation.SortedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gurock.testrail.APIException;

import BasicAction.Actions;

import Components.Case_API;
import Components.PlanCreation_API;
import Components.Plan_API_Clean;
import Components.Run_API;

import driverpkg.CreateDriver;

//import driverpkg.*;
import element.E01_Resellers;

import element.E01_Resellers.*;

import element.LeftSideTtreeMenu;

@SuppressWarnings("unused")
public class Login {
    public static void main(String[] args) throws InterruptedException, IOException {
        Properties env = new Properties();

        try {
            env.load(new FileInputStream("./resource/env.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String            AdminPortalURL = env.getProperty("AdminPortalURL");
        String            adminUser      = env.getProperty("adminUser");
        String            adminUserPwd   = env.getProperty("adminUserPwd");
        WebDriver         driver         = new CreateDriver().getDriver();
        E01_Resellers     resellerPage   = new E01_Resellers(driver);
        Actions           actions        = new Actions(driver);
        LeftSideTtreeMenu TreeMenu       = new LeftSideTtreeMenu(driver);

        driver.manage().window().fullscreen();
        driver.get(AdminPortalURL);
        Thread.sleep(3000);

        // login admin portal as admin role
        driver.findElement(By.id("username")).sendKeys(adminUser);
        driver.findElement(By.id("password")).sendKeys(adminUserPwd + Keys.ENTER);
        Thread.sleep(5000);
        actions.VerifyTableHeader(resellerPage.ORGadminResellerTableHeader);

        /*
         * String comment = "Pass the test";
         * String record = Run_API.PASSED;
         * String runID = "27145";
         * String caseid = "96223";
         * Run_API.setCaseResult(runID, caseid, record, comment);
         * System.out.println(Plan_API_Clean.getLatestPlanID("62"));
         * Plan_API_Clean.DeletePlan(Plan_API_Clean.getLatestPlanID("62"));
         */
    }
}
