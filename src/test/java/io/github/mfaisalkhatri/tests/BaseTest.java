package io.github.mfaisalkhatri.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.mfaisalkhatri.drivers.DriverManager;

public class BaseTest {

    protected DriverManager driverManager;

    @BeforeTest(alwaysRun = true)
    public void testSetup() {
        this.driverManager = new DriverManager();
        this.driverManager.startChromeInCloud();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        this.driverManager.quitDriver();
    }

}
