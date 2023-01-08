import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    @Test
    @Parameters("Name")
    public void printName(String s){
        System.out.print("Name is"+s);
    }
}
