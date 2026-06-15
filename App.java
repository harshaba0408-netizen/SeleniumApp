import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Use Chromium browser
        options.setBinary("/snap/bin/chromium");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.quit();
    }
}
