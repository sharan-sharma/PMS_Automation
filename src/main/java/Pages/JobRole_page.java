package Pages;

import BaseLibrary.Baselibrary;
import PropertyUtility.propertyUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobRole_page extends Baselibrary
    {
    public JobRole_page()
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[contains(text(),'Masters')]")
    private WebElement masters_tab;

    @FindBy(xpath = "//*[contains(text(),'Job Role')]")
    private WebElement job_role_tab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/button")
    private WebElement create_job_role;

    @FindBy(xpath = "//*[@placeholder=\"Enter the job role\"]")
    private WebElement job_role_name;
    @FindBy(xpath = "//*[@placeholder=\"Enter the description\"]")
    private WebElement job_description;
    @FindBy(xpath = "//*[contains(text(),\"Save\")]")
    private WebElement job_save_button;

  public void setJob_role_tab()
  {
      try
      {
          masters_tab.click();
          Thread.sleep(4000);
          job_role_tab.click();
          Thread.sleep(4000);
          create_job_role.click();
          Thread.sleep(4000);
          job_role_name.sendKeys(propertyUtilities.readdata("job_role"));
          Thread.sleep(4000);
          job_description.sendKeys(propertyUtilities.readdata("description"));
          Thread.sleep(4000);
          job_save_button.click();
          Thread.sleep(4000);

      }
      catch(Exception E)
       {

       }

  }




}