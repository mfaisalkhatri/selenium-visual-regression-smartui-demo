package com.baeldung.pages;

import java.text.MessageFormat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CameraProductPage {

    private final WebDriver driver;

    public CameraProductPage(final WebDriver driver) {
        this.driver = driver;
    }

    private static final String SCREEN_NAME = "Camera-Product-Page";

    public void checkVisual() {
        ((JavascriptExecutor) this.driver).executeScript(MessageFormat.format("smartui.takeScreenshot={0}", SCREEN_NAME));
    }

}
