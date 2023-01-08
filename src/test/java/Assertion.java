import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void checkEqual(){

        //developers themself checks thier code before sending to testing team - Self reviewing (Unit testing Assertion)
        //AssertTrue
        //AssertEqual
        //AssertNotEqual
        //AssertFalse

        int a =5;
        Assert.assertFalse(a>0,"a should be greater than zero");

       int b=5;
       Assert.assertEquals(a,b,"should be equal");
    }
}
