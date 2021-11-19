import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTest extends Hooks {

    private WebDriverWait wait;

    public GoogleTest(){
        wait = new WebDriverWait(driver,30);
    }

    @Test
    public void GoogleTest() throws InterruptedException{
        driver.get("https://www.google.com");
        WebElement searchBar = driver.findElement(By.name("q"));

        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys("prueba");

        //it also can be done by Xpath: Open DevTools > right click on HTMl element > copy > copy Xpath (relative)
        WebElement searchButton = driver.findElement(By.name("btnK"));

        wait.until(ExpectedConditions.elementToBeClickable(searchBar));
        searchButton.click();

        searchBar.isDisplayed();

        Thread.sleep(5000);
    }
}
