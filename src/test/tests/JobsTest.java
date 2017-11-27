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
    @Test
    public void testThatAddNewJobsLinkWorks(){
            jobs.gotoJobsLink();
            jobs.gotoAddNewJobLink();
    }
    @Test
    public void testThatAddNewJobFormWorks(){
        jobs.gotoJobsLink();
        jobs.gotoAddNewJobLink();
        jobs.setJobTitle("php");
        jobs.setJobProvider("test _User (Test Company)");
        jobs.setJobDescription("the following should be the skills that user have to be daksfhad akdfha akdsfha aksdfhaj akdfha");
        jobs.setSkillRequired();
        jobs.setLanguage();
        jobs.setCompanies();
        jobs.setQweu();
        jobs.setCopies();
        jobs.setWebDevelopment();
        jobs.setMobileDevelopment();
        jobs.setWebAppDevelopment();
        jobs.clickCancelBtn();


    }


}
