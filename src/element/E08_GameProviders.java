package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class E08_GameProviders {
    public String[] ORGGameProvidersLabelList = {
        "Game Provider Management", "Game Provider Code", "Game Provider Name", "Search", "Lobby Icon",
        "Add Game Provider"
    };
    public String[] res_ORGGameProvidersLabelList = {
        "Game Provider Management", "Game Provider Code", "Game Provider Name", "Search"
    };
    public String[] ORGGameProvidersrHeaderList = {
        "Game Provider Code", "Game Provider Name", "Status", "Description", "Configurations Manage", "Updated",
        "Manage"
    };
    public String[] res_ORGGameProvidersrHeaderList = {
        "Game Provider Code", "Game Provider Name", "Status", "Description",  "Updated", "Manage" };
    public WebDriver DR;

    public E08_GameProviders(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddGameProviderBTN() {
        WebElement AddGameProviderBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.BtnAddGameProvider']"));

        return AddGameProviderBTN;
    }

    public String AddGameProviderBTN_text() {
        String AddGameProviderBTN_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.BtnAddGameProvider']"))
              .getText();

        return AddGameProviderBTN_text;
    }

    public WebElement AddGameProvider_Header() {
        WebElement AddGameProvider_Header = DR.findElement(By.cssSelector("h1"));

        return AddGameProvider_Header;
    }

    public WebElement BackToGameProvidersBTN() {
        WebElement BackToGameProvidersBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.BtnBackToGameProviders']"));

        return BackToGameProvidersBTN;
    }

    public WebElement CancelAddGameProviderBTN() {
        WebElement CancelAddGameProviderBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Game.ProviderEdit.BtnCancel']"));

        return CancelAddGameProviderBTN;
    }

    public WebElement EditGameProviderBTN() {
        WebElement EditGameProviderBTN = DR.findElement(By.cssSelector("[ng-if='vm.permission.Update']"));

        return EditGameProviderBTN;
    }

    public WebElement EditGameProvider_header() {
        WebElement EditGameProvider_header = DR.findElement(By.cssSelector("h1"));

        return EditGameProvider_header;
    }

    public WebElement GameProviderCode_inputfield() {
        WebElement GameProviderCode_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.code']"));

        return GameProviderCode_inputfield;
    }

    public String GameProviderCode_text() {
        String GameProviderCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.LblGameProviderCode']"))
              .getText();

        return GameProviderCode_text;
    }

    public WebElement GameProviderName_inputfield() {
        WebElement GameProviderName_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.name']"));

        return GameProviderName_inputfield;
    }

    public String GameProviderName_text() {
        String GameProviderName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.LblGameProviderName']"))
              .getText();

        return GameProviderName_text;
    }

    public String GameProviders_Page_Header_text() {
        String GameProviders_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return GameProviders_Page_Header_text;
    }

    public WebElement GamesBTN() {
        WebElement GamesBTN = DR.findElement(By.cssSelector("[ng-if='vm.permission.CanViewGames']"));

        return GamesBTN;
    }

    public WebElement Games_header() {
        WebElement Games_header = DR.findElement(By.cssSelector("h1"));

        return Games_header;
    }

    public WebElement LobbyIconBTN() {
        WebElement LobbyIconBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.BtnLobbyIcons']"));

        return LobbyIconBTN;
    }

    public String LobbyIconBTN_text() {
        String LobbyIconBTN_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Game.Provider.BtnLobbyIcons']"))
              .getText();

        return LobbyIconBTN_text;
    }

    public WebElement LobbyIcon_Header() {
        WebElement LobbyIcon_Header = DR.findElement(By.cssSelector("h1"));

        return LobbyIcon_Header;
    }

    public WebElement OKLobbyIconBTN() {
        WebElement OKLobbyIconBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnOk']"));

        return OKLobbyIconBTN;
    }

    public WebElement SaveEditGameProviderBTN() {
        WebElement SaveEditGameProviderBTN =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Game.ProviderEdit.BtnSave']"));

        return SaveEditGameProviderBTN;
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
