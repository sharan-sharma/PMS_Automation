package BaseLibrary;

import PropertyUtility.propertyUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class Baselibrary {
    public static WebDriver driver;
    public static void launch(String URL)  {
        System.setProperty("webdriver.chrome.driver", "E:\\PMS\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

         driver.findElement(By.xpath("//*[text()='Get Started']")).click();
         driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys(propertyUtilities.readdata("EmailId"));
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(propertyUtilities.readdata("passWord"));
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

    }



}

