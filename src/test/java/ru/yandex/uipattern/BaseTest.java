package ru.yandex.uipattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
  

public class BaseTest {
    @Before
    public void setup() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //WebDriverManager.firefoxdriver().setup();
       //driver = new FirefoxDriver();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    WebDriver driver;

   @After
   public void tearDown() {
       driver.quit(); // Закрыть браузер
   }
}
