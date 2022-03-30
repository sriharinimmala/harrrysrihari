package comhrmslib;
import org.openqa.selenium.WebDriver;

public class Global {
//std-rule:Provideing all TestData & Objects related to
//        whole application
public        WebDriver driver;
//**********TestData
//      DT    Val    VV
public String url = "http://183.82.103.245/nareshit/login.php";
public String un  = "nareshit";
public String pw  = "nareshit";
public String FN  = "selenium";
public String LN  = "suresh";
//*********Objects
public String txt_loginname = "txtUserName";
public String txt_password  = "txtPassword";
public String btn_login     = "Submit";
public String link_logout   = "Logout";
public String frame_emp     = "rightMenu";
public String btn_Add       = "//input[@value='Add']";
public String txt_EFN       = "txtEmpFirstName";
public String txt_ELN       = "txtEmpLastName";
public String btn_save      = "btnEdit";
public String name_emp      = "//*[@id='standardView']/table/tbody/tr[1]/td[3]/a";
public String btn_edit_save = "EditMain";

}

