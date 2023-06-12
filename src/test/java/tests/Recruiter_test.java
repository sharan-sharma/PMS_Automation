package tests;

import BaseLibrary.Baselibrary;

import Pages.recruiter_page;
import PropertyUtility.propertyUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Recruiter_test extends Baselibrary {



       // tests.login_page lb;
        recruiter_page rt;

        @BeforeTest
        public void getlaunch()
        {
            launch(propertyUtilities.readdata("url"));
//            lb=new tests.login_page();
            rt = new recruiter_page();
        }
        @AfterTest
        public void closeprogram()
        {
            driver.quit();
        }


        @Test
        public void createrecruitertab()
        {
            rt.recruitertab();
        }
    }