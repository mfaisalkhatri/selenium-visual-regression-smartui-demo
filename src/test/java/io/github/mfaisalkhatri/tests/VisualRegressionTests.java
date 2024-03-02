package io.github.mfaisalkhatri.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.mfaisalkhatri.pages.CameraProductPage;

public class VisualRegressionTests extends BaseTest {

    private CameraProductPage cameraProductPage;

    @BeforeClass
    public void setup() {
        cameraProductPage = new CameraProductPage(this.driverManager.getDriver());
    }

    @Test
    public void testOne_whenActualImageIsDifferentFromBaseline_thenItShouldShowDifference() {

        this.driverManager.getDriver()
            .get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=30");

        cameraProductPage.checkVisual();
    }

    @Test
    public void testTwo_whenActualImageIsSameAsBaseline_thenItShouldNotShowAnyDifference() {
        this.driverManager.getDriver()
            .get("https://ecommerce-playground.lambdatest.io");

        cameraProductPage.checkVisual();
    }
}
