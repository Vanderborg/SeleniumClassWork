import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {

        //open the Chrome browser
        WebDriver driver = new ChromeDriver();

        //navigate to amazon
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
       Assert.assertEquals(expectedTitle,actualTitle);

        //type java book on the search bar
        driver.findElement(By.id());

        //click on the search button

        //validation
        Assert.assertEquals( "", "");

    }
}