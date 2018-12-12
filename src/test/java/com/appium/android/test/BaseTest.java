package com.appium.android.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public abstract class BaseTest {

    @BeforeSuite
    public void globalSetup () throws IOException {
//        Global Setup
    }

    @AfterSuite
    public void globalTearDown () {
//      Global Tear Down
    }
}
