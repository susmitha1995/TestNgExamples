import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LaunchBrowser {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\SPFM_API\\Automation\\target\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement element =driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        element.sendKeys("Admin"+ Keys.TAB);
        element =driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        element.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.quit();
    }
}
