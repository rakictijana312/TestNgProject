package class1;

public class PrePostConditionBatch9 {
    public  void beforeTestMethod(){
        System.out.println("I am before method!");
    }
    public  void afterTestMethod(){
        System.out.println("I am after method");
    }
    public void bClassMethod1(){
        System.out.println("My first test B");
    }
    public void aClassMethod2(){
        System.out.println("I am second test A");
    }
    public void aClassMethod3() {

        System.out.println("I am second test C");
    }
    public void tijanaMethod(){
        System.out.println("Zadnji test case!");
    }

}
