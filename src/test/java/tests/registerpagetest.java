package tests;

import BaseLibrary.Baselibrary;
import Pages.Register_page;
import PropertyUtility.propertyUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class registerpagetest extends Baselibrary {


        tests.login_page lb;
        Register_page rp;
        @BeforeTest
        public void getlaunch()
        {
            launch(propertyUtilities.readdata("url"));
//            lb=new tests.login_page();
            rp= new Register_page();
        }
    @AfterTest
    public void closeprogram()
    {
        driver.quit();
    }

    @Test(priority = 2)
    public void login_functionality()
    {
        rp.login();
    }


    @Test(priority = 1)
    public void register() throws InterruptedException
        {
          rp.registertab();

        }




}
