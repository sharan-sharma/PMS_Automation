package tests;

import BaseLibrary.Baselibrary;
import Pages.BulkUpload_page;
import Pages.JobRole_page;
import PropertyUtility.propertyUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BulkUploadTest extends Baselibrary {


    BulkUpload_page bp;


    @BeforeTest
    public void getlaunch() {
        launch(propertyUtilities.readdata("url"));
//            lb=new tests.login_page();
        bp = new BulkUpload_page();
    }

    @AfterTest
    public void closeprogram() {
        driver.quit();
    }


    @Test

    public void bulkuploadtab()
    {
        bp.setBulk_upload_tab();
    }

}
