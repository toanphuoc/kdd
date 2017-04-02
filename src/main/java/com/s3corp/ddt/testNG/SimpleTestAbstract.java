package com.s3corp.ddt.testNG;

import org.testng.annotations.*;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTestAbstract {

    @BeforeMethod
    public void setUp(){
        System.out.println("Setup");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Teardown");
    }
}
