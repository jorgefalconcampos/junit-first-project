import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommunicationTest extends Hooks{
    private WebDriverWait wait;

    public CommunicationTest() {
        wait = new WebDriverWait(driver, 30);
    }

    public void AddCustomer() {
        driver.get("https://demo.guru99.com/telecom/index.html");
        WebElement link_addCustomer = driver.findElement(By.linkText("Add customer"));
        wait.until(ExpectedConditions.elementToBeClickable(link_addCustomer));
        link_addCustomer.click();
    }

}
