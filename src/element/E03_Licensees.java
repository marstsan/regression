package element;

import org.omg.CORBA.PUBLIC_MEMBER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

import driverpkg.*;

@SuppressWarnings("unused")
public class E03_Licensees {

//  Reseller User Management
    public String   org_Licensees_Page_Header_text  = "Licensee Management";
    public String   org_AddLicensee_Button_text     = "Add Licensee";
    public String   org_ResellerCode_text           = "Reseller Code";
    public String   org_ResellerName_text           = "Reseller Name";
    public String   org_LicenseeCode_text           = "Licensee Code";
    public String   org_LicenseeName_text           = "Licensee Name";
    public String   org_Search_Button_text          = "Search";
    public String   org_LicenseeCode_Header         = "Licensee Code";
    public String   org_LicenseeName_Header         = "Licensee Name";
    public String   org_Description_Header          = "Description";
    public String   org_OperationalEmail_heder      = "Operational Email";
    public String   org_ResellerCode_Header         = "Reseller Code";
    public String   org_ResellerName_Header         = "Reseller Name";
    public String   org_Status_Header               = "Status";
    public String   org_Create_Header               = "Created";
    public String   org_Updated_Header              = "Updated";
    public String   org_Manage_Header               = "Manage";
    public String[] ORGlicenseeManagementHeaderList = {
        "Licensee Code", "Licensee Name", "Description", "Operational Email", "Reseller Code", "Reseller Name",
        "Status", "Created", "Updated", "Manage"
    };
    public String[] ORG_res_licenseeManagementHeaderList = {"Licensee Code", "Licensee Name","Description","Operational Email",
        "Status", "Created", "Updated", "Manage"
    };
    public String[] ORGlicenseeManagementLabelList = {
        "Licensee Management", "Add Licensee", "Reseller Code", "Reseller Name", "Licensee Code", "Licensee Name",
        "Search"
    };
    public String[] ORG_res_licenseeManagementLabelList = {
        "Licensee Management", "Add Licensee", "Licensee Code", "Licensee Name",
        "Search"
    };
    public WebDriver DR;
    Actions          actions = new Actions(DR);
    

    public E03_Licensees(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddLicensee() {
        WebElement AddLicensee =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.BtnAddLicensee']"));

        return AddLicensee;
    }

    public WebElement AddLicensee_Header() {
        WebElement AddLicensee_Header = DR.findElement(By.cssSelector("h3"));

        return AddLicensee_Header;
    }

    public WebElement CancelAddLicenseeButton() {
        WebElement CancelAddLicenseeButton = DR.findElement(By.cssSelector("[class='pull-right btn-close']"));

        return CancelAddLicenseeButton;
    }

    public String Create_Header() {
        String Create_Header = DR.findElement(By.xpath("//th[8]/div/span[@class='ng-binding sort-indicator']"))
                                 .getText();

        return Create_Header;
    }

    public String Description_Header() {
        String Description_Header = DR.findElement(By.xpath("//th[3]/div/span[@class='ng-binding sort-indicator']"))
                                      .getText();

        return Description_Header;
    }

    public WebElement EditLicenseeButton() {
        WebElement EditLicenseeButton = DR.findElement(By.xpath("//tr[1]/td[10]/button"));

        return EditLicenseeButton;
    }

    public WebElement EditLicensee_Header() {
        WebElement EditLicensee_Header = DR.findElement(By.cssSelector("h3"));

        return EditLicensee_Header;
    }

    public WebElement LicenseeCode() {
        WebElement LicenseeCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblLicenseeCode']"));

        return LicenseeCode;
    }

    public String LicenseeCode_Header() {
        String LicenseeCode_Header = DR.findElement(By.xpath("//th[1]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return LicenseeCode_Header;
    }

    public WebElement LicenseeCode_InputField() {
        WebElement LicenseeCode_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeCode']"));

        return LicenseeCode_InputField;
    }

    public String LicenseeCode_text() {
        String LicenseeCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblLicenseeCode']"))
              .getText();

        return LicenseeCode_text;
    }

    public WebElement LicenseeName() {
        WebElement LicenseeName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblLicenseeName']"));

        return LicenseeName;
    }

    public String LicenseeName_Header() {
        String LicenseeName_Header = DR.findElement(By.xpath("//th[2]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return LicenseeName_Header;
    }

    public WebElement LicenseeName_InputField() {
        WebElement LicenseeName_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeName']"));

        return LicenseeName_InputField;
    }

    public String LicenseeName_text() {
        String LicenseeName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblLicenseeName']"))
              .getText();

        return LicenseeName_text;
    }

    public String Licensees_Page_Header_text() {
        String Licensees_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return Licensees_Page_Header_text;
    }

    public String Manage_Header() {
        String Manage_Header = DR.findElement(By.xpath("//th[10]/div/span[@class='ng-binding sort-indicator']"))
                                 .getText();

        return Manage_Header;
    }

    public String OperationalEmail_heder() {
        String OperationalEmail_heder = DR.findElement(By.xpath("//th[4]/div/span[@class='ng-binding sort-indicator']"))
                                          .getText();

        return OperationalEmail_heder;
    }

    public WebElement ResellerCode() {
        WebElement ResellerCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblResellerCode']"));

        return ResellerCode;
    }

    public String ResellerCode_Header() {
        String ResellerCode_Header = DR.findElement(By.xpath("//th[5]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return ResellerCode_Header;
    }

    public WebElement ResellerCode_InputField() {
        WebElement ResellerCode_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerCode']"));

        return ResellerCode_InputField;
    }

    public String ResellerCode_text() {
        String ResellerCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblResellerCode']"))
              .getText();

        return ResellerCode_text;
    }

    public WebElement ResellerName() {
        WebElement ResellerName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblResellerName']"));

        return ResellerName;
    }

    public String ResellerName_Header() {
        String ResellerName_Header = DR.findElement(By.xpath("//th[6]/div/span[@class='ng-binding sort-indicator']"))
                                       .getText();

        return ResellerName_Header;
    }

    public WebElement ResellerName_InputField() {
        WebElement ResellerName_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerName']"));

        return ResellerName_InputField;
    }

    public String ResellerName_text() {
        String ResellerName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Licensees.LblResellerName']"))
              .getText();

        return ResellerName_text;
    }

    public WebElement SaveAddLicenseeButton() {
        WebElement SaveAddLicenseeButton = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSave']"));

        return SaveAddLicenseeButton;
    }

    public WebElement SaveEditLicenseeButton() {
        WebElement SaveEditLicenseeButton = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSave']"));

        return SaveEditLicenseeButton;
    }

    public WebElement Search_Button() {
        WebElement Search_Button = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return Search_Button;
    }

    public String Search_Button_text() {
        String Search_Button_text = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"))
                                      .getText();

        return Search_Button_text;
    }

    public String Status_Header() {
        String Status_Header = DR.findElement(By.xpath("//th[7]/div/span[@class='ng-binding sort-indicator']"))
                                 .getText();

        return Status_Header;
    }

    public String Updated_Header() {
        String Updated_Header = DR.findElement(By.xpath("//th[9]/div/span[@class='ng-binding sort-indicator']"))
                                  .getText();

        return Updated_Header;
    }
}
