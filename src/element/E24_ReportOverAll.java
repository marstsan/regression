package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E24_ReportOverAll {
    public String[] ORGSLabel = {
        "Overall Performance", "Time Period", "Player Type", "Reseller", "Licensee", "Brand", "Currency",
        "Game Provider", "Platform", "Game Type", "Brand Status", "Search", "Export", "Reset"
    };
    public String[] ORGTableHeader = {
        "No.","Reseller", "Licensee", "Brand", "Currency", "Players", "Rounds", "Bet Amount", "Turnover", "Valid Bets",
        "Jackpot Contribution", "Company Win/Loss", "Company Win/Loss %", "Detail"
    };
    public WebDriver DR;

    public E24_ReportOverAll(WebDriver driver) {
        this.DR = driver;
    }

    public String BrandStatus_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblBrandStatus\"]")).getText();
    }

    public String Brand_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblBrand\"]")).getText();
    }

    public String Currency_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblCurrency\"]")).getText();
    }

    public WebElement ExportBTN() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.BtnExport\"]"));
    }

    public String GameProvider_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblGameProvider\"]")).getText();
    }

    public String GameType_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblGameType\"]")).getText();
    }

    public String Licensee_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblLicensee\"]")).getText();
    }

    public String Platform_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblPlatform\"]")).getText();
    }

    public WebElement PlayerTypeSelector() {
        return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.testPlayerFilterType\"]"));
    }

    public String PlayerType_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblPlayerType\"]")).getText();
    }

    public WebElement ResellerSelector() {
        return DR.findElement(By.cssSelector("div:nth-child(4) > div > div.ng-isolate-scope > span > button"));
    }

    public WebElement ResellerSelectorOption() {
        return DR.findElement(
            By.cssSelector(
                "div:nth-child(4) > div > div.ng-isolate-scope > span > div > div.checkBoxContainer > div:nth-child(1) > div > label > span"));
    }

    public WebElement ResellerSelectorSeasrchfield() {
        return DR.findElement(
            By.cssSelector(
                "div:nth-child(4) > div > div.ng-isolate-scope > span > div > div.helperContainer.ng-scope > div:nth-child(2) > input"));
    }

    public String Reseller_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.Overall.LblReseller\"]")).getText();
    }

    public String ResetBTN_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnReset\"]")).getText();
    }

    public WebElement SearchBTN() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnSearch\"]"));
    }

    public String SearchBTN_text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnSearch\"]")).getText();
    }

    public String TimePeriod_Text() {
        return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();
    }
    public String OverAllPageHeader_text() {
      return DR.findElement(By.cssSelector("h1")).getText();
  }
}
