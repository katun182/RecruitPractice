package test.tests.adminDashboardTest;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.admindashboard.AdminDashboard;
import test.tests.BaseTestLogin;

public class AdminDashboardTest extends BaseTestLogin{
    private AdminDashboard adminDashboard;

    @BeforeMethod
    public void setup() {
        super.setup();
        adminDashboard = new AdminDashboard(driver);


    }
    @Test
    public void testThatAdminDashboardLinkWorks(){
        adminDashboard.gotoAdminDashboardLink();
    }


}
