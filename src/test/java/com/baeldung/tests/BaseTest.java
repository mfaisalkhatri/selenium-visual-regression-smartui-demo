package com.baeldung.tests;

import org.testng.annotations.*;

import com.baeldung.drivers.DriverManager;

public class BaseTest {

    protected DriverManager driverManager;

    @BeforeSuite(alwaysRun = true)
    public void testSetup() {
        this.driverManager = new DriverManager();
        this.driverManager.startChromeInCloud();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        this.driverManager.quitDriver();
    }

}
