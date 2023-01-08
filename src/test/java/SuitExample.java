import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.Base.BaseCode.driver;
import static org.Base.BaseCode.startApp;

public class SuitExample {

    long endTime;
    long startTime;

    @BeforeTest
    public void startTime(){
        startTime = System.currentTimeMillis();
    }
    @Test
    public void openGoogle(){
        startApp();
        driver.get("https://www.google.com/");
    }
    @AfterTest
    public void endTime(){
        endTime = System.currentTimeMillis();
        long total_time = endTime-startTime;
        System.out.print(total_time);
    }
}
