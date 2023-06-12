package Pages;

import BaseLibrary.Baselibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkUpload_page extends Baselibrary
{
    public BulkUpload_page()
    {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath ="//*[contains(text(),'Bulk Uploads')]" )
    private WebElement bulk_upload_tab;

    @FindBy(xpath ="//*[@data-testid=\"CloudUploadIcon\"]" )
    private WebElement bulkuploadbutton;

    public void setBulk_upload_tab()

    {
        try
        {
            bulk_upload_tab.click();
            Thread.sleep(4000);
            bulkuploadbutton.findElement(By.xpath("//*[@data-testid=\"CloudUploadIcon\"]")).sendKeys("C:\\Tanya- CV Data");
            Thread.sleep(4000);

        }
        catch(Exception E)
        {

        }
    }

}
