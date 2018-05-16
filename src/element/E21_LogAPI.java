package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E21_LogAPI {
  public WebDriver DR;
  public E21_LogAPI(WebDriver driver) {
      this.DR = driver;
  }
  public String [] ORGAPILogLabel = {"API Logs","Time Period","Prefix","Status","Ip","Path","Content","Server","Search"};
  public String [] ORGAPIlogTableHeader = {"Date","Ip","Prefix","Path","Status","Server","Response Length","Execution Time"};
  public WebElement Path_inputfield() {WebElement Path_inputfield = DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.path\"]"));
         return Path_inputfield;
         }
    public String APILogPageHeader_text() {
           String AdminLogPageHeader_text = DR.findElement(By.cssSelector("h1")).getText();
           return AdminLogPageHeader_text;
  }  
    public String TimePeriod_text() {
      String TimePeriod_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();
      return TimePeriod_text;
}  
    
    public String Prefix_text() {
      String Prefix_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.ThPrefix\"]")).getText();
      return Prefix_text;
}     
    public String Status_text() {
      String Status_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.ThStatus\"]")).getText();
      return Status_text;
}      
    public String Ip_text() {
      String Status_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.ThIp\"]")).getText();
      return Status_text;
}      
    public String Path_text() {
      String Path_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.ThPath\"]")).getText();
      return Path_text;
}      
    public String Content_text() {
      String Content_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.Content\"]")).getText();
      return Content_text;
}     
    public String Server_text() {
      String Server_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogApi.ThServer\"]")).getText();
      return Server_text;
}     
    public WebElement SearchBTN() {WebElement SearchBTN = DR.findElement(By.cssSelector("form > div > button"));
    return SearchBTN;
    }
    public String SearchBTN_text() {String SearchBTN_text = DR.findElement(By.cssSelector("form > div > button")).getText();
    return SearchBTN_text;
    }
}
