package com.s3corp.ddt.testNG;

import com.s3corp.ddt.reader.TestCase;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTestFactory {

    @Factory
    public Object[] factoryMethod(){
        return new Object[] {new SimpleTest(new TestCase("Test case 1")), new SimpleTest(new TestCase("Test case 2")), new SimpleTest(new TestCase("Test case 3"))};
    }
}
