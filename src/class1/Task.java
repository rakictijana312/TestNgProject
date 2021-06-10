package class1;
import org.testng.annotations.Test;


class Task {
    @Test
    public void getUrl(){
        System.out.println("Acces to website");
    }
    @Test
    public void logIn(){
        System.out.println("Put log in credentionals!");
    }
    @Test
    public void quit(){
        System.out.println("Quit browser!");
    }
    public void test2(){
        System.out.println("Test 2");
    }
    public void report(){
        System.out.println("Submit report");
    }

}
