package com.oleg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-form/");
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ivan");
        driver.findElement(By.name("lastname")).sendKeys("Ivanov");
        driver.findElements(By.name("sex")).get(0).click();
        driver.findElements(By.name("exp")).get(2).click();
        driver.findElement(By.id("datepicker")).sendKeys("10.10.1999");
        driver.findElements(By.name("profession")).get(1).click();
        driver.findElements(By.name("tool")).get(2).click();
        WebElement mySelectElement= driver.findElement(By.name("continents"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText("Europe");

        WebElement multipleSelectElement= driver.findElement(By.id("selenium_commands"));
        Select multiple= new Select(multipleSelectElement);
        multiple.selectByIndex(0);
        multiple.selectByIndex(1);

        driver.findElement(By.name("submit")).click();


        System.out.println(driver.findElement(By.xpath("//p[2]//em")).getText()  );
    }
}
