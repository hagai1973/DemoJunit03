package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {


    public static WebDriver getDriver(String browser, String baseURL){
        WebDriver driver = null;

        if (browser.toLowerCase().equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\jars\\drivers\\chrome\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
                        options.addArguments("--start-maximized");
                        options.addArguments("--incognito");

            driver = new ChromeDriver(options);
        }
        else if (browser.toLowerCase().equals("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\data\\jars\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else
            System.out.println("No browser found");

        //get base url for testing
        driver.get(baseURL);

        //Max window
        //driver.manage().window().maximize();
        return driver;


    }
}
