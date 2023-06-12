package Pages;

import BaseLibrary.Baselibrary;
import PropertyUtility.propertyUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page extends Baselibrary {


    public Register_page()
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath="//*[contains(text(),'Register')]")
       private WebElement Register_Button;

    @FindBy(xpath="//*[@name='organizationName']")
    private WebElement Organization_name;

    @FindBy(xpath = "//*[@name='firstName']")
    private WebElement First_name;

    @FindBy(xpath ="//*[@name='lastName']")
    private WebElement Last_name;

    @FindBy(xpath ="//*[@name='mobileNumber']")
    private WebElement Phone_number;

    @FindBy(xpath ="//*[@name='email']")
    private WebElement  Email_Id;

  @FindBy(xpath = "//*[@name='designation']")
    private WebElement designation;

  @FindBy(xpath = "//*[@name='password']")
  private WebElement password;


    @FindBy(xpath ="//*[@id='mui-11']")
    private WebElement Register_login_button;

    @FindBy(xpath = "(//*[@type='submit'])[last()]")
    private WebElement login_b;

    @FindBy(xpath = "(//*[@type='email'])[last()]")
   private WebElement email_id;

    @FindBy(xpath = "(//*[@type='password'])[last()]")
    private WebElement Password;
    @FindBy(xpath = "//*[contains(text(),'Login')]")
    private WebElement Login_button;
    @FindBy(xpath = "//*[contains(text(),'Recruiter')]")
    private  WebElement recruiter_tab;
    @FindBy(xpath ="//*[contains(text(),'Job Opening')]" )
    private WebElement job_opening;

    @FindBy(xpath ="//*[contains(text(),'Profile')]" )
    private WebElement profile_tab;

    @FindBy(xpath ="//*[contains(text(),'Bulk Uploads')]" )
    private WebElement bulk_upload_tab;
    @FindBy(xpath ="//*[contains(text(),'Masters')]" )
    private WebElement masters_tab;

    @FindBy(xpath ="//*[contains(text(),'Job Role')]" )
    private WebElement job_role_tab;



    public void registertab() {
        try {
            Register_Button.click();
            Thread.sleep(1000);
            Organization_name.sendKeys(propertyUtilities.readdata("organizationname"));
            Thread.sleep(1000);
            First_name.sendKeys(propertyUtilities.readdata("firstname"));
            Thread.sleep(1000);
            Last_name.sendKeys(propertyUtilities.readdata("lastname"));
            Thread.sleep(1000);
            Phone_number.sendKeys(propertyUtilities.readdata("phonenumber"));
            Thread.sleep(1000);
            Email_Id.sendKeys(propertyUtilities.readdata("emailid"));
            Thread.sleep(1000);
            password.sendKeys(propertyUtilities.readdata("Password"));
            Thread.sleep(1000);
            designation.sendKeys(propertyUtilities.readdata("Designation"));
            Thread.sleep(1000);
            Register_login_button.click();
            Thread.sleep(1000);
        } catch (Exception E) {
            //ToDoexception handle
        }
    }
        public void login()
        {
            try{
                login_b.click();
                Thread.sleep(1000);
                email_id.sendKeys(propertyUtilities.readdata("EmailId"));
                Thread.sleep(1000);
                Password.sendKeys(propertyUtilities.readdata("passWord"));
                Thread.sleep(1000);
                Login_button.click();
                Thread.sleep(1000);
                recruiter_tab.click();
                Thread.sleep(5000);
                job_opening.click();
                Thread.sleep(5000);
                profile_tab.click();
                Thread.sleep(5000);
                bulk_upload_tab.click();
                Thread.sleep(5000);
                masters_tab.click();
                Thread.sleep(5000);
                profile_tab.click();
                Thread.sleep(5000);
            }
            catch (Exception E)
            {

            }
        }

    }







//    public pageObject()
//    {
//        PageFactory.initElements(driver, this);
//
//    }

//    @FindBy(xpath="//*[text()='Get Started']")
//    private WebElement getstartbutton;

//
//    @FindBy(xpath = "//*[@name='password']")
//    private WebElement Password;
//    @FindBy(xpath = "//*[@id='mui-3']")
//    private WebElement Login_button;


//    public void setGetstartbutton()
//    {
//        getstartbutton.click();
//    }

