import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {



    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    //General Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 8);
    }

    //General send keys + clear before
    public void click(WebElement element){
       js.executeScript("arguments[0].scrollIntoView(true);", element);
       wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }
