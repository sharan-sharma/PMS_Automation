package tests;

import BaseLibrary.Baselibrary;
import Pages.JobRole_page;
import Pages.recruiter_page;
import PropertyUtility.propertyUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class JobRoleTest extends Baselibrary {


    // tests.login_page lb;
    JobRole_page jp;

    @BeforeTest
    public void getlaunch() {
        launch(propertyUtilities.readdata("url"));
//            lb=new tests.login_page();
        jp = new JobRole_page();
    }

    @AfterTest
    public void closeprogram() {
        driver.quit();
    }


    @Test(priority = 1)
    public void jobrole()
    {
      jp.setJob_role_tab();
    }



}
