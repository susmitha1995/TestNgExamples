import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.Base.BaseCode.driver;

public class ParallelTesting {

    ChromeDriver driver;
    //if one dont depend on other , we can run parallely all test cases to reduce time we can go for parallel testing
    // alternate we can use grid concept in selenium
@Test
 public void openGoogle(){
    System.setProperty("webdriver.chrome.driver","C:\\SPFM_API\\Automation\\target\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
    driver.get("https://www.google.com/");
 }
 @Test
 public void openYahoo(){
     System.setProperty("webdriver.chrome.driver","C:\\SPFM_API\\Automation\\target\\drivers\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
     driver.get("https://in.search.yahoo.com/?fr2=inr");
 }


}
