package comhrmstestscrpts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import comhrmslib.General;

public class TC003 {
//public static void main(String args[]) {
        @Test
        public void tc003() {
        //Test Steps
        DOMConfigurator.configure("log4j.xml");
        General obj = new General();
        obj.openApplication();
        obj.login();
        obj.enterFrame();
        obj.editEmp();
        obj.exitFrame();
        obj.logout();
        obj.closeApplication();
}
}
