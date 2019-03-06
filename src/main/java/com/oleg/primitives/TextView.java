package com.oleg.primitives;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextView extends BaseElement {

    public TextView(By selector, String description){
        super(selector, description);
    }

    public String getText() throws InterruptedException {
        String text = get().getText();
        System.out.println("Get text: "+text+" from "+description);
        return text;
    }

}
