package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E14_Lobbies {
    public String[] ORGLobbyLabelList  = {
        "Lobbies Management", "Add Lobby", "Lobbies", "Reseller", "Lobby Template", "Search"
    };
    public String[] res_ORGLobbyLabelList  = {
        "Lobbies Management", "Add Lobby", "Lobbies", "Lobby Template", "Search"
    };
    public String[] ORGLobbyHeaderList = {
        "Lobby Name", "Lobby Template", "Reseller", "Type", "Description", "Status", "Created", "Updated", "Credential",
        "Manage"
    };
    public String[] res_ORGLobbyHeaderList = {
        "Lobby Name", "Lobby Template", "Type", "Description", "Status", "Created", "Updated", "Credential","Manage" };
    public WebDriver DR;

    public E14_Lobbies(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddLobbyBTN() {
        WebElement AddLobbyBTN =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.Lobbies.BtnAddLobby\"]"));

        return AddLobbyBTN;
    }

    public String AddLobbyBTN_text() {
        String AddLobbyBTN_text =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.Lobbies.BtnAddLobby\"]"))
              .getText();

        return AddLobbyBTN_text;
    }

    public WebElement Lobbies_inputfield() {
        WebElement Lobbies_inputfield = DR.findElement(By.cssSelector("[ng-model=\"vm.tableSettings.name\"]"));

        return Lobbies_inputfield;
    }

    public String Lobbies_text() {
        String Lobbies_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.Lobbies.LblLobbies\"]"))
                                .getText();

        return Lobbies_text;
    }

    public String LobbyManagement_Page_Header_text() {
        String LobbyManagement_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return LobbyManagement_Page_Header_text;
    }

    public WebElement LobbyTemplate_selector() {
        WebElement LobbyTemplate_selector =
            DR.findElement(By.cssSelector("[ng-model=\"vm.tableSettings.lobbyTemplateId\"]"));

        return LobbyTemplate_selector;
    }

    public String LobbyTemplate_text() {
        String LobbyTemplate_text =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.Lobbies.LblLobbyTemplate\"]"))
              .getText();

        return LobbyTemplate_text;
    }

    public WebElement Reseller_inputfield() {
        WebElement Reseller_inputfield = DR.findElement(By.cssSelector("[ng-model=\"vm.tableSettings.resellerName\"]"));

        return Reseller_inputfield;
    }

    public String Reseller_text() {
        String Reseller_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.Lobbies.LblReseller\"]"))
                                 .getText();

        return Reseller_text;
    }

    public WebElement SearchBTN_inputfield() {
        WebElement SearchBTN_inputfield =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnSearch\"]"));

        return SearchBTN_inputfield;
    }

    public String SearchBTN_text() {
        String SearchBTN_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnSearch\"]"))
                                  .getText();

        return SearchBTN_text;
    }
}
