package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

import driverpkg.*;

@SuppressWarnings("unused")
public class E02_ResellerUser {

//  Reseller User Management
    public String   org_Reseller_User_Page_Header_text = "Reseller User Management";
    public String   org_Data_Restriction_text          = "Data Restriction";
    public String   org_FirstName_Text                 = "First name";
    public String   org_LastName_Text                  = "Last name";
    public String   org_Role_text                      = "Role";
    public String   org_Status_text                    = "Status";
    public String   org_ResellerCode_text              = "Reseller Code";
    public String   org_ResellerName_text              = "Reseller Name";
    public String   org_Username_text                  = "Username";
    public String   org_AddUser_text                   = "Add User";
    public String   org_Role_Header_text               = "Role";
    public String   org_Status_Text                    = "Status";
    public String   org_AddUser                        = "Add User";
    public String   org_Username_Header                = "Username";
    public String   org_FirstAndLastName_Header        = "First / Last Name";
    public String   org_Role_Header                    = "Role";
    public String   org_Data_Restriction_Header        = "Data Restriction";
    public String   org_ResellerCode_Header            = "Reseller Code";
    public String   org_ResellerName_Header            = "Reseller Name";
    public String   org_UserStatus_Header              = "User Status";
    public String   org_Create_Header                  = "Created";
    public String   org_Updated_Header                 = "Updated";
    public String   org_Records_Header                 = "Records";
    public String   org_Manage_Header                  = "Manage";
    public String   org_Search_button_text             = "Search";
    public String[] ORGadminResellerUserTableHeader    = {
        "Username", "First / Last Name", "Role", "Data Restriction", "Reseller Code", "Reseller Name", "User Status",
        "Created", "Updated", "Records", "Manage"
    };
    public String[] ORGadminResellerUserLableList = {
        "Reseller User Management", "Username", "First name", "Last name", "Role", "Status", "Reseller Code",
        "Reseller Name", "Data Restriction", "Add User", "Search"
    };
    
    public WebDriver DR;
    Actions          actions = new Actions(DR);
    public E02_ResellerUser(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddUser() {
        WebElement AddUser =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.BtnAddUser']"));

        return AddUser;
    }

    public WebElement AddUser_Header() {
        WebElement AddUser_Header = DR.findElement(By.cssSelector("h3"));

        return AddUser_Header;
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

    public String Create_Header() {
        String Create_Header = DR.findElement(By.xpath("//th[8]/div/span[@class='ng-binding sort-indicator']"))
                                 .getText();

        return Create_Header;
    }

    public WebElement Data_Restriction() {
        WebElement Data_Restriction =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblDataRestriction']"));

        return Data_Restriction;
    }

    public WebElement Data_RestrictionSelector() {
        WebElement Data_RestrictionSelector =
            DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.licenseeId']"));

        return Data_RestrictionSelector;
    }

    public String Data_Restriction_Header() {
        String Data_Restriction_Header =
            DR.findElement(By.xpath("//th[4]/div/span[@class='ng-binding sort-indicator']"))
              .getText();

        return Data_Restriction_Header;
    }

    public String Data_Restriction_text() {
        WebElement Data_Restriction =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblDataRestriction']"));
        String Data_Restriction_text = Data_Restriction.getText();

        return Data_Restriction_text;
    }

    public String FirstAndLastName_Header() {
        String FirstAndLastName_Header =
            DR.findElement(By.xpath("//th[2]/div/span[@class='ng-binding sort-indicator']"))
              .getText();

        return FirstAndLastName_Header;
    }

    public WebElement FirstName() {
        WebElement FirstName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LbLFirstName']"));

        return FirstName;
    }

    public WebElement FirstName_InputField() {
        WebElement FirstNameInputField = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.firstname']"));

        return FirstNameInputField;
    }

    public String FirstName_Text() {
        WebElement FirstName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LbLFirstName']"));
        String FirstName_Text = FirstName.getText();

        return FirstName_Text;
    }

    public WebElement LastName() {
        WebElement LastName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblLastName']"));

        return LastName;
    }

    public WebElement LastName_InputField() {
        WebElement LastName_InputField = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.lastname']"));

        return LastName_InputField;
    }

    public String LastName_Text() {
        WebElement LastName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblLastName']"));
        String LastName_Text = LastName.getText();

        return LastName_Text;
    }

    public WebElement Maanage_button() {
        WebElement Maanage_button = DR.findElement(By.xpath("//table/tbody/tr[1]/td[11]/button"));

        return Maanage_button;
    }

    public WebElement Manage_Header() {
        WebElement Manage_Header = DR.findElement(By.xpath("//th[11]/div/span[@class='ng-binding sort-indicator']"));

        return Manage_Header;
    }

    public WebElement Manage_Save_button() {
        WebElement Maanage_Save_button = DR.findElement(By.xpath("//button[@type='submit'][1]"));

        return Maanage_Save_button;
    }

    public WebElement Menu_ResellerUser() {
        WebElement Menu_ResellerUser =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkResellerUsers']"));

        return Menu_ResellerUser;
    }

    public String Records_Header() {
        String Records_Header = DR.findElement(By.xpath("//th[10]/div/span[@class='ng-binding sort-indicator']"))
                                  .getText();

        return Records_Header;
    }

    public WebElement Records_button() {
        WebElement Records_button = DR.findElement(By.xpath("//table/tbody/tr[1]//a[@title='View Login Records']/i"));

        return Records_button;
    }

    public WebElement ResellerCode() {
        WebElement ResellerCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblResellerCode']"));

        return ResellerCode;
    }

    public String ResellerCode_Header() {
        String ResellerCode_Header = DR.findElement(By.xpath("//th[5]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return ResellerCode_Header;
    }

    public WebElement ResellerCode_InputField() {
        WebElement ResellerCode_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.resellerCode']"));

        return ResellerCode_InputField;
    }

    public String ResellerCode_Text() {
        WebElement ResellerCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblResellerCode']"));
        String ResellerCode_Text = ResellerCode.getText();

        return ResellerCode_Text;
    }

    public WebElement ResellerName() {
        WebElement ResellerName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblResellerName']"));

        return ResellerName;
    }

    public WebElement ResellerNameInputField() {
        WebElement UsernameInputField = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.resellerName']"));

        return UsernameInputField;
    }

    public String ResellerName_Header() {
        String ResellerName_Header = DR.findElement(By.xpath("//th[6]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return ResellerName_Header;
    }

    public String ResellerName_text() {
        WebElement ResellerName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblResellerName']"));
        String ResellerName_text = ResellerName.getText();

        return ResellerName_text;
    }

    public String Reseller_User_Page_Header_text() {
        WebElement Reseller_User_Page_Header      = DR.findElement(By.cssSelector("h1"));
        String     Reseller_User_Page_Header_text = Reseller_User_Page_Header.getText();

        return Reseller_User_Page_Header_text;
    }

    public WebElement Role() {
        WebElement Role = DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblRole']"));

        return Role;
    }

    public String Role_Header() {
        String Role_Header = DR.findElement(By.xpath("//th[3]/div/span[@class='ng-binding sort-indicator']")).getText();

        return Role_Header;
    }

    public WebElement Role_Selector() {
        WebElement Role_Selector = DR.findElement(By.cssSelector("label:nth-child(4) > select"));

        return Role_Selector;
    }

    public String Role_Text() {
        WebElement Role      =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblRole']"));
        String     Role_Text = Role.getText();

        return Role_Text;
    }

    public WebElement Search_Button() {
        WebElement Search_Button = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return Search_Button;
    }

    public String Search_Button_text() {
        WebElement Search_Button      = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));
        String     Search_Button_text = Search_Button.getText();

        return Search_Button_text;
    }

    public WebElement Status() {
        WebElement Status =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblStatus']"));

        return Status;
    }

    public WebElement Status_Selector() {
        WebElement Status_Selector = DR.findElement(By.cssSelector("label:nth-child(5) > select"));

        return Status_Selector;
    }

    public String Status_Text() {
        WebElement Status =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblStatus']"));
        String Status_Text = Status.getText();

        return Status_Text;
    }

    public String Updated_Header() {
        String Updated_Header = DR.findElement(By.xpath("//th[9]/div/span[@class='ng-binding sort-indicator']"))
                                  .getText();

        return Updated_Header;
    }

    public String UserName_Header() {
        String UserName_Header = DR.findElement(By.xpath("//th[1]/div/span[@class='ng-binding sort-indicator']"))
                                   .getText();

        return UserName_Header;
    }

    public String UserStatus_Header() {
        String UserStatus_Header = DR.findElement(By.xpath("//th[7]/div/span[@class='ng-binding sort-indicator']"))
                                     .getText();

        return UserStatus_Header;
    }

    public WebElement Username() {
        WebElement Username =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblUserName']"));

        return Username;
    }

    public WebElement UsernameInputField() {
        WebElement UsernameInputField = DR.findElement(By.cssSelector("[ng-model='vm.fetchingFilters.username']"));

        return UsernameInputField;
    }

    public String Username_text() {
        WebElement Username =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Reseller.ResellerUsers.LblUserName']"));
        String Username_text = Username.getText();

        return Username_text;
    }
}
