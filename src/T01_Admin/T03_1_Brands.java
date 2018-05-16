package T01_Admin;

import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BasicAction.Actions;
import Components.Run_API;
import driverpkg.CreateDriver;
import element.LeftSideTtreeMenu;
import element.E05_Brands;
import element.E15_LobbyTemplate;

@SuppressWarnings("unused")
public class T03_1_Brands {
  private static WebDriver              driver;
  private static Actions                actions;
  private static E05_Brands             BrandsPage;
  private static LeftSideTtreeMenu      TreeMenu;

  @AfterClass
  public static void cleanUp() {
      if (driver != null) {
          driver.close();
          driver.quit();
      }
  }

  @Test
  public void test() throws Exception {
    Properties env = new Properties();
    try {
        env.load(new FileInputStream("./resource/env.properties"));
    } catch (IOException e) {
        e.printStackTrace();
    }
      boolean result      ;
      String  comment     = "";
      String  record      = Run_API.PASSED;
      String  runID       = env.getProperty("runID");
      String  caseid      = "111950";
      String  Passcomment = "";

      try {
        result = actions.VerifyTableHeader(BrandsPage.lic_ORGBransHeaderList);
          if (result){Passcomment = Passcomment + "[-] Pass All table header displayed correctly, ";}
          else{comment = comment + "[X] Fail Table header displayed incorrectly, ";}
      } catch (Exception e) {
          comment = comment + "[X] Error when try to verify header, ";
      }
      try {
        String [] labellist = {BrandsPage.Brands_Page_Header_text(),BrandsPage.AddBrand_Button_text(),BrandsPage.BrandCode_text(),BrandsPage.BrandName_text(),BrandsPage.SearchBTN().getText()};
        result = actions.VerifyLables(labellist, BrandsPage.lic_ORGBransLabelList);
          if (result){Passcomment = Passcomment + "[-] Pass All label  displayed correctly, ";}
          else {comment = comment + "[X] Fail Label displayed incorrectly, ";}}
      catch (Exception e) {
            comment = comment + "[X] Error when try to verify Label, ";
        }  
      
      
        actions.UpdateTestrail(runID, caseid, record, comment, Passcomment);
  }

  @BeforeClass
  public static void setUp() throws Exception {
      Properties env = new Properties();

      try {
          env.load(new FileInputStream("./resource/env.properties"));
      } catch (IOException e) {
          e.printStackTrace();
      }

      String LicenseePortalURL = env.getProperty("LicenseePortalURL");
      String licenseeAdminUser      = env.getProperty("licenseeAdminUser");
      String SharePWD   = env.getProperty("SharePWD");
      String licenseeCode   = env.getProperty("licenseeCode");

      driver            = new CreateDriver().getDriver();
      actions           = new Actions(driver);
      BrandsPage        = new E05_Brands(driver);
      TreeMenu          = new LeftSideTtreeMenu(driver);
      driver.get(LicenseePortalURL);
      Thread.sleep(3000);
      driver.findElement(By.id("code")).sendKeys(licenseeCode);
      driver.findElement(By.id("username")).sendKeys(licenseeAdminUser);
      driver.findElement(By.id("password")).sendKeys(SharePWD + Keys.ENTER);
      Thread.sleep(3000);

  }
}
