package com.oleg.primitives;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.oleg.primitives.BaseElement.highlightElement;

public class Button extends TextView {

    public Button( By selector, String description){
        super(selector, description);
    }

    public void click() throws InterruptedException {
        get().click();
        System.out.println("Click to "+description);
    }


}
