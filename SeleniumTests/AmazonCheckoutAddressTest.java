package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AmazonCheckoutAddressTest {

    // Pause to wait for items to load on page
    public static void sleep(int time){
       
        try {
            
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
         // Input valid address after trying to checkout Kindle
        WebDriver driver_valid_address = new ChromeDriver(options);

        driver_valid_address.get("https://www.amazon.ca/");
        driver_valid_address.manage().window().setSize(new Dimension(1294, 1400));

        driver_valid_address.findElement(By.id("twotabsearchtextbox")).click();
        driver_valid_address.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
        driver_valid_address.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver_valid_address.findElement(By.cssSelector(".sg-col-4-of-24:nth-child(3) .a-size-base-plus:nth-child(1)")).click();
        sleep(3000);
        driver_valid_address.findElement(By.cssSelector(".a-icon-radio-inactive")).click();

        sleep(3000);
        driver_valid_address.findElement(By.id("buy-now-button")).click();


        // Find the input fields 
        WebElement emailInputValid = driver_valid_address.findElement(By.id("ap_email"));
        WebElement continueButton = driver_valid_address.findElement(By.id("continue"));

        // Valid inputs
        // NOTE: this is an amazon account I created for testing purposes so the app should consider it valid
        emailInputValid.sendKeys("lukerent43@gmail.com"); 
        sleep(1000);
        continueButton.click();
        sleep(1000);

        WebElement passwordInputValid = driver_valid_address.findElement(By.id("ap_password"));
        WebElement signInButton=  driver_valid_address.findElement(By.id("signInSubmit"));
        passwordInputValid.sendKeys("test123");
        sleep(1000);
        signInButton.click();
        sleep(3000);
 

        driver_valid_address.findElement(By.id("addressChangeLinkId")).click();
        sleep(10000);
        driver_valid_address.findElement(By.linkText("Add a new address")).click();

        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressFullName")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Luke Son");
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("5877076321");
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressLine1")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("jboh12nj321");
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("askd");
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressCity")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Calgary");
        driver_valid_address.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion .a-button-text")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_11")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).click();
        driver_valid_address.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("T1G2L4");
        driver_valid_address.findElement(By.cssSelector("#address-ui-widgets-form-submit-button .a-button-input")).click();
        sleep(3000);
        // WebElement errMessage = driver_invalid_address.findElement(By.className("a-alert-content"));
        try {
            WebElement submitButton = driver_valid_address.findElement(By.xpath("//span[contains(@class,'a-button-text')]"));
        } catch(Exception e) {
            System.out.println("address should've been inputted correctly and option to change address should've been created");
        }


        driver_valid_address.quit();

         // Input invalid address after trying to checkout Kindle
        WebDriver driver_invalid_address = new ChromeDriver(options);

        driver_invalid_address.get("https://www.amazon.ca/");
        driver_invalid_address.manage().window().setSize(new Dimension(1294, 1400));

        driver_invalid_address.findElement(By.id("twotabsearchtextbox")).click();
        driver_invalid_address.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
        driver_invalid_address.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver_invalid_address.findElement(By.cssSelector(".sg-col-4-of-24:nth-child(3) .a-size-base-plus:nth-child(1)")).click();
        sleep(3000);
        driver_invalid_address.findElement(By.cssSelector(".a-icon-radio-inactive")).click();

        sleep(3000);
        driver_invalid_address.findElement(By.id("buy-now-button")).click();


        // Find the input fields 
        emailInputValid = driver_invalid_address.findElement(By.id("ap_email"));
        continueButton = driver_invalid_address.findElement(By.id("continue"));

        // Valid inputs
        //NOTE: this is an amazon account I created for testing purposes so the app should consider it valid
        emailInputValid.sendKeys("lukerent43@gmail.com"); 
        sleep(1000);
        continueButton.click();
        sleep(1000);

        passwordInputValid = driver_invalid_address.findElement(By.id("ap_password"));
        signInButton=  driver_invalid_address.findElement(By.id("signInSubmit"));
        passwordInputValid.sendKeys("test123");
        sleep(1000);
        signInButton.click();
        sleep(3000);
 

        driver_invalid_address.findElement(By.id("addressChangeLinkId")).click();
        sleep(10000);
        driver_invalid_address.findElement(By.linkText("Add a new address")).click();

        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressFullName")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Luke Son");
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("5877076321");
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressLine1")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("jboh12nj321");
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("askd");
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressCity")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("d");
        driver_invalid_address.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion .a-button-text")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_11")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).click();
        driver_invalid_address.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("d");
        driver_invalid_address.findElement(By.cssSelector("#address-ui-widgets-form-submit-button .a-button-input")).click();
        sleep(3000);
        // WebElement errMessage = driver_invalid_address.findElement(By.className("a-alert-content"));

        WebElement errMessage = driver_invalid_address.findElement(By.xpath("//div[contains(@class,'a-alert-content')]//div[contains(@class,'a-section')]"));
        String expectedMessage = "We couldn't verify your address. Please make sure it's correct before you save it.";
        System.out.println(errMessage.getText());
        if(!expectedMessage.equals((errMessage.getText()))) {
            System.out.println("err msg not found");
        }


        driver_invalid_address.quit();
    }
}
