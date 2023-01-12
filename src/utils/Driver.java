package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    //Set up method

    private static WebDriver driver;
    private Driver(){
    }
    public static WebDriver getDriver(){
       if (driver == null){
           System.setProperty("webdriver.chrome.driver","/Users/viktoriiamilian/IdeaProjects/initial_selenium_project_5/chromedriver");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
       }
        return driver;
    }


    public static void quitDriver(){
        if (driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

    public static void clickOnCard(int cardNumber){
        Driver.getDriver().findElement(By.id("card-" + cardNumber)).click();
    }
}
