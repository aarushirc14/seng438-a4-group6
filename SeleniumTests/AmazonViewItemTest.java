package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class AmazonViewItemTest {

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
        
        
        // //Testing to see if user ends up on intended item
 
        String expectedItemName = "Kindle (2022 release) – The lightest and most compact Kindle, now with a 6” 300 ppi high-resolution display, and 2x the storage - Black";

        // // View item (Amazon Kindle) from search bar
        WebDriver driver_search_action = new ChromeDriver(options);
        driver_search_action.get("https://www.amazon.ca/");
        driver_search_action.manage().window().setSize(new Dimension(1294, 1400));

        driver_search_action.findElement(By.id("twotabsearchtextbox")).click();
        driver_search_action.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
        driver_search_action.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        sleep(3000);
        driver_search_action.findElement(By.cssSelector(".sg-col-4-of-24:nth-child(3) .s-image:nth-child(1)")).click();
        
        //Testing to see if user ends up on intended item
        WebElement actualItemName = driver_search_action.findElement(By.id("productTitle"));

        if (!expectedItemName.equals(actualItemName.getText())) {
            System.out.println("Test failed. The item accessed is incorrect");
        }

        driver_search_action.quit();
    }
}