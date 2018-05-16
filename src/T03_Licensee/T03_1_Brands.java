package T03_Licensee;
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
import element.E15_LobbyTemplate;

@SuppressWarnings("unused")
public class T03_1_Brands {
  private static WebDriver         driver;
  private static Actions           actions;
  private static E15_LobbyTemplate     LobbyTemplatepage;
  private static LeftSideTtreeMenu TreeMenu;

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
      String  caseid      = "96234";
      String  Passcomment = "";

      try {
          Thread.sleep(4000);

          WebElement Sortbutton =
              driver.findElement(
                  By.xpath(
                      "//*[@id=\"main-container\"]/div[2]/div/div[2]/div/div/ui-view/div/div[2]/table/thead/tr[1]/th[1]/div"));

          actions.clickElement(Sortbutton);
          Thread.sleep(4000);

          boolean z2a = actions.verifySortingZ_To_A("div.table-responsive > table > tbody > tr> td:nth-child(1)",
                                                    "Lobby Template Name");
          WebElement sortbutton02 =
              driver.findElement(
                  By.xpath(
                      "//*[@id=\"main-container\"]/div[2]/div/div[2]/div/div/ui-view/div/div[2]/table/thead/tr[1]/th[1]/div/span"));

          actions.clickElement(sortbutton02);
          Thread.sleep(4000);

          boolean a2z = actions.verifySortingA_To_Z("div.table-responsive > table > tbody > tr> td:nth-child(1)",
                                                    "Lobby Template Name");

          if (z2a == false) {
              comment = comment + "Sort Z to A is wrong, ";
          } else {
              Passcomment = Passcomment + "[-] Pass Sorting Z-A works correctly :Lobby Template Name ";
          }

          if (a2z == false) {
              comment = comment + "Sort A to Z is wrong, ";
          } else {
              Passcomment = Passcomment + "[-] Pass Sorting A-Z works correctly :Lobby Template Name ";
          }
      } catch (Exception e) {
          comment = comment + "Error when try to verify sorting function of Lobby Template page";
      }





      if (comment.length() != 0) {
          record = Run_API.FAILED;
          Run_API.setCaseResult(runID, caseid, record, comment);
      } else {
          Run_API.setCaseResult(runID, caseid, record, Passcomment);
      }
  }

  @BeforeClass
  public static void setUp() throws Exception {
      Properties env = new Properties();

      try {
          env.load(new FileInputStream("./resource/env.properties"));
      } catch (IOException e) {
          e.printStackTrace();
      }

      String AdminPortalURL = env.getProperty("AdminPortalURL");
      String adminUser      = env.getProperty("adminUser");
      String adminUserPwd   = env.getProperty("adminUserPwd");

      driver            = new CreateDriver().getDriver();
      actions           = new Actions(driver);
      LobbyTemplatepage = new E15_LobbyTemplate(driver);
      TreeMenu          = new LeftSideTtreeMenu(driver);
      driver.get(AdminPortalURL);
      Thread.sleep(3000);
      driver.findElement(By.id("username")).sendKeys(adminUser);
      driver.findElement(By.id("password")).sendKeys(adminUserPwd + Keys.ENTER);
      Thread.sleep(3000);
      TreeMenu.Lobby().click();
      Thread.sleep(1000);
      TreeMenu.LobbyTemplates().click();
      Thread.sleep(3000);
  }
}
