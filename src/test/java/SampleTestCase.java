import org.testng.annotations.Test;

public class SampleTestCase {

    @Test(priority=0, enabled = false)
    public void firstmainTestCase(){
        System.out.print("firstmainTestCase");
    }
//    @Test(priority=1)
//    public void secondTestCase(){
//        System.out.print("secondTestCase");
//    }
//    @Test(priority=2)
//    public void thirdTestCase(){
//        System.out.print("thirdTestCase");
//    }
//    @Test(priority=3)
//    public void firstTestCase(){
//        System.out.print("firstTestCase");
//    }

}
