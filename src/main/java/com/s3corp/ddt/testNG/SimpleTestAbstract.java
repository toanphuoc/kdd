package com.s3corp.ddt.testNG;

import org.testng.ITestResult;
import org.testng.annotations.*;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTestAbstract {

    @BeforeMethod
    public void setUp(ITestResult result){
        System.out.println("Setup: ");
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if(result.getStatus() == ITestResult.SUCCESS)
            System.out.println("Pass");

        if(result.getStatus() == ITestResult.FAILURE)
            System.out.println("Failure");
    }
}
