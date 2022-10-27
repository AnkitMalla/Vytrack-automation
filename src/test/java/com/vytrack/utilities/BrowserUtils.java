package com.vytrack.utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BrowserUtils {
    //methods are static because we do not want to create an object to call this method. we just want to call them by class name.
    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            System.out.println("Exception happened in sleep method");
        }
    }

    //title verification util
    //name= verifyTitle
    //return type = void
    //arg1 = webDriver
    //arg2 = string expectedTitle

    public static void verifyTitle( String expectedTitle){

        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    public static void waitForInvisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
