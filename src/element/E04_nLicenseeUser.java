package element;

import org.omg.CORBA.PUBLIC_MEMBER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

import driverpkg.*;

@SuppressWarnings("unused")
public class E04_nLicenseeUser {

//  Reseller User Management
    public String   org_LicenseeUser_Page_Header_text = "Licensee User Management";
    public String   org_AddLicenseeUser_Button_text   = "Add User";
    public String   org_Username_text                 = "Username";
    public String   org_FirstName_Text                = "First name";
    public String   org_LastName_Text                 = "Last name";
    public String   org_ResellerCode_text             = "Reseller Code";
    public String   org_ResellerName_text             = "Reseller Name";
    public String   org_LicenseeCode_text             = "Licensee Code";
    public String   org_LicenseeName_text             = "Licensee Name";
    public String   org_Role_text                     = "Role";
    public String   org_Status_text                   = "Status";
    public String   org_Data_Restriction_text         = "Data Restriction";
    public String   org_Search_Button_text            = "Search";
    public String[] ORGLicenseeUserLabelList          = {
        "Licensee User Management", "Add User", "Username", "First name", "Last name", "Reseller Code", "Reseller Name",
        "Licensee Code", "Licensee Name", "Role", "Status", "Data Restriction", "Search"
    };
    public String[] org_res_LicenseeUserLabelList          = {
        "Licensee User Management", "Add User", "Username", "First name", "Last name", 
        "Licensee Code", "Licensee Name", "Role", "Status", "Data Restriction", "Search"
    };
    public String[] oRGLicenseeUserHeaderList = {
        "User name", "First / Last Name", "Role", "Data Restriction", "Licensee Code", "Licensee Name", "Reseller Code",
        "Reseller Name", "User Status", "Created", "Updated", "Records", "Manage"
    };
    public String[] org_res_LicenseeUserHeaderList = {
        "User name", "First / Last Name", "Role", "Data Restriction", "Licensee Code", "Licensee Name", "User Status", "Created", "Updated", "Records", "Manage"
    };
    private WebDriver DR;
    Actions           actions = new Actions(DR);
   

    public E04_nLicenseeUser(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddUserBTN() {
        WebElement AddUserBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.BtnAddUser']"));

        return AddUserBTN;
    }

    public WebElement AddUserCancelBTN() {
        WebElement AddUserCancelBTN = DR.findElement(By.cssSelector(".pull-right.btn-close"));

        return AddUserCancelBTN;
    }

    public WebElement AddUserHeader() {
        WebElement AddUserHeader = DR.findElement(By.cssSelector("h3"));

        return AddUserHeader;
    }

    public WebElement AddUserSaveBTN() {
        WebElement AddUserSaveBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.BtnSave']"));

        return AddUserSaveBTN;
    }

    public String AddUser_text() {
        String AddUser_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.BtnAddUser']"))
                                .getText();

        return AddUser_text;
    }

    public WebElement DataRestriction_Dropdown() {
        WebElement DataRestriction_Dropdown = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.brandId']"));

        return DataRestriction_Dropdown;
    }

    public String DataRestriction_text() {
        String DataRestriction_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblDataRestriction']"))
              .getText();

        return DataRestriction_text;
    }

    public WebElement EditUserBTN() {
        WebElement EditUserBTN = DR.findElement(By.cssSelector(".fa-pencil"));

        return EditUserBTN;
    }

    public WebElement EditUserHeader() {
        WebElement EditUserHeader = DR.findElement(By.cssSelector("h3"));

        return EditUserHeader;
    }

    public WebElement FirstName_inputfield() {
        WebElement FirstName_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.firstname']"));

        return FirstName_inputfield;
    }

    public String FirstName_text() {
        String FirstName_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblFirstName']"))
                                  .getText();

        return FirstName_text;
    }

    public WebElement LastName_inputfield() {
        WebElement LastName_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.lastname']"));

        return LastName_inputfield;
    }

    public String LastName_text() {
        String LastName_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblLastName']"))
                                 .getText();

        return LastName_text;
    }

    public WebElement LicenseeCode_inputfield() {
        WebElement LicenseeCode_inputfield =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeCode']"));

        return LicenseeCode_inputfield;
    }

    public String LicenseeCode_text() {
        String LicenseeCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblLicenseeCode']"))
              .getText();

        return LicenseeCode_text;
    }

    public WebElement LicenseeName_inputfield() {
        WebElement LicenseeName_inputfield =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeName']"));

        return LicenseeName_inputfield;
    }

    public String LicenseeName_text() {
        String LicenseeName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblLicenseeName']"))
              .getText();

        return LicenseeName_text;
    }

    public String LicenseeUser_Page_Header_text() {
        String LicenseeUser_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return LicenseeUser_Page_Header_text;
    }

    public WebElement ResellerCode_inputfield() {
        WebElement ResellerCode_inputfield =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerCode']"));

        return ResellerCode_inputfield;
    }

    public String ResellerCode_text() {
        String ResellerCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblResellerCode']"))
              .getText();

        return ResellerCode_text;
    }

    public WebElement ResellerName_inputfield() {
        WebElement ResellerName_inputfield =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerName']"));

        return ResellerName_inputfield;
    }

    public String ResellerName_text() {
        String ResellerName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblResellerName']"))
              .getText();

        return ResellerName_text;
    }

    public WebElement Role_Dropdown() {
        WebElement Role_Dropdown = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.roleId']"));

        return Role_Dropdown;
    }

    public String Role_text() {
        String Role_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Role.Role.LblRole']")).getText();

        return Role_text;
    }

    public WebElement SearchBTN() {
        WebElement SearchBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return SearchBTN;
    }

    public String SearchBTN_text() {
        String SearchBTN_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']")).getText();

        return SearchBTN_text;
    }

    public WebElement Status_Dropdown() {
        WebElement Status_Dropdown = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.status']"));

        return Status_Dropdown;
    }

    public String Status_text() {
        String Status_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblStatus']"))
                               .getText();

        return Status_text;
    }

    public WebElement Username_inputfield() {
        WebElement Username_inputfield = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.username']"));

        return Username_inputfield;
    }

    public String Username_text() {
        String Username_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Users.LblUserName']"))
                                 .getText();

        return Username_text;
    }
}
