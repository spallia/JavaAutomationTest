package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver getDriver(String url) {
        String driver_path = "src/main/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;

    }
}
