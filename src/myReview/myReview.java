package myReview;



//HW: TestNG and use assertions
//        TC 1: HRMS blank password validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Enter valid username and leave password field empty
//        Click on login button
//        Verify error message with text "Password cannot be empty" is displayed


//        TC 2: HRMS blank username and password validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Leave username and password field empty
//        Click on login button
//        Verify error message with text "Username cannot be empty" is displayed
//
//        TC 2: HRMS invalid credentials validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Enter valid username and wrong password
//        Click on login button
//        Verify error message with text "Invalid credentials" is displayed
//
//        TC:4 --> do on selenium project
//        Go to http://www.uitestpractice.com/
//        interact with drag and drop, iframe, double click
//        click on home
//        delete one user from the table
//        go to the next link
//        click on the ajax link and wait for the text
//        verify that the text is displayed
//        go to Form
//        and fill out everything
//        go to widgets
//        upload any file and verify it is uploaded
//        go to actions and perform all the necessary actions
//        go to SwitchTo
//        work with alerts and frames
//        go to select
//        perform actions on all dropdowns


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class myReview {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
        @Test(priority = 1)
        public void login() throws InterruptedException {
        driver.findElement(By.id(" txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);






        }






    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
