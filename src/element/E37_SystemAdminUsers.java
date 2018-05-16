package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E37_SystemAdminUsers {
  public WebDriver DR;
  public E37_SystemAdminUsers(WebDriver driver) {
      this.DR = driver;
  }
  public String [] ORGAdminUserManagementLabel = {"Admin User Management","Add User","Username","First name","Last Name","Role","Status","Restriction Type","Data Restriction","Search"};
  public String [] ORGdminUserManagementTableHeader = {"Username","First / Last Name","Role","Data Restriction","Status","Created","Updated","Records","Manage"};
  public WebElement AddUserBTN() {
    WebElement AddUserBTN = DR.findElement(By.cssSelector("[ng-click='vm.add()']"));
    return AddUserBTN;
}       
  public WebElement SearchBTN() {
    WebElement SearchBTN = DR.findElement(By.cssSelector("form > div > button"));
    return SearchBTN;
}   
  public String AdminUserManagement_Header_text() {
    String AdminUserManagement_Header_text = DR.findElement(By.cssSelector("h1")).getText();
    return AdminUserManagement_Header_text;
}
  public String AdddUserBTN_text() {
    String AdddUserBTN_text = DR.findElement(By.cssSelector("[ng-click='vm.add()']")).getText();
    return AdddUserBTN_text;
}
  public String UsernameField_text() {
    String UsernameField_text = DR.findElement(By.cssSelector("label:nth-child(1) > span.input-group-addon")).getText();
    return UsernameField_text;
} 
  public WebElement UsernameField() {
    WebElement UsernameField = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.username']"));
    return UsernameField;
} 
  public String FirstnameField_text() {
    String FirstnameField_text = DR.findElement(By.cssSelector("label:nth-child(2) > span.input-group-addon")).getText();
    return FirstnameField_text;
} 
  public WebElement FirstnameField() {
    WebElement FirstnameField = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.firstname']"));
    return FirstnameField;
} 
  public String LasrnameField_text() {
    String LasrnameField_text = DR.findElement(By.cssSelector("label:nth-child(3) > span.input-group-addon")).getText();
    return LasrnameField_text;
} 
  public WebElement LastnameField() {
    WebElement LastnameField = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.lastname']"));
    return LastnameField;
} 
  public String RoleSelector_text() {
    String RoleSelector_text = DR.findElement(By.cssSelector("label:nth-child(4) > span.input-group-addon")).getText();
    return RoleSelector_text;
} 
  public WebElement RoleSelector() {
    WebElement RoleSelector = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.roleId']"));
    return RoleSelector;
}  
  public String StatusSelector_text() {
    String StatusSelector_text = DR.findElement(By.cssSelector("label:nth-child(5) > span.input-group-addon")).getText();
    return StatusSelector_text;
} 
  public WebElement StatusSelector() {
    WebElement StatusSelector = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.status']"));
    return StatusSelector;
} 
  public String RestrictionTypeSelector_text() {
    String RestrictionTypeSelector_text = DR.findElement(By.cssSelector("label:nth-child(6) > span.input-group-addon")).getText();
    return RestrictionTypeSelector_text;
} 
  public WebElement RestrictionTypeSelector() {
    WebElement RestrictionTypeSelector = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.restrictionType']"));
    return RestrictionTypeSelector;
} 
  public String DataRestrictionSelector_text() {
    String DataRestrictionSelector_text = DR.findElement(By.cssSelector("label:nth-child(7) > span.input-group-addon")).getText();
    return DataRestrictionSelector_text;
} 
  public WebElement DataRestrictionSelector() {
    WebElement DataRestrictionSelector = DR.findElement(By.cssSelector("[ng-model='vm.tableSettings.restrictionData']"));
    return DataRestrictionSelector;
}
  public WebElement CancelEditAdminUser() {
    WebElement CancelEditAdminUser = DR.findElement(By.cssSelector("[class=\"fa fa-times fa-2x\"]"));
    return CancelEditAdminUser;
}
  public WebElement EditAdminUserHeader() {
    WebElement EditAdminUserHeader = DR.findElement(By.cssSelector("h3"));
    return EditAdminUserHeader;
}
  public WebElement EditAdminUserBTN() {
    WebElement EditAdminUserBTN = DR.findElement(By.cssSelector("[class=\"ace-icon fa fa-pencil bigger-160\"]"));
    return EditAdminUserBTN;
}
  public WebElement CancelAddAdminUser() {
    WebElement CancelAddAdminUser = DR.findElement(By.cssSelector("[class=\"fa fa-times fa-2x\"]"));
    return CancelAddAdminUser;
}
  public WebElement AddAdminUserHeader() {
    WebElement AddAdminUserHeader = DR.findElement(By.cssSelector("h3"));
    return AddAdminUserHeader;
}
  
}
