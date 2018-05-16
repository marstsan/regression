package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E19_BetLimitData {
  public  WebDriver DR;

  public E19_BetLimitData(WebDriver driver) {
      this.DR = driver;
  }
  
  
  public String[] ORGBetLimitDataLabel  = {
        "Bet Limit Data", "Bet Limit Data", "Import", "Add Bet Limit", "Game Provider", "Currency","Search","Export"
    };
    public String[] ORGBetLimitDataHeaderList = {
        "Game Provider", "GP Bet Limit ID", "Currencies", "Min Bet", "Max Bet", "Default Stake", "Stakes", "Manage"
    };
    

    public String BetLimitData_Page_Header_text() {
       String BetLimitData_Page_Header_text = DR.findElement(By.cssSelector("h1")).getText();
        return BetLimitData_Page_Header_text;
    }
    public String BetLimitData_tab_text() {
      String BetLimitData_tab_text = DR.findElement(By.cssSelector("[ui-sref='admin.betLimit.betLimitData.betLimitData']")).getText();
      return BetLimitData_tab_text;
  }
    public String Import_tab_text() {
      String Import_tab_text = DR.findElement(By.cssSelector("[ui-sref='admin.betLimit.betLimitData.betLimitImport']")).getText();
      return Import_tab_text;
  }
    public String AddBetLimitBTN_text() {
      String AddBetLimitBTN_text = DR.findElement(By.cssSelector("#create")).getText();
      return AddBetLimitBTN_text;
  }
    public WebElement AddBetLimitBTN() {
      WebElement AddBetLimitBTN = DR.findElement(By.cssSelector("#create"));
      return AddBetLimitBTN;
  }
    public String GameProvider_text() {
      String GameProvider_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.BetLimit.BetLimitData.LblGameProvider\"]")).getText();
      return GameProvider_text;
  }
    public WebElement GameProvider_selector() {
      WebElement GameProvider_selector = DR.findElement(By.cssSelector("div:nth-child(1) > div > div.ng-isolate-scope > span > button"));
      return GameProvider_selector;
  }
    public WebElement GameProvider_selector_option() {
      WebElement GameProvider_selector_option = DR.findElement(By.cssSelector("div:nth-child(1) > div > div.ng-isolate-scope > span > div > div.checkBoxContainer > div:nth-child(1) > div > label > span"));
      return GameProvider_selector_option;
  }
    public String Currency_text() {
      String Currency_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.BetLimit.BetLimitData.LblCurrency\"]")).getText();
      return Currency_text;
  } 
    public String SearchBTN_text() {
      String SearchBTN_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnSearch\"]")).getText();
      return SearchBTN_text;
  } 
    public String ExportBTN_text() {
      String ExportBTN_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnExport\"]")).getText();
      return ExportBTN_text;
  }
    public WebElement EditBetLimitBTN() {
      WebElement EditBetLimitBTN = DR.findElement(By.cssSelector("[ng-if=\"vm.permission.Update\"]"));
      return EditBetLimitBTN;
  }
    public WebElement CancelEditBetLimitBTN() {
      WebElement CancelEditBetLimitBTN = DR.findElement(By.cssSelector("[class=\"fa fa-times fa-2x\"]"));
      return CancelEditBetLimitBTN;
  }
    public WebElement EditBetLimit_Header() {
      WebElement EditBetLimit_Header = DR.findElement(By.cssSelector("h3"));
      return EditBetLimit_Header;
  }
    public WebElement AddBetLimit_Header() {
      WebElement AddBetLimit_Header = DR.findElement(By.cssSelector("h3"));
      return AddBetLimit_Header;
  }
    public WebElement CancelAddBetLimitBTN() {
      WebElement CancelAddBetLimitBTN = DR.findElement(By.cssSelector("[class=\"fa fa-times fa-2x\"]"));
      return CancelAddBetLimitBTN;
  }
    public WebElement DeleteBetLimitBTN() {
      WebElement DeleteBetLimitBTN = DR.findElement(By.cssSelector("[class=\"ace-icon fa fa-trash bigger-160\"]"));
      return DeleteBetLimitBTN;
  }  
    public WebElement CancelDeleteBetLimitBTN() {
      WebElement CancelDeleteBetLimitBTN = DR.findElement(By.cssSelector("[class=\"btn btn-cancel ng-scope\"]"));
      return CancelDeleteBetLimitBTN;
  } 
    public WebElement DeleteBetLimit_header() {
      WebElement DeleteBetLimit_header = DR.findElement(By.cssSelector("h3"));
      return DeleteBetLimit_header;
  }  
    
}

    
