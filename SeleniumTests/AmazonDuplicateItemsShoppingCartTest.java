import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AddItemtoshoppingCartTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addItemtoshoppingCart() {

    // Open Amazon
    driver.get("https://www.amazon.ca/");

    // Set window size to 1296 1440
    driver.manage().window().setSize(new Dimension(1296, 1440));

    // Scroll down to carousels for shopping items
    js.executeScript("window.scrollTo(0,4000)");

    // Click on item: "All-New Echo Dot (5th Gen, 2022 release) | Smart speaker with Alexa | Charcoal"
    driver.findElement(By.xpath("//div[contains(text(),\"All-New Echo Dot (5th Gen, 2022 release) | Smart speaker with Alexa | Charcoal\")]")).click();
    
    // Click Add to Cart Button
    driver.findElement(By.id("add-to-cart-button")).click();
    
    // Pause for 1000 millis
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Close popup 
    driver.findElement(By.cssSelector(".a-button-close")).click();

    // Open Shopping Cart
    driver.findElement(By.cssSelector(".nav-cart-icon")).click();

    // Verify shopping cart has 1 item by checking text: "Subtotal (1 item):"
    assertThat(driver.findElement(By.id("sc-subtotal-label-buybox")).getText(), is("Subtotal (1 item):"));
    
    // Click on Qualitity Dropdown
    driver.findElement(By.id("a-autoid-1-announce")).click();
    
    // Change quanitity to 5
    driver.findElement(By.id("quantity_5")).click();
    
    // Pause for 1000 millis
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Verify shopping cart has 5 item by checking text: "Subtotal (5 items):"
      assertThat(driver.findElement(By.id("sc-subtotal-label-buybox")).getText(), is("Subtotal (5 items):"));

    // Clicking Delete to remove item from shopping cart
    driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();

    // Verifying Shopping cart is empty by checking text: "Your Amazon Cart is empty."
    assertThat(driver.findElement(By.cssSelector(".a-row > .a-spacing-top-base")).getText(), is("Your Amazon Cart is empty."));
    
    // Close the driver
    driver.close();
  }
}
