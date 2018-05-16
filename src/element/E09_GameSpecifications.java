package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class E09_GameSpecifications {
    public String[]  ORGGameSpecificationsLabelList  = {
        "Game Specification Management Export", "Export", "Import", "Game Provider", "Game Name", "Search", "Export"
    };
    public String[]  ORGGameSpecificationsHeaderList = { "Game Provider", "Game Type", "Platform", "GameName" };
    public WebDriver DR;

    public E09_GameSpecifications(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement ExportBTN() {
        WebElement ExportBTN = DR.findElement(By.cssSelector("div.btn-group.btn-overlap.ng-scope > button"));

        return ExportBTN;
    }

    public String ExportBTN_text() {
        String ExportBTN_text = DR.findElement(By.cssSelector("div.btn-group.btn-overlap.ng-scope > button")).getText();

        return ExportBTN_text;
    }

    public String ExportTab_text() {
        String ExportTab_text = DR.findElement(By.cssSelector("[ui-sref='admin.game.spec.export']")).getText();

        return ExportTab_text;
    }

    public WebElement GameName_inputfield() {
        WebElement GameName_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.gameName']"));

        return GameName_inputfield;
    }

    public String GameName_text() {
        String GameName_text = DR.findElement(By.cssSelector("label:nth-child(2) > span.input-group-addon")).getText();

        return GameName_text;
    }

    public WebElement GameProvider_Selector() {
        WebElement GameProviderCode_inputfield =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.gameProviderId']"));

        return GameProviderCode_inputfield;
    }

    public WebElement GameProvider_Selector_option_RT() {
        WebElement GameProvider_Selector_option_RT = DR.findElement(By.cssSelector("[label='Red Tiger']"));

        return GameProvider_Selector_option_RT;
    }

    public String GameProvider_text() {
        String ImportTab_text = DR.findElement(By.cssSelector("label:nth-child(1) > span.input-group-addon")).getText();

        return ImportTab_text;
    }

    public String GameSpecifications_Page_Header_text() {
        String GameSpecifications_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return GameSpecifications_Page_Header_text;
    }

    public String ImportTab_text() {
        String ImportTab_text = DR.findElement(By.cssSelector("[ui-sref='admin.game.spec.import']")).getText();

        return ImportTab_text;
    }

    public WebElement SearchBTN() {
        WebElement SearchBTN = DR.findElement(By.cssSelector("[ng-click='vm.doSearch()']"));

        return SearchBTN;
    }

    public String SearchBTN_text() {
        String SearchBTN_text = DR.findElement(By.cssSelector("[ng-click='vm.doSearch()']")).getText();

        return SearchBTN_text;
    }

    public WebElement UploadBTN() {
        WebElement ExportBTN = DR.findElement(By.cssSelector("[ng-click='vm.upload()']"));

        return ExportBTN;
    }

    public String UploadBTN_text() {
        String UploadBTN_text = DR.findElement(By.cssSelector("[ng-click='vm.upload()']")).getText();

        return UploadBTN_text;
    }
}
