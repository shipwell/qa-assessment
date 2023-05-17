import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FrontendTest {

    public static void main(String[] args) {

        /*
            You may use whichever browser/driver you choose
        */
        System.setProperty("webdriver.chrome.driver", "<location of your chromedriver executable>");
        WebDriver driver =new ChromeDriver();

    }

    /*
        Using the URL below, perform a basic test to verify the web page title before proceeding
    */
    @Test
    public void Valid_Title() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }
    /*
        For the below URL:
            1. Under the section Single Input Field, set the value in the message field to "QA assessment trial #1"
            2. Click 'Show Message' button
            3. Assert that "Your Message" matches "QA assessment trial #1"
    */
    @Test
    public void Single_Input_Message_Field() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }
    /*
        For the below URL:
            1. Under the section Two Input Fields, set any numeric value in the "Enter a" field and "Enter b" fields
            2. Click 'Get Total' button
            3. Assert that the "Total a + b =" field field contains the numeric sum of the "a" and "b" field values
    */
    @Test
    public void Two_Input_Fields_Total() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }
    /*
        For the below test cases:
            1. Under the Multiple Checkbox Demo section, review the three bullet items describing the checkbox behavior
            2. Note the following three test cases map to the three bullet items
            3. Complete the test script for each test case to verify the behavior described in each bullet item
    */
    @Test
    public void Check_All_Checkboxes() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }

    @Test
    public void UncheckAll_Button_Change() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }

    @Test
    public void CheckAll_Button_Change() {
        driver.get("https://demo.seleniumeasy.com");
        // your test script goes here

    }

}