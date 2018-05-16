package element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class E52_SystemWhitelistIPs {
  public WebDriver DR;
  public E52_SystemWhitelistIPs(WebDriver driver) {
      this.DR = driver;
  }
  public String [] orgwhitelistIPsLabel  = {"Whitelist IPs","Add IP","Reseller","Licensee","Brand","Whitelist Type","IP","Description","Search","Export"};
  public String [] orgWhitelistIPsHeader = {"No.","Reseller","Licensee","Brand","IP Address","Back Office","API / Server","Lobby","Description","Internal Note","Created On","Updated On","Manage"};
  public WebElement LanguageSelector(){return DR.findElement(By.cssSelector("[class=\"ace-icon fa fa-angle-down bigger-110\"]")) ;}
  public WebElement PageHeader(){return DR.findElement(By.cssSelector("h1")) ;}
  public String PageHeader_text(){return DR.findElement(By.cssSelector("h1")).getText();}
  public WebElement Reseller_selector(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.resellerId\"]")) ;}
  public String reseller_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblReseller\"]")).getText();}
  public WebElement Licensee_selector(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.licenseeId\"]")) ;}
  public String Licensee_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblLicensee\"]")).getText();}
  public WebElement Brand_selector(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.brandId\"]")) ;}
  public String Brand_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblBrand\"]")).getText();}
  public WebElement whitelistTypeselector(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.whitelistType\"]")) ;}
  public String whitelistType_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblWhitelistType\"]")).getText();}
  public WebElement IP_Inputfield(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.ip\"]")) ;}
  public String IP_text(){return DR.findElement(By.cssSelector("form > div:nth-child(1) > label:nth-child(5) > span.input-group-addon")).getText();}
  public WebElement Description_Inputfield(){return DR.findElement(By.cssSelector("[ng-model=\"vm.settings.description\"]")) ;}
  public String Description_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblDescription\"]")).getText();}
  public WebElement AddIP_BTN(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblAddIP\"]")) ;}
  public String AddIP_BTN_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Whitelist.LblAddIP\"]")).getText();}
  public WebElement Search_BTN(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnSearch\"]")) ;}
  public String Search_BTN_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnSearch\"]")).getText();}
  public WebElement Export_BTN(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnExport\"]")) ;}
  public String Export_BTN_text(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnExport\"]")).getText();}
  public WebElement AddIP_Heder(){return DR.findElement(By.cssSelector("h3")) ;}
  public WebElement CancelAddIP(){return DR.findElement(By.cssSelector("[class=\"fa fa-times fa-2x\"]")) ;}
  
  
}
