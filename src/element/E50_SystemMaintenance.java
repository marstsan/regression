package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class E50_SystemMaintenance {
  public WebDriver DR;
  public E50_SystemMaintenance(WebDriver driver) {
      this.DR = driver;
  }
  public String[] orgSunbetCredit = {"Maintenance Manage Maintenance used in TGP","Sunbet Credit","Current Mode","Active","Message"};
  public String[] orgLobbies      = {"Lobbies","Put lobbies from Active to Maintenance","Put lobbies from Maintenance to Active"};
  public String[] orgBrands       = {"Brands","Put brands from Active to Maintenance","Put brands from Maintenance to Active"};
  public String[] orgBackOffice   = {"Back Office","Current Status","Active"};
  public String MaintenancePagaHeader_text(){
         String MaintenancePagaHeader_text=DR.findElement(By.cssSelector("h1")).getText();
         return MaintenancePagaHeader_text;
  }

  public String sunbetCreated_text (){
         String sunbetCreated_text=DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.sunbetcredit\"]")).getText();
         return sunbetCreated_text;
  }
  public String sunbetCreatedCurrentMode_text (){
         String sunbetCreatedCurrentMode_text=DR.findElement(By.cssSelector("ui-view > div > div > div > ui-view > div > div:nth-child(2)")).getText();
         return sunbetCreatedCurrentMode_text;
  }
  public String sunbetCreatedActive_text (){
         String sunbetCreatedActive_text=DR.findElement(By.cssSelector("ui-view > div > div > div > ui-view > div > pre:nth-child(3)")).getText();
         return sunbetCreatedActive_text;
  }
  public String sunbetCreatedMessage_text (){
         String sunbetCreatedMessage_text=DR.findElement(By.cssSelector("ui-view > div > div > div > ui-view > div > div:nth-child(4)")).getText();
         return sunbetCreatedMessage_text;
  }
  public String LobbiesPutLobbiesIntoMaintenance_text (){
         String LobbiesPutLobbiesIntoMaintenance_text=DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Maintenance.BtnPutLobbiesIntoMaintenance\"]")).getText();
         return LobbiesPutLobbiesIntoMaintenance_text;
}
  public String LobbiesActivateLobbies_text (){
         String LobbiesActivateLobbies_text=DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Maintenance.BtnActivateLobbies\"]")).getText();
         return LobbiesActivateLobbies_text;
}
  public String BrandsPutBrandsIntoMaintenance_text (){
         String BrandsPutBrandsIntoMaintenance_text=DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Maintenance.BtnPutBrandsIntoMaintenance\"]")).getText();
         return BrandsPutBrandsIntoMaintenance_text;
}
  public String BrandsActivateBrands_text (){
         String BrandsActivateBrands_text=DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Maintenance.BtnActivateBrands\"]")).getText();
         return BrandsActivateBrands_text;
}
  public String BOCurrentStatus_text (){
         String BOCurrentStatus_text=DR.findElement(By.cssSelector("[translate=\"Resources.UI.System.Maintenance.LblCurrentStatus\"]")).getText();
         return BOCurrentStatus_text;
}
  public String BOActive_text (){
         String BOActive_text=DR.findElement(By.cssSelector("ui-view > div > pre")).getText();
         return BOActive_text;
}
  public String Lobbies_text (){
         String Lobbies_text=DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.lobbies\"]")).getText();
         return Lobbies_text;
}

  public String Brands_text (){
         String Brands_text=DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.brands\"]")).getText();
         return Brands_text;
}
  public String BackOffice_text (){
         String BackOffice_text=DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.backoffice\"]")).getText();
         return BackOffice_text;
}
  public WebElement Lobbies(){
    return DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.lobbies\"]"));
  }
  public WebElement Brands(){
    return DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.brands\"]"));
  }
  public WebElement Backoffice(){
    return DR.findElement(By.cssSelector("[ui-sref=\"admin.system.maintenance.backoffice\"]"));
  }
  public WebElement Header(){
    return DR.findElement(By.cssSelector("h1"));
  }
  
}
