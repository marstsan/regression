package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E20_LogAdmin {
  public WebDriver DR;
  public E20_LogAdmin(WebDriver driver) {
      this.DR = driver;
  }
  public String [] ORGAdminLogLabel = {"Admin Logs","Time Period","Reseller","Licensee","Prefix","Status","Ip","Path","Content","Server","Search"};
  public String [] ORGAdminlogTableHeader = {"Date","User","Login Type","Description","Ip","Prefix","Path","Status","Server","Response Length","Execution Time"};
  public WebElement Path_inputfield() {WebElement Path_inputfield = DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.path\"]"));
         return Path_inputfield;
         }
    public String AdminLogPageHeader_text() {
           String AdminLogPageHeader_text = DR.findElement(By.cssSelector("h1")).getText();
           return AdminLogPageHeader_text;
  }  
    public String TimePeriod_text() {
      String TimePeriod_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();
      return TimePeriod_text;
}  
    public String Reseller_text() {
      String Reseller_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThReseller\"]")).getText();
      return Reseller_text;
}    
    public String Licensee_text() {
      String Licensee_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThLicensee\"]")).getText();
      return Licensee_text;
} 
    public String Prefix_text() {
      String Prefix_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThPrefix\"]")).getText();
      return Prefix_text;
}     
    public String Status_text() {
      String Status_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThStatus\"]")).getText();
      return Status_text;
}      
    public String Ip_text() {
      String Status_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThIp\"]")).getText();
      return Status_text;
}      
    public String Path_text() {
      String Path_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThPath\"]")).getText();
      return Path_text;
}      
    public String Content_text() {
      String Content_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.Content\"]")).getText();
      return Content_text;
}     
    public String Server_text() {
      String Server_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThServer\"]")).getText();
      return Server_text;
}     
    public WebElement SearchBTN() {WebElement SearchBTN = DR.findElement(By.cssSelector("form > div > button"));
    return SearchBTN;
    }
    public String SearchBTN_text() {String SearchBTN_text = DR.findElement(By.cssSelector("form > div > button")).getText();
    return SearchBTN_text;
    }

}
