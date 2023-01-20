package com.frontend;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import com.frontend.propertyreader.PropertyReader;
import com.frontend.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;

import java.io.IOException;

public class Hooks extends Utility {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {


        String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
        try {
            Reporter.addScreenCaptureFromPath(screenShotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        closeBrowser();
    }


}




