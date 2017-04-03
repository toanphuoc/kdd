package com.s3corp.ddt.testNG;

import com.s3corp.ddt.reader.TestCase;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTest extends SimpleTestAbstract {

    private TestCase testCase;

    public SimpleTest(TestCase testCase){
        this.testCase = testCase;
    }

//    @BeforeMethod
//    public void setUp(){
//        //System.out.println("Setup");
//    }

    @Test(singleThreaded = true)
    public void execute(){
        System.out.println(testCase.getCaseName());
        Assert.assertEquals(testCase.getCaseName(), "Test case 1");
//        Assert.assertNotNull(testCase.getTestSteps());
    }

//    @AfterMethod
//    public void tearDown(ITestResult result){
//        if(result.getStatus() == ITestResult.SUCCESS)
//            System.out.println("Pass");
////        System.out.println(result.getTestName());
//        if(result.getStatus() == ITestResult.FAILURE)
//            System.out.println("Failure");
//    }
}
