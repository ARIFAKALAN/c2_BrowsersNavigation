package Validation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_URl {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("httml://www.cnn.com/");
        System.out.println("The current URL of the cnn home page is:"+ driver.getCurrentUrl());

        String title = driver.getCurrentUrl();

        if(title.equals("https://www.cnn.com/")){
            System.out.println("Test Case is Pass");
        } else{
            System.out.println("Test Case is FAIL");
        }

    }
}
