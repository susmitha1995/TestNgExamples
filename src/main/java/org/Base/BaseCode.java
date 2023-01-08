package org.Base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseCode {

   public static ChromeDriver driver;

    public static void startApp(){
        System.setProperty("webdriver.chrome.driver","C:\\SPFM_API\\Automation\\target\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
    }
}
