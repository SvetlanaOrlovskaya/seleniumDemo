package com.oleg.primitives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class BaseElement {
    protected static WebDriver driver;
    protected By selector;
    protected String description;

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-form/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BaseElement(By selector, String description){
        this.selector=selector;
        this.description=description;
    }

    public WebElement get() throws InterruptedException {
        WebElement elem=driver.findElement(selector);
        highlightElement(elem);
        return elem;
    }


    protected static void highlightElement(WebElement element) throws InterruptedException {
        for (int i = 0; i <2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
            Thread.sleep(500);
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
            Thread.sleep(500);
        }
    }
}
