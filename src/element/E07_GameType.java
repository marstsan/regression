package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class E07_GameType {
    public String    org_GameTypeManagement_Page_Header_text = "Game Type Management";
    public String    org_GameTypes_Tab_text                  = "Game Types";
    public String    org_Id_Header                           = "Id";
    public String    org_Name_Header                         = "Name";
    public String[]  ORGGameTypesLabelList                   = { "Game Type Management", "Game Types" };
    public String[]  ORGGameTypesHeaderList                  = { "Id", "Name" };
   
    public WebDriver DR;

    public E07_GameType(WebDriver driver) {
        this.DR = driver;
    }

    public String GameTypeManagement_Page_Header_text() {
        String GameTypeManagement_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return GameTypeManagement_Page_Header_text;
    }

    public String GameTypes_Tab_text() {
        String GameTypes_Tab_text = DR.findElement(By.cssSelector("[ui-sref='admin.game.gametypes.gametypes']"))
                                      .getText();

        return GameTypes_Tab_text;
    }

    public String Id_Header() {
        String Id_Header = DR.findElement(By.cssSelector("th.header.sortable.sort-asc > div")).getText();

        return Id_Header;
    }

    public String Name_Header() {
        String Name_Header = DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(2)")).getText();

        return Name_Header;
    }
}
