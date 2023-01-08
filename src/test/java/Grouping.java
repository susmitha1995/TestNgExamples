import org.testng.annotations.Test;

public class Grouping {

    @Test(groups={"Apple"})
    public void Apple(){
        System.out.print("Apple");
    }
    @Test(groups={"Apple"})
    public void Apple1(){
        System.out.print("Apple");
    }
    @Test(groups={"Lenova"})
    public void Lenova(){
        System.out.print("Lenova");
    }
    @Test(groups={"Lenova"})
    public void Lenova1(){
        System.out.print("Lenova");
    }
}
