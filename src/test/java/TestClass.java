import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void executeTest(){
        WebDriverManager.chromedriver().setup(); // System.setProperty()-ის დინამიური ალტერნატივა
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Forgot Password")).click();

        driver.findElement(By.id("email")).sendKeys("cotneaburjania@gmail.com");
        driver.findElement(By.id("form_submit")).click();

        driver.quit();
    }

}
