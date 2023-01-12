import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _10_Child_Element {
    public static void main(String[] args) {


        WebDriver driver= Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

       List<WebElement> headerItems = driver.findElements(By.cssSelector("#comp-"));

       String[] expectedText = {"HOME","INTRO SESSION", " APPLY NOW", "COURSES", "CONTACTS"};

        int i = 0;

        for (WebElement headerrItem : headerItems) {
            System.out.println(headerrItem.getText());
            System.out.println(headerrItem.isDisplayed());
            System.out.println(headerrItem.isEnabled());
        }



    }
}
