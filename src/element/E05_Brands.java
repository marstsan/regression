package element;

import org.omg.CORBA.PUBLIC_MEMBER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicAction.Actions;

import driverpkg.*;

@SuppressWarnings("unused")
public class E05_Brands {

//  Reseller User Management
    public String   org_Brands_Page_Header_text         = "Brands Management";
    public String   org_Deauthorize_players_Button_text = "Deauthorize players";
    public String   org_AddBrand_Button_text            = "Add Brand";
    public String   org_BrandCode_text                  = "Brand Code";
    public String   org_BrandrName_text                 = "Brand Name";
    public String   org_ResellerCode_text               = "Reseller Code";
    public String   org_ResellerName_text               = "Reseller Name";
    public String   org_LicenseeCode_text               = "Licensee Code";
    public String   org_LicenseeName_text               = "Licensee Name";
    public String   org_Search_Button_text              = "Search";
    public String   org_BrandCode_Header                = "Brand Code";
    public String   org_BrandName_Header                = "Brand Name";
    public String   org_Description_Header              = "Description";
    public String   org_OperationalEmail_heder          = "Operational Email";
    public String   org_ResellerCode_Header             = "Reseller Code";
    public String   org_ResellerName_Header             = "Reseller Name";
    public String   org_LicenseeCode_Header             = "Licensee Code";
    public String   org_LicenseeName_Header             = "Licensee Name";
    public String   org_BrandStatus_Header              = "Brand Status";
    public String   org_Create_Header                   = "Created";
    public String   org_Updated_Header                  = "Updated";
    public String   org_Credential_Header               = "Credential";
    public String[] ORGBransLabelList                   = {
        "Brands Management", "Deauthorize players", "Add Brand", "Brand Code", "Brand Name", "Reseller Code",
        "Reseller Name", "Licensee Code", "Licensee Name", "Search"
    };
    public String[] lic_ORGBransLabelList                   = {
        "Brands Management","Add Brand", "Brand Code", "Brand Name","Search"};
    public String[] ORGBransHeaderList = {
        "Brand Code", "Brand Name", "Description", "Operational Email", "Reseller Code", "Reseller Name",
        "Licensee Code", "Licensee Name", "Brand Status", "Created", "Updated", "Credential"
    };
    public String[] lic_ORGBransHeaderList = {
        "Brand Code", "Brand Name", "Description", "Operational Email","Brand Status", "Created", "Updated", "Credential"
    };
    public WebDriver DR;
    Actions actions = new Actions(DR);


    public E05_Brands(WebDriver driver) {
        this.DR = driver;
    }

    public WebElement AddBrand_Button() {
        WebElement AddBrand_Button = DR.findElement(By.cssSelector("[ng-click='vm.add()']"));

        return AddBrand_Button;
    }

    public String AddBrand_Button_text() {
        String AddBrand_Button_text = DR.findElement(By.cssSelector("[ng-click='vm.add()']")).getText();

        return AddBrand_Button_text;
    }

    public WebElement AddBrand_header() {
        WebElement AddBrand_header = DR.findElement(By.cssSelector("h1"));

        return AddBrand_header;
    }

    public WebElement BrandCode() {
        WebElement BrandCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblBrandCode']"));

        return BrandCode;
    }

    public String BrandCode_Header_text() {
        String BrandCode_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Brand Code')]")).getText();

        return BrandCode_Header_text;
    }

    public WebElement BrandCode_InputField() {
        WebElement BrandCode_InputField = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.code']"));

        return BrandCode_InputField;
    }

    public String BrandCode_text() {
        String BrandCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblBrandCode']"))
              .getText();

        return BrandCode_text;
    }

    public WebElement BrandName() {
        WebElement BrandName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblBrandName']"));

        return BrandName;
    }

    public String BrandName_Header_text() {
        String BrandName_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Brand Name')]")).getText();

        return BrandName_Header_text;
    }

    public WebElement BrandName_InputField() {
        WebElement BrandName_InputField = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.name']"));

        return BrandName_InputField;
    }

    public String BrandName_text() {
        String BrandName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblBrandName']"))
              .getText();

        return BrandName_text;
    }

    public String BrandStatus_Header_text() {
        String BrandStatus_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Brand Status')]")).getText();

        return BrandStatus_Header_text;
    }

    public String Brands_Page_Header_text() {
        String Brands_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();

        return Brands_Page_Header_text;
    }

    public WebElement CancelAddBrand_Button() {
        WebElement CancelAddBrand_Button = DR.findElement(By.cssSelector("[class='btn btn-cancel ng-binding']"));

        return CancelAddBrand_Button;
    }

    public WebElement CancelDeauthorize_players_Button() {
        WebElement CancelDeauthorize_players_Button =
            DR.findElement(By.cssSelector("[class='btn btn-cancel ng-scope']"));

        return CancelDeauthorize_players_Button;
    }

    public String Created_Header_text() {
        String Created_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Created')]")).getText();

        return Created_Header_text;
    }

    public String Credential_Header_text() {
        String Credential_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Credential')]")).getText();

        return Credential_Header_text;
    }

    public WebElement Deauthorize_players_Button() {
        WebElement Deauthorize_players_Button = DR.findElement(By.cssSelector("div:nth-child(1) > a"));

        return Deauthorize_players_Button;
    }

    public String Deauthorize_players_Button_text() {
        String Deauthorize_players_Button_text = DR.findElement(By.cssSelector("div:nth-child(1) > a")).getText();

        return Deauthorize_players_Button_text;
    }

    public String Description_Header_text() {
        String Description_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Description')]")).getText();

        return Description_Header_text;
    }

    public WebElement EditBrand_Button() {
        WebElement EditBrand_Button = DR.findElement(By.cssSelector("[ng-if='vm.permission.Update']"));

        return EditBrand_Button;
    }

    public WebElement EditBrand_Save_Button() {
        WebElement EditBrand_Save_Button = DR.findElement(By.xpath("//*[@type='submit']"));

        return EditBrand_Save_Button;
    }

    public WebElement EditBrand_header() {
        WebElement EditBrand_header = DR.findElement(By.cssSelector("h1"));

        return EditBrand_header;
    }

    public WebElement LicenseeCode() {
        WebElement LicenseeCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblLicenseeCode']"));

        return LicenseeCode;
    }

    public String LicenseeCode_Header_text() {
        String LicenseeCode_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Licensee Code')]"))
                                            .getText();

        return LicenseeCode_Header_text;
    }

    public WebElement LicenseeCode_InputField() {
        WebElement LicenseeCode_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeCode']"));

        return LicenseeCode_InputField;
    }

    public String LicenseeCode_text() {
        String LicenseeCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblLicenseeCode']"))
              .getText();

        return LicenseeCode_text;
    }

    public WebElement LicenseeName() {
        WebElement LicenseeName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblLicenseeName']"));

        return LicenseeName;
    }

    public String LicenseeName_Header_text() {
        String LicenseeName_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Licensee Name')]"))
                                            .getText();

        return LicenseeName_Header_text;
    }

    public WebElement LicenseeName_InputField() {
        WebElement LicenseeName_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.licenseeName']"));

        return LicenseeName_InputField;
    }

    public String LicenseeName_text() {
        String LicenseeName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblLicenseeName']"))
              .getText();

        return LicenseeName_text;
    }

    public WebElement Menu_Brands_link() {
        WebElement Menu_Brands_link =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Partial.Menu.Menu.LinkBrands']"));

        return Menu_Brands_link;
    }

    public String OptionalEmail_Header_text() {
        String OptionalEmail_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Optional Email')]"))
                                             .getText();

        return OptionalEmail_Header_text;
    }

    public WebElement ResellerCode() {
        WebElement ResellerCode =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblResellerCode']"));

        return ResellerCode;
    }

    public String ResellerCode_Header_text() {
        String ResellerCode_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Reseller Code')]"))
                                            .getText();

        return ResellerCode_Header_text;
    }

    public WebElement ResellerCode_InputField() {
        WebElement ResellerCode_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerCode']"));

        return ResellerCode_InputField;
    }

    public String ResellerCode_text() {
        String ResellerCode_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblResellerCode']"))
              .getText();

        return ResellerCode_text;
    }

    public WebElement ResellerName() {
        WebElement ResellerName =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblResellerName']"));

        return ResellerName;
    }

    public String ResellerName_Header_text() {
        String ResellerName_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Reseller Name')]"))
                                            .getText();

        return ResellerName_Header_text;
    }

    public WebElement ResellerName_InputField() {
        WebElement ResellerName_InputField =
            DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.resellerName']"));

        return ResellerName_InputField;
    }

    public String ResellerName_text() {
        String ResellerName_text =
            DR.findElement(By.cssSelector("[translate='Resources.UI.Licensee.Brands.LblResellerName']"))
              .getText();

        return ResellerName_text;
    }

    public WebElement SearchBTN() {
        WebElement SearchBTN = DR.findElement(By.cssSelector("[translate='Resources.UI.Common.BtnSearch']"));

        return SearchBTN;
    }

    public String Updated_Header_text() {
        String Updated_Header_text = DR.findElement(By.xpath("//div/*[contains(text(),'Updated')]")).getText();

        return Updated_Header_text;
    }
}
