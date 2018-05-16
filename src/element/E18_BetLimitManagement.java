package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E18_BetLimitManagement {
    public String[] ORGLobbyLabelList  = {
        "Lobbies Management", "Add Lobby", "Lobbies", "Reseller", "Lobby Template", "Search"
    };
    public String[] ORGLobbyHeaderList = {
        "Lobby Name", "Lobby Template", "Reseller", "Type", "Description", "Status", "Created", "Updated", "Credential",
        "Manage"
    };
    public WebDriver DR;

    public E18_BetLimitManagement(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement BetLimitGroup_Selector() {
        WebElement BetLimitGroup_Selector =
            DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.betLimitGroupId\"]"));

        return BetLimitGroup_Selector;
    }

    public String BetLimitManagement_Page_Header_text() {
        String BetLimitManagement_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return BetLimitManagement_Page_Header_text;
    }

    public WebElement Currency_BTN() {
        WebElement Currency_BTN =
            DR.findElement(By.cssSelector("label:nth-child(3) > div.ng-isolate-scope > span > button"));

        return Currency_BTN;
    }

    public WebElement Currency_BTN_option() {
        WebElement Currency_BTN_option =
            DR.findElement(
                By.cssSelector(
                    "label:nth-child(3) > div.ng-isolate-scope > span > div > div.checkBoxContainer > div:nth-child(2)"));

        return Currency_BTN_option;
    }

    public WebElement DisplayBetLimitSetBy_Selector() {
        WebElement DisplayBetLimitSetBy_Selector =
            DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.displayBy\"]"));

        return DisplayBetLimitSetBy_Selector;
    }

    public String DisplayBetLimitSetBy_text() {
        String DisplayBetLimitSetBy_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.BetLimit.BetLimitManagement.LblDisplayBy']"))
              .getText();

        return DisplayBetLimitSetBy_text;
    }

    public WebElement GameProvider_BTN() {
        WebElement GameProvider_BTN =
            DR.findElement(By.cssSelector("label:nth-child(2) > div.ng-isolate-scope > span > button"));

        return GameProvider_BTN;
    }

    public WebElement GameProvider_BTN_option() {
        WebElement GameProvider_BTN =
            DR.findElement(
                By.cssSelector(
                    "label:nth-child(2) > div.ng-isolate-scope > span > div > div.checkBoxContainer > div:nth-child(2)"));

        return GameProvider_BTN;
    }
    public WebElement BetLimitGroup_selector01() {
      WebElement BetLimitGroup_selector01 =
          DR.findElement(
              By.cssSelector(
                  "[ng-model=\"vm.fetchingFilters.betLimitGroupId\"]"));

      return BetLimitGroup_selector01;
  }
    public String SearchResult01() {
      String SearchResult01 =
          DR.findElement(
              By.cssSelector(
                  "div.row.tableTools-container.assoc-betlimitgroup > div")).getText();

      return SearchResult01;
  }

    public WebElement Search_BTN() {
        WebElement Search_BTN =
            DR.findElement(
                By.cssSelector(
                    "div.btn-group.btn-overlap > button"));

        return Search_BTN;
    }
}
