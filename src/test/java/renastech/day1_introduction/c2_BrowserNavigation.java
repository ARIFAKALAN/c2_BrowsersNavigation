package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.Facebook.com");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.get("https://www.apple.com");
        driver.navigate().back();
        Thread.sleep(2000);
        // it will close the tabs
        //driver.close();
        driver.quit();
    }
}
