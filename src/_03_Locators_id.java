import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {

        /*
        Go to techglobal training page.
        Validate the company logo is displayed
         */

        //1. Set up - before action
        System.setProperty("webdriver.chrome.driver","/Users/viktoriiamilian/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Validate - action

        driver.get("https://techglobal-training.netlify.app/");
        Thread.sleep(2000);

        //Locate the logo and validate if it displayed
        WebElement logo = driver.findElement(By.id("logo"));
        if (logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation failed");
        logo.isDisplayed();//true

        System.out.println(logo.isEnabled());
        System.out.println(logo.isSelected());

        //3. Teardown

        driver.quit();


    }
}
