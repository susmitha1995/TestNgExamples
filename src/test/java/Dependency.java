import org.testng.annotations.Test;

public class Dependency {

    @Test
    public void tenth(){
        System.out.print("10th Passed");
    }
    @Test(enabled = false)
    public void twelth(){
        System.out.print("12th Passed");
    }
    @Test(dependsOnMethods = "twelth")
    public void engineering(){
        System.out.print("Engineering Passed");
    }

}
