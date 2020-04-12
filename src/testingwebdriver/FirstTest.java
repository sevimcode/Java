

package testingwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


public class FirstTest {

    public static void main ( String[] args ) {


        File gecko = new File("/Users/sevim/webdrivers");
        System.setProperty("webdriver.gecko.driver", gecko.getAbsolutePath ());

        WebDriver driver = new FirefoxDriver ();  //invokes the firefox browser

        driver.get("https://myloyola.luhs.org/mychart");  // open this URL in firefox browser

        WebElement username = driver.findElement ( By.name ("myLoyola Username") ); //finds username element with its name
        username.sendKeys ("msurucu" );  //enters username
        driver.findElement ( By.name ("Password") ); //finds password element by its name
        username.sendKeys ("Kelebek123" );  // enters password
        driver.findElement ( By.name ("submit") ). click (); // clicks sign in button
        //String expectedTitle = "";
        String actualTitle = driver.getTitle (); //returns the actual title of the next page
        // validation verification

        System.out.println (actualTitle);
//        if (expectedTitle.equals ( actualTitle ))
//        {
//            System.out.println (" Login test is passed!");
//        }
//        else
//        {
//            System.out.println (" Login test is failed!");
//        }


    }


}
