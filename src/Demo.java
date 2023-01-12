import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/viktoriiamilian/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();//Instantiating Chrome driver

        driver.get("https://wwww.google.com/");// Navigate to our URL
        driver.manage().window().fullscreen();

        String title = driver.getTitle();// Get the drivers of the Web page
        System.out.println(title);
        driver .quit();// Quit the driver instance



    }
}
