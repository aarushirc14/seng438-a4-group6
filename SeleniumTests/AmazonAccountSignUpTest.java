package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;


public class AmazonAccountSignUpTest {
    
    // Added Pause 
    // This so humans can see the execution a bit slower in real time. Otherwise the executions happen too fast for you to see anything.
    public static void sleep(int time){
       
        try {
            
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //======================================================== Valid Inputs =============================================================================

        // Set system property for ChromeDriver and provide the path to chromedriver.exe saved on your local machine
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Create a new instance of the ChromeDriver for the tests with valid data
        WebDriver driverValidData = new ChromeDriver();

        // Navigate to Amazon Canada's account sign-up or registration page
        driverValidData.get("https://www.amazon.ca/ap/register?_encoding=UTF8&openid.assoc_handle=caflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
        
        // maximize the window
        driverValidData.manage().window().maximize();
    
        // Find the input fields for the sign-up form
        WebElement nameInputValid = driverValidData.findElement(By.id("ap_customer_name"));
        WebElement emailInputValid = driverValidData.findElement(By.id("ap_email"));
        WebElement passwordInputValid = driverValidData.findElement(By.id("ap_password"));
        WebElement confirmPasswordInputValid= driverValidData.findElement(By.id("ap_password_check"));
        WebElement continueButton = driverValidData.findElement(By.id("continue"));

        // Valid data inputs
        nameInputValid.sendKeys("John Doe");
        sleep(1000);
        //NOTE: it will probably say an account with this email already exists as it's not unique. 
        //This is for testing purposes so a real email is not being used, however the email format is valid.
        emailInputValid.sendKeys("JohnDoe@gmail.com"); 
        sleep(1000);
        passwordInputValid.sendKeys("Password123");
        sleep(1000);
        confirmPasswordInputValid.sendKeys("Password123");
        sleep(1000);
        continueButton.click();
        sleep(3000);

        //TEST whether or not the website directs users to the next expected page when valid data is entered.
        //As mentioned in the NOTE above, the email will show as "already exists", so this is the expected page.
       
        String currentUrl = driverValidData.getCurrentUrl();
        String expectedUrl = "https://www.amazon.ca/ap/register/130-3817807-3482440";

        if (!currentUrl.equals(expectedUrl)) {
            System.out.println("Test failed. The website does not go to the expected page.");
        }

        // Close the browser
        driverValidData.quit();

        //======================================================== Invalid Inputs =============================================================================
        
        // Create a new instance of the ChromeDriver for the tests with invalid data
        WebDriver driverInvalidData = new ChromeDriver();

        // Navigate to Amazon Canada's account sign-up or registration page
        driverInvalidData.get("https://www.amazon.ca/ap/register?_encoding=UTF8&openid.assoc_handle=caflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
        
        // maximize the window
        driverInvalidData.manage().window().maximize();
    
    
        // Find the input fields for the sign-up form
        WebElement nameInputInvalid = driverInvalidData.findElement(By.id("ap_customer_name"));
        WebElement emailInputInvalid = driverInvalidData.findElement(By.id("ap_email"));
        WebElement passwordInputInvalid = driverInvalidData.findElement(By.id("ap_password"));
        WebElement confirmPasswordInputInvalid= driverInvalidData.findElement(By.id("ap_password_check"));
        WebElement continueButton2 = driverInvalidData.findElement(By.id("continue"));

        // Invalid data inputs
        nameInputInvalid.sendKeys("J1256");
        sleep(1000);
        emailInputInvalid.sendKeys("gmail ");
        sleep(1000);
        passwordInputInvalid.sendKeys("Password123");
        sleep(1000);
        confirmPasswordInputInvalid.sendKeys("Password12"); //mismatched password
        sleep(1000);
        continueButton2.click();
        sleep(3000);
        
        //TEST whether or not the expected error message is correctly displayed
        WebElement errorMessage = driverInvalidData.findElement(By.id("auth-password-mismatch-alert"));
        if (!errorMessage.isDisplayed()){
            System.out.println("Test failed. Error messages were NOT displayed on GUI when invalid sign up information is provided.");
        }

        // Close the browser
        driverInvalidData.quit();
    }
}

