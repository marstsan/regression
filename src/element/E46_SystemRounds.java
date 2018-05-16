package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
public class E46_SystemRounds {
  public WebDriver DR;
  public E46_SystemRounds(WebDriver driver) {
      this.DR = driver;
      }
  public String [] ORGRoundsManagementLabel = {"Rounds Management","Time Period","External Round Id","Status","Player Type","WalletType","Brand","Player Name","Game Provider ","Currency","Search","Export","Reset"};
  public String [] ORGRoundsManagementTableHeader = {"Round Start","Round End","GP Round Start","GP Round End","External Round Id","Round Status","Brand","Player","Player ID","Bet Amount","Win/Loss","Game Provider","Game","Platform","Currency","Player Type"};
  public String RoundsPageHeader_text() { 
         String RoundsPageHeader_text = DR.findElement(By.cssSelector("h1")).getText();
         return RoundsPageHeader_text;
         }
  public String TimePeriod_text() { 
         String TimePeriod_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();
         return TimePeriod_text;
         }
  public String ExternalRoundId_text() { 
         String ExternalRoundId_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThExternalRoundId\"]")).getText();
         return ExternalRoundId_text;
         }
  public String Status_text() { 
         String Status_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.Status\"]")).getText();
         return Status_text;
         }
  public String PlayerType_text() { 
         String PlayerType_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThPlayerType\"]")).getText();
         return PlayerType_text;
         } 
  public String WalletType_text() { 
         String WalletType_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThWalletType\"]")).getText();
         return WalletType_text;
         } 
  public String Brand_text() { 
         String Brand_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThBrand\"]")).getText();
         return Brand_text;
         } 
  public String PlayerName_text() { 
         String PlayerName_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.PlayerName\"]")).getText();
         return PlayerName_text;
         } 
  public String GameProvider_text() { 
         String GameProvider_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThProvider\"]")).getText();
         return GameProvider_text;
         } 
  public String Currency_text() { 
         String Currency_text = DR.findElement(By.cssSelector("[translate=\"Resources.UI.Partial.Round.ThCurrency\"]")).getText();
         return Currency_text;
         }   
  
  
  
  
  
}
