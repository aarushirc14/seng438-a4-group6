package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;


public class AmazonAccountLoginTest {
    
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

        // Navigate to Amazon Canada's account login page
        driverValidData.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");        
        
        // maximize the window
        driverValidData.manage().window().maximize();
    
        // Find the input fields 
        WebElement emailInputValid = driverValidData.findElement(By.id("ap_email"));
        WebElement continueButton = driverValidData.findElement(By.id("continue"));

        // Valid inputs
        //NOTE: this is an amazon account I created for testing purposes so the app should consider it valid
        emailInputValid.sendKeys("aarushirc14@gmail.com"); 
        sleep(1000);
        continueButton.click();
        sleep(1000);

        WebElement passwordInputValid = driverValidData.findElement(By.id("ap_password"));
        WebElement signInButton=  driverValidData.findElement(By.id("signInSubmit"));
        passwordInputValid.sendKeys("myfakepassword");
        sleep(1000);
        signInButton.click();
        sleep(3000);


        //TEST whether or not the website directs users to the next expected page when valid data is entered.
        //The expected page after a successful login is the user's homepage
       
        String currentUrl = driverValidData.getCurrentUrl();
        String expectedUrl = "https://www.amazon.ca/dp/B09BS5XWNS/ref=ods_gw_eng_d_h1_erd/?pf_rd_r=7KRX1Z767A2ENC90DEV5&pf_rd_p=753cec41-d62b-473c-8ae9-f775a4bc94bf&pd_rd_r=ef76b247-64fd-47fa-bbe9-aa0819067f1e&pd_rd_w=NQLNr&pd_rd_wg=NJr8P&ref_=pd_gw_unk";

        if (!currentUrl.equals(expectedUrl)) {
            System.out.println("Test failed. The website does not go to the expected page.");
        }

        // Close the browser
        driverValidData.quit();

        //======================================================== Invalid Inputs =============================================================================
        // Create a new instance of the ChromeDriver for the tests with invalid data
        WebDriver driverInvalidData = new ChromeDriver();

        // Navigate to Amazon Canada's account login page
        driverInvalidData.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        
        // maximize the window
        driverInvalidData.manage().window().maximize();
    
    
        // Find the input fields 
        WebElement emailInputInvalid = driverInvalidData.findElement(By.id("ap_email"));
        WebElement continueButton2 = driverInvalidData.findElement(By.id("continue"));

        // Invalid inputs
        emailInputInvalid.sendKeys("aarushirc14@gmail.com"); 
        sleep(1000);
        continueButton2.click();
        sleep(1000);

        WebElement passwordInputInvalid = driverInvalidData.findElement(By.id("ap_password"));
        WebElement signInButton2 = driverInvalidData.findElement(By.id("signInSubmit"));
        passwordInputInvalid.sendKeys("incorrectpassword");
        sleep(1000);
        signInButton2.click();
        sleep(3000);
        
        //TEST whether or not the expected error message is correctly displayed
        WebElement errorMessage = driverInvalidData.findElement(By.id("auth-warning-message-box"));
        if (!errorMessage.isDisplayed()){
            System.out.println("Test failed. Error messages were NOT displayed on GUI when invalid password is provided.");
        }

        // Close the browser
        driverInvalidData.quit();
    }
}
