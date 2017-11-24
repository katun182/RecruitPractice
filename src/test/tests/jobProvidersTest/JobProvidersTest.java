package test.tests.jobProvidersTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.jobproviders.JobProviders;
import test.tests.BaseTestLogin;

public class JobProvidersTest extends BaseTestLogin{
private JobProviders jobProviders;

@BeforeMethod
    public void setup(){
    super.setup();
    jobProviders = new JobProviders(driver);
}
@Test
    public void testThatJobProvidersLinkWorks(){
        jobProviders.gotoJobProvidersLink();
}
@Test
    public void testThatAddNewJobProvidersBtnWorks(){
        jobProviders.gotoJobProvidersLink();
        jobProviders.gotoAddNewJobProviderBtn();
}
@Test
    public void testThatAddNewJobProviderFormWorks(){
        jobProviders.gotoJobProvidersLink();
        jobProviders.gotoAddNewJobProviderBtn();
        jobProviders.setName("Rajnish");
        jobProviders.setCompanyName("pradhan foundation");
        jobProviders.setEmail("sagarmatha123@gmail.com");
        jobProviders.setPhone("9841414141");
        jobProviders.setAddress("Kathmandu");
        jobProviders.clickSaveBtn();

}
@Test
    public void testThatSearchBoxWorks(){
        jobProviders.gotoJobProvidersLink();
        jobProviders.gotoSearchBox("fanta");
}


}
