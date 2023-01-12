import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

public class TestFacebook {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        try{

            if (driver.getTitle().equals("Facebook")) System.out.println("Title validation is PASSED");
            else System.out.println("Title validation is FAILED");

            if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
            else System.out.println("URL validation FAILED");

            WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
            if (logo.isDisplayed()) System.out.println("Logo validation PASSED");
            else System.out.println("Logo validation FAILED");

            WebElement heading2 = driver.findElement(By.cssSelector("h2[class='_8eso']"));
            if (heading2.isDisplayed()) System.out.println("Heading validation PASSED");
            else System.out.println("Heading validation is FAILED");

            WebElement emailOrPhoneNumber = driver.findElement(By.id("email"));
            if (emailOrPhoneNumber.isDisplayed()) System.out.println("Email validation is PASSED");
            else System.out.println("Email validation FAILED");

            WebElement password = driver.findElement(By.id("pass"));
            if (password.isDisplayed()) System.out.println("Password validation PASSED");
            else System.out.println("Password validation is FAILED");

            WebElement logInButton = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
            if (logInButton.isDisplayed()) System.out.println("Login button validation PASSED");
            else System.out.println("Login button validation FAILED");

            WebElement forgotPasswordlink = driver.findElement(By.cssSelector("div[class='_6ltj']"));
            if (forgotPasswordlink.isDisplayed()) System.out.println("Forgot password link validation PASSED");
            else System.out.println("Forgot password link validation FAILED");

            WebElement createNewAccountButton = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
            if (createNewAccountButton.isDisplayed()) System.out.println("Create new account button is PASSED");
            else System.out.println("Create new account button is FAILED");

        }catch (Exception e){
        }

        finally {
            driver.quit();
        }
    }
}
