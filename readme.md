## Test Scenario 1

Given: The Camera Product Page image on LambdaTest ECommerce Website is set as Baseline image
When: The Camera Product Page is compared with the Printer & Scanners product page.
Then: The visual differences should be shown in the Smart UI tool

Steps:

1. Set the baseline image by setting the "smartUI.baseline" to true and update the camera page link in the test
2. Update the "smartUI.baseline" to false Re-run the test by updating the link to printer and scanners page

## Scenario 2

Given: The LambdaTest ECommerce Website's homepage is set as Baseline image
When: The Baseline image of home page is compared with LambdaTest ECommerce home page
Then: It should not show any difference

1. Set the baseline image by setting the "smartUI.baseline" to true and update the camera page link in the test
2. Update the "smartUI.baseline" to false Re-run the test by updating the link to homepage again

