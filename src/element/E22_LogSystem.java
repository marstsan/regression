package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E22_LogSystem {
  public WebDriver DR;
  public E22_LogSystem(WebDriver driver) {
      this.DR = driver;
  }
  public String [] ORGSystemLogLabel = {"System Logs","Time Period","Server","Logger","Search","Search"};
  public String [] ORGSystemlogTableHeader = {"Date","Server","Level","Logger","Message"};
  public WebElement Path_inputfield() {WebElement Path_inputfield = DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.path\"]"));
         return Path_inputfield;
         }
    public String SystemLogPageHeader_text() {
           String SystemLogPageHeader_text = DR.findElement(By.cssSelector("h1")).getText();
           return SystemLogPageHeader_text;
  }  
    public String TimePeriod_text() {
      String TimePeriod_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();
      return TimePeriod_text;
}  
         
    public String Server_text() {
      String Server_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThServer\"]")).getText();
      return Server_text;
}    
    public String Logger_text() {
      String Logger_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.LogAdmin.ThLogger\"]")).getText();
      return Logger_text;
}   
    public WebElement SearchField() {WebElement SearchField = DR.findElement(By.cssSelector("[ng-model=\"vm.fetchingFilters.keyword\"]"));
    return SearchField;
    }
    public String SearchField_text() {String SearchField_text = DR.findElement(By.cssSelector("label:nth-child(5) > span.input-group-addon")).getText();
    return SearchField_text;
    }
    public WebElement SearchBTN() {WebElement SearchBTN = DR.findElement(By.cssSelector("form > div > button"));
    return SearchBTN;
    }
    public String SearchBTN_text() {String SearchBTN_text = DR.findElement(By.cssSelector("form > div > button")).getText();
    return SearchBTN_text;
    }
}
