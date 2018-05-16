package element;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

import driverpkg.*;

@SuppressWarnings("unused")

/**
 * All left side tree menu<br>
 * Skip 2 links<br>
 * 1. Ourea Transactions <br>
 * 2. Fishing Game Bet History<br>
 */
public class LeftSideTtreeMenu {
    
    public WebDriver DR;
    Actions          actions = new Actions(DR);
    public LeftSideTtreeMenu(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement API() {
        WebElement API = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkAPI']"));

        return API;
    }

    public WebElement ActivePlayers() {
        WebElement ActivePlayers =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkActivePlayers']"));

        return ActivePlayers;
    }

    public WebElement ActiveSessionSummary() {
        WebElement ActiveSessionSummary =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkFundTransferReport']"));

        return ActiveSessionSummary;
    }

    public WebElement Admin() {
        WebElement Admin = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkAdmin']"));

        return Admin;
    }

    public WebElement AdminUsers() {
        WebElement AdminUsers =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkUsers']"));

        return AdminUsers;
    }

    public WebElement Audit() {
        WebElement Audit = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkAudit']"));

        return Audit;
    }

    public WebElement BatchSettlement() {
        WebElement BatchSettlement =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBatchSettlement']"));

        return BatchSettlement;
    }

    public WebElement BetLimit() {
        WebElement BetLimit =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuBetLimit']"));

        return BetLimit;
    }

    public WebElement BetLimitData() {
        WebElement BetLimitData =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBetLimitData']"));

        return BetLimitData;
    }

    public WebElement BetLimitGroupList() {
        WebElement BetLimitGroupList =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBetLimitGroups']"));

        return BetLimitGroupList;
    }

    public WebElement BetLimitManagement() {
        WebElement BetLimitManagement =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBetLimitManagement']"));

        return BetLimitManagement;
    }

    public WebElement BonusSpin() {
        WebElement BonusSpin =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBonusSpin']"));

        return BonusSpin;
    }

    public WebElement BrandJackpotContribution() {
        WebElement BrandJackpotContribution =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBrandJackpotContribution']"));

        return BrandJackpotContribution;
    }

    public WebElement Brands() {
        WebElement Brands = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBrands']"));

        return Brands;
    }

    public WebElement Configurations() {
        WebElement Configurations =
            DR.findElement(
                By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkApplicationConfigurations']"));

        return Configurations;
    }

    public WebElement CreateSunBetBrand() {
        WebElement CreateSunBetBrand =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkSunbet']"));

        return CreateSunBetBrand;
    }

    public WebElement Currencies() {
        WebElement Currencies =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkCurrencies']"));

        return Currencies;
    }

    public WebElement DefaultBannerManagement() {
        WebElement DefaultBannerManagement =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkDefaultBanners']"));

        return DefaultBannerManagement;
    }

    public WebElement DemoUsers() {
        WebElement DemoUsers =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkDemoUsers']"));

        return DemoUsers;
    }

    public WebElement EndBalanceReport() {
        WebElement EndBalanceReport =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkEndBalanceReport']"));

        return EndBalanceReport;
    }

    public WebElement FailedEventOperations() {
        WebElement FailedEventOperations =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkFailedEventOperations']"));

        return FailedEventOperations;
    }

    public WebElement FailedProxyWalletOperations() {
        WebElement FailedProxyWalletOperations =
            DR.findElement(
                By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkFailedProxyWalletOperations']"));

        return FailedProxyWalletOperations;
    }

    public WebElement FraudCheckReport() {
        WebElement FraudCheckReport =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextFraudCheckReport']"));

        return FraudCheckReport;
    }

    public WebElement FundTransfer() {
        WebElement FundTransfer =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkFundTransferReport']"));

        return FundTransfer;
    }

    public WebElement Game() {
        WebElement Game = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextGame']"));

        return Game;
    }

    public WebElement GameProvider() {
        WebElement GameProvider =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkGameProvider']"));

        return GameProvider;
    }

    public WebElement GameProviders() {
        WebElement GameProviders =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkGameProviders']"));

        return GameProviders;
    }

    public WebElement GameSpecifications() {
        WebElement GameSpecifications =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkGameSpec']"));

        return GameSpecifications;
    }

    public WebElement GameTags() {
        WebElement GameTags =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkGameTags']"));

        return GameTags;
    }

    public WebElement GameTypes() {
        WebElement GameTypes =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkGameTypes']"));

        return GameTypes;
    }

    public WebElement Jackpot() {
        WebElement Jackpot = DR.findElement(By.xpath("//*/li[4]/ul/li[2]/a/span"));

        return Jackpot;
    }

    public WebElement JackpotDetailedReport() {
        WebElement JackpotDetailedReport =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkJackpotDetailedReport']"));

        return JackpotDetailedReport;
    }

    public WebElement JackpotPoolPerformance() {
        WebElement JackpotPoolPerformance =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkJackpotPoolPerformance']"));

        return JackpotPoolPerformance;
    }

    public WebElement JackpotReport() {
        WebElement JackpotReport =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextJackpotReport']"));

        return JackpotReport;
    }

    public WebElement Languages() {
        WebElement Languages =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLanguages']"));

        return Languages;
    }

    public WebElement Licensee() {
        WebElement Licensee =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextLicensee']"));

        return Licensee;
    }

    public WebElement LicenseeUser() {
        WebElement LicenseeUser =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLicenseeUsers']"));

        return LicenseeUser;
    }

    public WebElement Licensees() {
        WebElement Licensees =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLicensees']"));

        return Licensees;
    }

    public WebElement Lobbies() {
        WebElement Lobbies = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLobbies']"));

        return Lobbies;
    }

    public WebElement Lobby() {
        WebElement Lobby = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextLobby']"));

        return Lobby;
    }

    public WebElement LobbyTemplates() {
        WebElement LobbyTemplates =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLobbyTemplates']"));

        return LobbyTemplates;
    }

    public WebElement LocalCache() {
        WebElement LocalCache =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkLocalCache']"));

        return LocalCache;
    }

    public WebElement Log() {
        WebElement Log = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextLog']"));

        return Log;
    }

    public WebElement Log_System() {
        WebElement Log_System = DR.findElement(By.xpath("//*/li[7]/ul/li[3]/a/span"));

        return Log_System;
    }

    public WebElement Maintenance() {
        WebElement Maintenance =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkMaintenance']"));

        return Maintenance;
    }

    public WebElement Marketing() {
        WebElement Marketing =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextMarketing']"));

        return Marketing;
    }

    public WebElement OpenRounds() {
        WebElement OpenRounds =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkOpenRounds']"));

        return OpenRounds;
    }

    public WebElement Overall() {
        WebElement Overall = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkOverall']"));

        return Overall;
    }

    public WebElement PlayerSessionReport() {
        WebElement PlayerSessionReport =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkPlayerSession']"));

        return PlayerSessionReport;
    }

    public WebElement PlayerWinLossByIP() {
        WebElement PlayerWinLossByIP =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkWinLossByIp']"));

        return PlayerWinLossByIP;
    }

    public WebElement Players() {
        WebElement Players = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkPlayers']"));

        return Players;
    }

    public WebElement Report() {
        WebElement Report =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextReport']"));

        return Report;
    }

    public WebElement Report_Jackpot() {
        WebElement Report_Jackpot = DR.findElement(By.xpath("//*/li[8]/ul/li[4]/a/span"));

        return Report_Jackpot;
    }

    public WebElement Reseller() {
        WebElement Reseller =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.MenuTextReseller']"));

        return Reseller;
    }

    public WebElement ResellerUser() {
        WebElement Resellers =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkResellerUsers']"));

        return Resellers;
    }

    public WebElement Resellers() {
        WebElement Resellers =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkResellers']"));

        return Resellers;
    }

    public WebElement Rounds() {
        WebElement Rounds = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkRounds']"));

        return Rounds;
    }

    public WebElement SunbetCredit() {
        WebElement SunbetCredit =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkSunbetCredit']"));

        return SunbetCredit;
    }

    public WebElement System_Main_Menu() {
        WebElement System_Main_Menu = DR.findElement(By.xpath("//*/div[1]/ul/li[11]/a/span"));

        return System_Main_Menu;
    }

    public WebElement System_Report() {
        WebElement System_Report =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkReport']"));

        return System_Report;
    }

    public WebElement Tokens() {
        WebElement Tokens = DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkTokens']"));

        return Tokens;
    }

    public WebElement WhitelistIPs() {
        WebElement WhitelistIPs =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkWhitelists']"));

        return WhitelistIPs;
    }
}
