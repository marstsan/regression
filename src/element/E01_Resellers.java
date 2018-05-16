package element;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.generic.NEW;

import BasicAction.Actions;

import driverpkg.*;

//import tools.general.BasicACtion.*;
@SuppressWarnings("unused")
public class E01_Resellers {
    public String org_Reseller_Page_Title_text      = "TGP Back Office";
    public String org_Reseller_Page_Header_text     = "Reseller Management";
    public String org_Add_Reseller_Button_text      = "Add Reseller";
    public String org_Reseller_Code_Filter_text     = "Reseller Code";
    public String org_Reseller_Name_Filter_text     = "Reseller Name";
    public String org_Reseller_Search_Button_text   = "Search";
    public String org_Reseller_Code_Header_text     = "Reseller Code";
    public String org_Reseller_Name_Header_text     = "Reseller Name";
    public String org_Description_Header_text       = "Description";
    public String org_Operational_Email_Header_text = "Operational Email";
    public String org_Status_Header_text            = "Status";
    public String org_Created_Header_text           = "Created";
    public String org_Update_Header_text            = "Updated";
    public String org_Credential_Header_text        = "Credential";

    // public String[] ORGadminResellerTableHeader = {"Reseller Code","Reseller Name","Description","Operational Email","Status","Created","Updated","Credential"};
    public String[] ORGadminResellerTableHeader = {
        "Reseller Code", "Reseller Name", "Description", "Operational Email", "Status", "Created", "Updated",
        "Credential"
    };
    public String[] ORGadminResellerLableList = { "Reseller Management", "Add Reseller", "Reseller Code",
                                                  "Reseller Name", "Search" };
    

    // public static final String[] Reseller_Code_Filter_text = null;
    public WebDriver DR;
    Actions actions = new Actions(DR);
    public E01_Resellers(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddUser() {
        WebElement AddUser =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.BtnAddUser']"));

        return AddUser;
    }

    public WebElement AddUser_close_button() {
        WebElement AddUser_close_button = DR.findElement(By.cssSelector(".modal-header > a > i"));

        return AddUser_close_button;
    }

    public String AddUser_text() {
        WebElement AddUser =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.BtnAddUser']"));
        String AddUser_text = AddUser.getText();

        return AddUser_text;
    }

    public WebElement Add_Reseller_Button() {
        WebElement Add_Reseller_Button = DR.findElement(By.cssSelector("#create"));

        return Add_Reseller_Button;
    }

    public String Add_Reseller_Button_text() {
        WebElement Add_Reseller_Button      = DR.findElement(By.cssSelector("#create"));
        String     Add_Reseller_Button_text = Add_Reseller_Button.getText();

        return Add_Reseller_Button_text;
    }

    public WebElement Add_Reseller_Cancel() {
        WebElement Add_Reseller_Cancel = DR.findElement(By.cssSelector("[class='btn btn-cancel ng-binding']"));

        return Add_Reseller_Cancel;
    }

    public WebElement Add_Reseller_Save() {
        WebElement Add_Reseller_Save =
            DR.findElement(By.cssSelector("[class='btn btn-primary btn-ok ng-binding ng-scope']"));

        return Add_Reseller_Save;
    }

    public WebElement Created_Header() {
        WebElement Created_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(6) > div > span"));

        return Created_Header;
    }

    public String Created_Header_text() {
        WebElement Created_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(6) > div > span"));
        String Created_Header_text = Created_Header.getText();

        return Created_Header_text;
    }

    public WebElement Credential_Header() {
        WebElement Credential_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(7) > div > span"));

        return Credential_Header;
    }

    public String Credential_Header_text() {
        WebElement Credential_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(7) > div > span"));
        String Credential_Header_text = Credential_Header.getText();

        return Credential_Header_text;
    }

    public WebElement Description_Header() {
        WebElement Description_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(3) > div > span"));

        return Description_Header;
    }

    public String Description_Header_text() {
        WebElement Description_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(3) > div > span"));
        String Description_Header_text = Description_Header.getText();

        return Description_Header_text;
    }

    public WebElement Edit_Reseller_Button() {
        WebElement Edit_Reseller_Button = DR.findElement(By.cssSelector("#edit"));

        return Edit_Reseller_Button;
    }

    public WebElement Maanage_button() throws Exception {

        // WebElement Maanage_button = DR.findElement(By.xpath("//table/tbody/tr[1]/td[11]/button"));
        WebElement Maanage_button = actions.FindAndWait("//table/tbody/tr[1]/td[11]/button", DR);

        return Maanage_button;
    }

    public WebElement Operational_Email_Header() {
        WebElement Operational_Email_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(4) > div > span"));

        return Operational_Email_Header;
    }

    public String Operational_Email_Header_text() {
        WebElement Operational_Email_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(4) > div > span"));
        String Operational_Email_Header_text = Operational_Email_Header.getText();

        return Operational_Email_Header_text;
    }

    public WebElement PassWord_input() throws Exception {
        WebElement PassWord_input = actions.FindAndWait("#password", DR);

        return PassWord_input;
    }

    public WebElement Records_button() {
        WebElement Records_button = DR.findElement(By.xpath("//table/tbody/tr[1]//a[@title='View Login Records']/i"));

        return Records_button;
    }

    public WebElement Reseller_Code_Filter() {
        WebElement Reseller_Code_Filter = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.code']"));

        return Reseller_Code_Filter;
    }

    public String Reseller_Code_Filter_text() {
        WebElement Reseller_Code_Filter =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.Resellers.LblResellerCode']"));
        String Reseller_Code_Filter_text = Reseller_Code_Filter.getText();

        return Reseller_Code_Filter_text;
    }

    public WebElement Reseller_Code_Header() {
        WebElement Reseller_Name_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(1) > div > span"));

        return Reseller_Name_Header;
    }

    public String Reseller_Code_Header_text() {
        WebElement Reseller_Code_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(1) > div > span"));
        String Reseller_Code_Header_text = Reseller_Code_Header.getText();

        return Reseller_Code_Header_text;
    }

    public WebElement Reseller_Name_Filter() {
        WebElement Reseller_Name_Filter = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.name']"));

        return Reseller_Name_Filter;
    }

    public String Reseller_Name_Filter_text() {
        WebElement Reseller_Name_Filter =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.Resellers.LblResellerName']"));
        String Reseller_Name_Filter_text = Reseller_Name_Filter.getText();

        return Reseller_Name_Filter_text;
    }

    public WebElement Reseller_Name_Header() {
        WebElement Reseller_Name_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(2) > div > span"));

        return Reseller_Name_Header;
    }

    public String Reseller_Name_Header_text() {
        WebElement Reseller_Name_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(2) > div > span"));
        String Reseller_Name_Header_text = Reseller_Name_Header.getText();

        return Reseller_Name_Header_text;
    }

    public String Reseller_Page_Header_text() {
        WebElement Reseller_Page_Header      = DR.findElement(By.cssSelector("h1"));
        String     Reseller_Page_Header_text = Reseller_Page_Header.getText();

        return Reseller_Page_Header_text;
    }

    public String Reseller_Page_Title_text() {
        WebElement Reseller_Page_Title      = DR.findElement(By.cssSelector("head > title"));
        String     Reseller_Page_Title_text = Reseller_Page_Title.getText();

        return Reseller_Page_Title_text;
    }

    public WebElement Reseller_Search_Button() {
        WebElement Reseller_Search_Button =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return Reseller_Search_Button;
    }

    public String Reseller_Search_Button_text() {
        WebElement Reseller_Search_Button =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));
        String Reseller_Search_Button_text = Reseller_Search_Button.getText();

        return Reseller_Search_Button_text;
    }

    public WebElement Sort_Button_Created() {
        WebElement Sort_Button_Created =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(6) > div > span"));

        return Sort_Button_Created;
    }

    // tr.ng-table-sort-header > th:nth-child(2) > div > span
    public WebElement Sort_Button_Reseller_Code() {
        WebElement Sort_Button_Reseller_Code =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(1) > div > span"));

        return Sort_Button_Reseller_Code;
    }

    public WebElement Sort_Button_Reseller_Name() {
        WebElement Sort_Button_Reseller_Name =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(2) > div > span"));

        return Sort_Button_Reseller_Name;
    }

    public WebElement Sort_Button_Status() {
        WebElement Sort_Button_Status =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(5) > div > span"));

        return Sort_Button_Status;
    }

    public WebElement Sort_Button_Updated() {
        WebElement Sort_Button_Updated =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(7) > div > span"));

        return Sort_Button_Updated;
    }

    public WebElement Status_Header() {
        WebElement Status_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(5) > div > span"));

        return Status_Header;
    }

    public String Status_Header_text() {
        WebElement Status_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(5) > div > span"));
        String Status_Header_text = Status_Header.getText();

        return Status_Header_text;
    }

    public WebElement Update_Header() {
        WebElement Update_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(7) > div > span"));

        return Update_Header;
    }

    public String Update_Header_text() {
        WebElement Update_Header =
            DR.findElement(By.cssSelector("tr.ng-table-sort-header > th:nth-child(7) > div > span"));
        String Update_Header_text = Update_Header.getText();

        return Update_Header_text;
    }

    public WebElement View_Credential_Button() {
        WebElement Credential_Button = DR.findElement(By.cssSelector("#table > td:nth-child(8) > a"));

        return Credential_Button;
    }

    ////table/tbody/tr[1]//a[@title='View Login Records']/i
    public WebElement ttt() throws Exception {
        WebElement ttt = actions.FindAndWait("#create", DR);

        return ttt;
    }

    public WebElement userName_input() throws Exception {
        WebElement userName_input = actions.FindAndWait("#username", DR);

        return userName_input;
    }
}
