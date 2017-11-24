package tests;

import elements.JobProviders;
import elements.Jobs;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static tests.BaseTest.driver;


public class JobsTest {
    private Jobs jobs;
    @BeforeMethod
    public void setup(){
        super.setup();
        jobProviders = new JobProviders(driver);


    @Test
    public void testThatJobsLinkWoks(){
        jobs.gotoJobsLink();
    }

}
