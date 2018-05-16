package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

public class E13_Jackpot {
    public String[]  ORGJackpotManagementLabelList  = {
        "Jackpot Management", "Jackpot", "Game Provider", "Jackpot ID", "Jackpot Name", "Search", "All Winners", "Reset"
    };
    public String[]  ORGJackpotManagementHeaderList = {
        "Game Provider", "Jackpot ID", "Jackpot Name", "Description", "Total Contributed Amount", "Status", "Details"
    };
   
    public WebDriver DR;
    Actions          actions                        = new Actions(DR);
    public E13_Jackpot(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AllWinnersBTN() {
        WebElement AllWinnersBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.LblAllWinners']"));

        return AllWinnersBTN;
    }

    public String AllWinnersBTN_text() {
        String AllWinnersBTN_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.LblAllWinners']"))
                                      .getText();

        return AllWinnersBTN_text;
    }

    public WebElement BrandContributionBTN() {
        WebElement BrandContributionBTN = DR.findElement(By.xpath("//*/table/tbody/tr[1]/td[9]/div/button"));

        return BrandContributionBTN;
    }

    public WebElement BrandContributionTAB() {
        WebElement BrandContributionTAB = DR.findElement(By.xpath("//*/ui-view/div/ul/li[3]/a"));

        return BrandContributionTAB;
    }

    public WebElement CloseGameListBTN() {
        WebElement CloseGameListBTN =
            DR.findElement(By.cssSelector("[translate-attr-title='Resources.UI.Form.BtnClose']"));

        return CloseGameListBTN;
    }

    public WebElement CloseManageJackpotBTN() {
        WebElement CloseManageJackpotBTN = DR.findElement(By.cssSelector(".fa.fa-times.fa-2x"));

        return CloseManageJackpotBTN;
    }

    public WebElement GameListBTN() {
        WebElement GameListBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.BtnGameList']"));

        return GameListBTN;
    }

    public WebElement GameList_Header() {
        WebElement GameList_Header = DR.findElement(By.cssSelector("h3"));

        return GameList_Header;
    }

    public WebElement GameProvider_Selector() {
        WebElement GameProvider_Selector = DR.findElement(By.cssSelector("[ng-model='vm.settings.gameProvider']"));

        return GameProvider_Selector;
    }

    public String GameProvider_text() {
        String GameProvider_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.LblGameProvider']"))
                                     .getText();

        return GameProvider_text;
    }

    public WebElement JackpotID_InputField() {
        WebElement JackpotID_InputField = DR.findElement(By.cssSelector("[ng-model='vm.settings.jackpotExternalId']"));

        return JackpotID_InputField;
    }

    public String JackpotID_text() {
        String JackpotID_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.LblJackpotID']"))
                                  .getText();

        return JackpotID_text;
    }

    public String JackpotManagement_Page_Header_text() {
        String GJackpotManagement_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return GJackpotManagement_Page_Header_text;
    }

    public WebElement JackpotName_InputField() {
        WebElement JackpotName_InputField = DR.findElement(By.cssSelector("[ng-model='vm.settings.jackpotName']"));

        return JackpotName_InputField;
    }

    public String JackpotName_text() {
        String JackpotName_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.LblJackpotName']"))
                                    .getText();

        return JackpotName_text;
    }

    public WebElement JackpotPoolsBTN() {
        WebElement JackpotPoolsBTN =
            DR.findElement(By.cssSelector("tr:nth-child(1) > td.ng-scope > div:nth-child(1) > button"));

        return JackpotPoolsBTN;
    }

    public WebElement JackpotPoolsTAB() {
        WebElement JackpotPoolsTAB = DR.findElement(By.xpath("//*/ui-view/div/ul/li[2]/a"));

        return JackpotPoolsTAB;
    }

    public String JackpotTab_text() {
        String JackpotTab_text = DR.findElement(By.cssSelector("ui-view > div > ul > li > a > span")).getText();

        return JackpotTab_text;
    }

    public WebElement ManageJackpotBTN() {
        WebElement ManageJackpotBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Jackpot.BtnManageJackpot']"));

        return ManageJackpotBTN;
    }

    public WebElement ManageJackpot_Header() {
        WebElement ManageJackpot_Header = DR.findElement(By.cssSelector("h3"));

        return ManageJackpot_Header;
    }

    public WebElement ResetBTN() {
        WebElement ResetBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Form.BtnReset']"));

        return ResetBTN;
    }

    public String ResetBTN_text() {
        String ResetBTN_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Form.BtnReset']")).getText();

        return ResetBTN_text;
    }

    public WebElement SearchBTN() {
        WebElement SearchBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return SearchBTN;
    }

    public String SearchBTN_text() {
        String SearchBTN_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']")).getText();

        return SearchBTN_text;
    }
}
