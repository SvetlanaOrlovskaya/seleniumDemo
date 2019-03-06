package com.oleg;

import com.oleg.primitives.Button;
import com.oleg.primitives.TextField;
import com.oleg.primitives.TextView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {


        TextField firstName = new TextField(By.name("firstname"),"MainPage -> firstname field");
        TextField lastName = new TextField(By.name("lastname"),"MainPage -> lastname field");
        TextField date = new TextField(By.id("datepicker"),"MainPage -> datepicker field");
        Button submit = new Button(By.name("submit"),"MainPage -> submit button");
        TextView message = new TextView(By.xpath("//p[2]//em"),"MainPage -> message");


        firstName.setText("Ivan");
        lastName.setText("Ivanov");
        date.setText("10.10.1999");
        submit.click();
        message.getText();

        //driver.findElement(By.name("firstname")).sendKeys("Ivan");
        //driver.findElement(By.name("lastname")).sendKeys("Ivanov");
        //driver.findElements(By.name("sex")).get(0).click();
        //driver.findElements(By.name("exp")).get(2).click();
        //driver.findElement(By.id("datepicker")).sendKeys("10.10.1999");
        /*driver.findElements(By.name("profession")).get(1).click();
        driver.findElements(By.name("tool")).get(2).click();
        WebElement mySelectElement= driver.findElement(By.name("continents"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText("Europe");

        WebElement multipleSelectElement= driver.findElement(By.id("selenium_commands"));
        Select multiple= new Select(multipleSelectElement);
        multiple.selectByIndex(0);
        multiple.selectByIndex(1);
*/
        //driver.findElement(By.name("submit")).click();


        //System.out.println(driver.findElement(By.xpath("//p[2]//em")).getText()  );
    }
}
