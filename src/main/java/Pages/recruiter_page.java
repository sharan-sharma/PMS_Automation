package Pages;

import BaseLibrary.Baselibrary;
import PropertyUtility.propertyUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recruiter_page extends Baselibrary{

    public recruiter_page()
        {
            PageFactory.initElements(driver, this);

        }

    @FindBy(xpath = "//*[contains(text(),'Recruiter')]")
    private WebElement recruiter_tab;

    @FindBy(xpath = "//*[contains(text(), \"Create Recruiter\")]")
    private WebElement create_recruiter;

   @FindBy(xpath = "//*[@placeholder=\"Enter the first name\"]")
   private WebElement recruiter_firstname;

    @FindBy(xpath = "//*[@placeholder=\"Enter the last name\"]")
    private WebElement recruiter_lastname;

    @FindBy(xpath = "//*[@placeholder=\"Enter the email id\"]")
    private WebElement recruiter_emailid;

    @FindBy(xpath = "//*[@placeholder=\"Enter the phone number\"]")
    private WebElement recruiter_phonenumber;

    @FindBy(xpath = "//*[contains(text(),\"Save\")]")
    private WebElement recruiter_savebutton;


    public void recruitertab()
    {
        try{
            recruiter_tab.click();
            Thread.sleep(2000);
            create_recruiter.click();
            Thread.sleep(2000);
            recruiter_firstname.sendKeys(propertyUtilities.readdata("recruiterfirstname"));
            Thread.sleep(2000);
            recruiter_lastname.sendKeys(propertyUtilities.readdata("recruiterlastname"));
            Thread.sleep(2000);
            recruiter_emailid.sendKeys(propertyUtilities.readdata("recruiteremailid"));
            Thread.sleep(2000);
            recruiter_phonenumber.sendKeys(propertyUtilities.readdata("recruiterphone"));
            Thread.sleep(2000);
            recruiter_savebutton.click();
            Thread.sleep(2000);

        }
        catch (Exception E)
        {

        }
    }





    }
