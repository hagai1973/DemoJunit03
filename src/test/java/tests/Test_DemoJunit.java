package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_DemoJunit {

     static WebDriver driver;
     static String baseUrl;

    @BeforeAll
    public static void setup(){
        baseUrl = "https://demoqa.com/text-box";
        driver = utilites.Utils.getDriver("chrome", baseUrl);

    }

    @DisplayName("Practice page")
    @Test
    public void test_1(){
        driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("test test");
        Assertions.assertTrue(2==2);
    }


    @AfterAll
    public static void tearDown(){

        driver.quit();
    }
}
