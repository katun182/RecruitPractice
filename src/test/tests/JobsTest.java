package tests;


import elements.Jobs;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class JobsTest extends BaseTestLogin {
    private Jobs jobs;

    @BeforeMethod
    public void setup(){
        super.setup();
        jobs = new Jobs(driver);
    }


    @Test
        public void testThatJobsLinkWoks(){
        jobs.gotoJobsLink();
    }

}
