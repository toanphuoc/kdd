package com.s3corp.ddt.testNG;

import com.s3corp.ddt.reader.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTest extends SimpleTestAbstract {

    private TestCase testCase;

    public SimpleTest(TestCase testCase){
        this.testCase = testCase;
    }

    @Test
    public void execute(){
        Assert.assertEquals(testCase.getCaseName(), "Toan");
    }
}
