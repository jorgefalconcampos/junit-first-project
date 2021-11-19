import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hooks {

    private static String browser = "firefox";
    protected  static WebDriver driver;

    @BeforeClass
    public static void Setup() {
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else if (browser.equals("iexplorer")) {
            System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
        }

    }




    @AfterClass
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();

    }



}
