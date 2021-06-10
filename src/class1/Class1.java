package class1;

//exicute by alfabetical order

import org.testng.annotations.Test;

public class Class1 {
    @Test(groups ="sprint")
    public void bClassMethod1(){

        System.out.println("My first test");
     }
    @Test(groups ="sprint")
    public void aClassMethod2(){
        System.out.println("I am second test");
    }
}
