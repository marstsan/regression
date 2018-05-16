package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E15_LobbyTemplate {
    public String[] ORGLobbyTemplateLabelList = { "Lobby Templates Management", "Lobby Templates",
                                                  "Add Lobby Template" };
    public String[]  ORGLobbyTemplateHeaderList = {
        "Lobby Template Name", "Type", "Description", "Status", "Created", "Updated", "Manage"
    };
    public WebDriver DR;

    public E15_LobbyTemplate(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddLobbyTemplateBTN() {
        WebElement AddLobbyTemplateBTN =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.LobbyTemplates.BtnAddLobbyTemplate\"]"));

        return AddLobbyTemplateBTN;
    }

    public String AddLobbyTemplateBTN_text() {
        String AddLobbyTemplateBTN_text =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.LobbyTemplates.BtnAddLobbyTemplate\"]"))
              .getText();

        return AddLobbyTemplateBTN_text;
    }

    public WebElement AddLobbyTemplate_Page_Header() {
        WebElement AddLobbyTemplate_Page_Header = DR.findElement(By.cssSelector("h1"));

        return AddLobbyTemplate_Page_Header;
    }

    public String AddLobbyTemplate_Page_Header_text() {
        String AddLobbyTemplate_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return AddLobbyTemplate_Page_Header_text;
    }

    public WebElement CancelAddLobbyTemplateBTN() {
        WebElement CancelAddLobbyTemplateBTN = DR.findElement(By.cssSelector("[class='btn btn-cancel']"));

        return CancelAddLobbyTemplateBTN;
    }

    public WebElement CancelEditLobbyTemplateBTN() {
        WebElement CancelEditLobbyTemplateBTN = DR.findElement(By.cssSelector("[class='btn btn-cancel']"));

        return CancelEditLobbyTemplateBTN;
    }

    public WebElement EditLobbyTemplate_Page_Header() {
        WebElement EditLobbyTemplate_Page_Header = DR.findElement(By.cssSelector("h1"));

        return EditLobbyTemplate_Page_Header;
    }

    public String EditLobbyTemplate_Page_Header_text() {
        String EditLobbyTemplate_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return EditLobbyTemplate_Page_Header_text;
    }

    public String LobbyTemplates_Page_Header_text() {
        String LobbyTemplates_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return LobbyTemplates_Page_Header_text;
    }

    public String LobbyTemplates_tab_text() {
        String LobbyTemplates_tab_text =
            DR.findElement(By.cssSelector("[translate=\"Resources.UI.Game.LobbyTemplates.SubTitle\"]"))
              .getText();

        return LobbyTemplates_tab_text;
    }

    public WebElement ManageLobbyTemplateBTN() {
        WebElement ManageLobbyTemplateBTN =
            DR.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.mng > button"));

        return ManageLobbyTemplateBTN;
    }
}
