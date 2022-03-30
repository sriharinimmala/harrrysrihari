package comhrmstestscrpts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import comhrmslib.General;

public class TC004 {
//public static void main(String args[]) {
        @Test
        public void tc004() {
        //Test Steps
        DOMConfigurator.configure("log4j.xml");
        General obj = new General();
        obj.openApplication();
        obj.login();
        obj.delEmp();
        obj.logout();
        obj.closeApplication();
}
}

