package Junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverPracticeTest {

    @Test
    void wd() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.google.com";
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.name("q"));
        Cookie cookie = new Cookie("user_session",
                "-81m_tmyd2L-gzjpV1sF1O-M6ClVIBOtbbUjUqvHRATw0we2");
        //   WebElement searchboxs = driver.findElements(By.name("q"));
        String currentUrl = driver.getCurrentUrl();
        searchbox.sendKeys("selenium.dev/");
        searchbox.submit();
        // System.out.println("current URL ->" + currentUrl);
        //  assertEquals(currentUrl, "https://www.google.com/");
        driver.navigate().to("https://www.github.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        //    String title = driver.getTitle().toLowerCase(Locale.ROOT);
        //  System.out.println("title -> " + title);
        Cookie tz = driver.manage().getCookieNamed("tz");
        System.out.println("tz: " + tz);

        driver.quit();

    }
}
