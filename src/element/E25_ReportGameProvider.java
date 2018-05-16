package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class E25_ReportGameProvider {
  public String[] ORGSLabel = {
      "Game Provider Performance", "Time Period","Game Provider", "Currency","Platform", "Game Type","Search", "Export", "Reset"};
  public String[] ORGTableHeader = {
      "No.","Game Provider", "Currency", "Players", "Rounds", "Players","Bet Amount", "Turnover", "Valid Bets",
      "Jackpot Contribution", "Company Win/Loss", "Company Win/Loss %"};
  public WebDriver DR;
  public E25_ReportGameProvider(WebDriver driver) {
      this.DR = driver;
  }
  public String PageHeader(){return DR.findElement(By.cssSelector("h1")).getText();}
  public String TimePeriod(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.DateRangeLblTimePeriod\"]")).getText();}
  public String GameProvider(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.GameProvider.LblGameProvider\"]")).getText();}
  public String Currency(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.GameProvider.LblCurrency\"]")).getText();}
  public String Platform(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.GameProvider.LblPlatform\"]")).getText();}
  public String GameType(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Report.GameProvider.LblGameType\"]")).getText();}
  public String Search(){return DR.findElement(By.cssSelector("[ng-click=\"vm.showGameProviderTable()\"]")).getText();}
  public String Export(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Common.BtnExport\"]")).getText();}
  public String Reset(){return DR.findElement(By.cssSelector("[translate=\"Resources.UI.Form.BtnReset\"]")).getText();}
  
  
  
}
